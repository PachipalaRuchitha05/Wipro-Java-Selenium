package jdbcSql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsert {
    
    public void insertProduct() {
        
         String query = "INSERT INTO product (p_id, p_name, p_price) VALUES "
                + "(101, 'kitkat', 25.3),"
                + "(102, 'kinder Joy', 30.7),"
                + "(103, 'melody', 80.0),"
                + "(104, 'munch', 5.0),"
                + "(105, 'perk', 10.0)";
         
         try (Connection conn = JDBCConnection.getConnection();
                 Statement st = conn.createStatement()) {

                int rows = st.executeUpdate(query);
                System.out.println(rows + " records inserted successfully.");

        } catch (SQLException e) {
             e.printStackTrace();
        }
    
    }
}
