package jdbcSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {
	
	public static void main(String[] args) {
		
		 String url = "jdbc:mysql://localhost:3306/Student";
		 String username = "root";
		 String password = "Ruchitha@2003";
		 
		 try {
				        Connection c = DriverManager.getConnection(url, username, password);
					    Statement st = c.createStatement();

					    String createTableSQL = "CREATE TABLE IF NOT EXISTS student ("
					            + "id INT PRIMARY KEY, "
					            + "name VARCHAR(50), "
					            + "age INT, "
					            + "gender VARCHAR(10), "
					            + "email VARCHAR(50), "
					            + "phone VARCHAR(15), "
					            + "city VARCHAR(30), "
					            + "state VARCHAR(30), "
					            + "country VARCHAR(30), "
					            + "marks FLOAT)";
					    
					    st.executeUpdate(createTableSQL);
					    System.out.println("Table created successfully.");
					    st.executeUpdate("DELETE FROM student");
					    
					    String query = "INSERT INTO student (id, name, age, gender, email, phone, city, state, country, marks) VALUES "
								 + "(1001, 'Dora', 21, 'Female', 'dora@gmail.com', '3457532685', 'TPT', 'AP', 'India', 25.0),"
								 +"(1002, 'hyra', 33, 'Female', 'hyra@gmail.com', '3457532685', 'CTR', 'AP', 'India', 48.0),"
								 +"(1003, 'sinchan', 21, 'male', 'sichan@gmail.com', '3457532685', 'KLN', 'TN', 'India', 25.0),"
								 +"(1004, 'chutki', 24, 'Female', 'chutki@gmail.com', '3457532685', 'CTR', 'AP', 'India', 45.0),"
								 +"(1005, 'bheem', 27, 'male', 'bheem@gmail.com', '3457532685', 'NLR', 'AP', 'India', 25.0),"
								 +"(1006, 'raju', 61, 'male', 'raju@gmail.com', '3457532685', 'CTR', 'TN', 'India', 85.0),"
								 +"(1007, 'Dora', 21, 'Female', 'dora@gmail.com', '3457532685', 'TN', 'AP', 'India', 93.0),"
								 +"(1008, 'himawari', 28, 'Female', 'himawari@gmail.com', '3457532685', 'CTR', 'TN', 'India', 69.0),"
								 +"(1009, 'Dora', 21, 'Female', 'dora@gmail.com', '3457532685', 'KlR', 'TN', 'India', 25.0),"
								 +"(10010, 'harry', 43, 'male', 'harry@gmail.com', '3457532685', 'NLR', 'AP', 'India', 65.0)";

					    st.executeUpdate(query);
			            System.out.println("Records inserted successfully.");
			           
			            
			            
			            
			            
			            String delete = "DELETE FROM student WHERE id IN (1002, 1004)";
			            int deleted = st.executeUpdate(delete);
			            System.out.println(deleted + " record(s) deleted.");
			            
			            String update = "UPDATE student SET name = 'ben10', "
			                    + "email = 'ben10@gmail.com', "
			                    + "marks = 95.5 "
			                    + "WHERE id = 1005";
			            int updated = st.executeUpdate(update);
			            System.out.println(updated + "updated.");
			            
			            //Displaying the student records
			            String selqry="select * from student";
			            ResultSet rs = st.executeQuery(selqry);
			            try {
			            		while(rs.next()) {
			            			System.out.println(rs.getInt("id")+","+rs.getString("name"));
			            		}
			            	}catch(SQLException ex) {
			            		ex.printStackTrace();
			            	}
                      
		 
			            st.close();
			            c.close();
			            System.out.println("Connection closed.");
	        }
	        catch (SQLException e) {
	            System.err.println("SQL Error: "
	                               + e.getMessage());
	        }
		 

	}		 
	            
	}
	
	
	



