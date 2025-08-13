package jdbcSql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdate {
    
    public void updateProduct() {
        
        try (Connection conn = JDBCConnection.getConnection();
             Statement st = conn.createStatement()) {
             
            String update  = "UPDATE product SET "
                    + "pname = 'burger', "
                    + "pprice = 200.0 "
                    + "WHERE pid = 1003";
            
            int updated = st.executeUpdate(update);
            System.out.println(updated + " record(s) updated.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

