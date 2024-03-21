package org.example.tomcat;

import com.sun.tools.javac.Main;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DbcpServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(Main.class.getName());
    private Connection con;
    private DataSource dataSource;

    public void init() {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("java:comp/env/jdbc/mariadb");
            logger.info(dataSource.toString());
        } catch (NamingException e) {
            throw new RuntimeException("Error initializing data source", e);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            con = dataSource.getConnection();
            con.setAutoCommit(false);
            out.println("<div>Connected to the database using dbcp</div>");

            String sql = "show tables from `hs.an`";
            PreparedStatement pt = con.prepareStatement(sql);
            ResultSet rs = pt.executeQuery();

            logger.info(rs.getStatement().toString());

            while (rs.next()) {
                out.println("<div>table name :" + rs.getString("tables_in_hs.an"));
            }

            pt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error getting database connection", e);
        }
        out.println("</body></html>");
    }

    public void destroy() {
        try {
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}