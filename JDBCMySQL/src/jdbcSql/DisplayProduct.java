package jdbcSql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayProduct {
	
	public void displayProduct() {
		
		 try (Connection conn = JDBCConnection.getConnection();
				 Statement st = conn.createStatement()) {
			 
			 String display = "SELECT * FROM product";
	            ResultSet rs = st.executeQuery(display);
	            try {
	            		while(rs.next()) {
	            			System.out.println(rs.getInt("pid")+","+rs.getString("pname"));
	            		}
	            	}catch(SQLException ex) {
	            		ex.printStackTrace();
	            	}
		 }
		 
		 catch (SQLException e) {
	            System.err.println("SQL Error: "
	                               + e.getMessage());
	        }
	}

}
