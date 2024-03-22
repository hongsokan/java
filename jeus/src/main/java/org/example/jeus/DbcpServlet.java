package org.example.jeus;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbcpServlet extends HttpServlet {

    private DataSource dataSource;
    private Connection con;
    private PreparedStatement pt;
    private ResultSet rs;

    public void init() {
        try {
            Context context = new InitialContext();
            dataSource = (DataSource) context.lookup("mariadb-test");
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
            pt = con.prepareStatement(sql);
            rs = pt.executeQuery();

            while (rs.next()) {
                out.println("<div>table name :" + rs.getString("tables_in_hs.an"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error getting database connection", e);
        }
        out.println("</body></html>");
    }

    public void destroy() {
        try {
            rs.close();
            pt.close();
            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}