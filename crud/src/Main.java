import java.sql.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final String URL = "jdbc:mariadb://192.168.0.210:3306/hs.an";
    public static final String USERNAME = "hs.an";
    public static final String PASSWORD = "W0u]fyE3VXd1A5a2";
    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws SQLException {
        Connection conn;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            conn.setAutoCommit(false);

            String sql = "show tables from `hs.an`";
            PreparedStatement pt = conn.prepareStatement(sql);
            ResultSet rs = pt.executeQuery();

            logger.info(rs.getStatement().toString());
            while (rs.next()) {
                logger.info("table name : " + rs.getString("tables_in_hs.an"));
            }

            while (true) {
                crud(conn);
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    /**
     * TODO
     * 1. 테이블 생성
     * 2. 데이터 인서트
     * 3. 데이터 업데이트
     * 4. 데이터 인서트 (PK 중복)
     * 트랜잭션 보장 필요
     */

    public static void crud(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);
        logger.info("명령어 입력 : 1. create (테이블 생성) / 2. insert (데이터 인서트) / 3. update (데이터 업데이트) / 4. exit (프로그램 종료)");
        logger.info("> ");
        String command = sc.next();

        ResultSet rs;
        if (command.equals("create")) {
            createTable(conn);
        } else if (command.equals("insert")) {
            insert(conn);
        } else if (command.equals("update")) {
            rs = update(conn);
        } else if (command.equals("exit")) {
            logger.info("프로그램 종료!");
            System.exit(0);
        }
    }

    public static void createTable(Connection conn) throws SQLException {
        String sql = "create table if not exists test (" +
                "id int(10) primary key," +
                "name varchar(32) not null," +
                "create_date date" +
                ");";
        Statement st = conn.createStatement();
        st.executeUpdate(sql);
    }

    public static void insert(Connection conn) throws SQLException {
        try {
            PreparedStatement insert = conn.prepareStatement("insert into test (id, name, create_date) values (?, ?, now())");

            Scanner sc = new Scanner(System.in);
            logger.info("id name 을 입력해주세요. ex) 1 테스트");
            logger.info("> ");

            String[] insertParams = sc.nextLine().split(" ");
            int id = Integer.parseInt(insertParams[0]);
            String name = insertParams[1];

            insert.setInt(1, id);
            insert.setString(2, name);

            PreparedStatement select = conn.prepareStatement("select id, name from test where id = ?");
            select.setInt(1, id);

            ResultSet selectResultSet = select.executeQuery();

            boolean existingId = selectResultSet.next();

            if (existingId) {
                logger.info("이미 존재하는 id 입니다.");
            } else {
                insert.executeQuery();
                conn.commit();
            }
        } catch (SQLException e) {
            conn.rollback();
            throw new SQLException(e);
        }

    }

    public static ResultSet update(Connection conn) throws SQLException {
        try {
            PreparedStatement ps = conn.prepareStatement("update test set name = ? where id = 1");
            ps.setString(1, "테스트 수정");
            ResultSet rs = ps.executeQuery();
            conn.commit();
            return rs;
        } catch (SQLException e) {
            conn.rollback();
            throw new SQLException(e);
        }
    }

}

