package jdbcSql;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
    
    static Connection con = null;
    
    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/product_d";
            String username = "root";
            String password = "Ruchitha@2003";

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
