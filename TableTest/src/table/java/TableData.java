package table.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableData {
	static Connection con;
	 public static Connection getConnection() {
	        try {
	            String url = "jdbc:mysql://localhost:3306/section";
	            String username = "root";
	            String password = "Ruchitha@2003";

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            con = DriverManager.getConnection(url, username, password);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return con;
	    }
    public void insertProduct() {
        
        String query = "INSERT INTO  section(id, name, mail) VALUES "
               + "(101, 'dora', 'dora@gmail.com'),"
               + "(102, 'Joy', 'joy@gmail.com'),"
               + "(103, 'tun tun', 'tun@gmail.com')";
    
    try {
        Connection connection = getConnection();  // get the connection
        Statement stmt = connection.createStatement();  // create statement
        int rowsInserted = stmt.executeUpdate(query);  // execute insert
        System.out.println(rowsInserted + " rows inserted.");
        stmt.close();
        connection.close();
    } catch (SQLException e) {
    	e.printStackTrace();
    }
   
    }
}
