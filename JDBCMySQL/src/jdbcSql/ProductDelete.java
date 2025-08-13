package jdbcSql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDelete {
	
	public void deleteProduct() {
		
		 try (Connection conn = JDBCConnection.getConnection();
	             Statement st = conn.createStatement()) {
			 
		 
           String delete = "DELETE FROM product WHERE id IN (1002, 1004)";
           int rows = st.executeUpdate(delete);
           System.out.println(rows + " record(s) deleted.");
           
       } catch (SQLException e) {
    	   
    	   e.printStackTrace();
       }
	}

}
