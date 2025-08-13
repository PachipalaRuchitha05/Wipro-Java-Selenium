package jdbcSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {
   public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/users"; // Replace with your DB URL
       String user = "root";
       String password = "Ruchitha@2003";
 
       String insertSQL = "INSERT INTO user (name, email) VALUES (?, ?)";
      
       try (
           Connection conn = DriverManager.getConnection(url, user, password);
           PreparedStatement pstmt = conn.prepareStatement(insertSQL);
       ) {
           // Set values for the placeholders
          pstmt.setString(1, "adgg@gmail.com");
          pstmt.setString(2, "alice@example.com");
          
           int rowsInserted = pstmt.executeUpdate();
           System.out.println(rowsInserted + " row(s) inserted.");
 
       } catch (SQLException e) {
          e.printStackTrace();
       }
   }
   
} 
   