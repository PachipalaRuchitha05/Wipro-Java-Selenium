package collections_wapperClasses;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeUser {
	
	 public static void main(String[] args) throws Exception {
		 try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
	            User user = (User) in.readObject();
	            
	            System.out.println("User name: " + user.username);
	            System.out.println("user email: " +  user.email);
	            System.out.println("User age: " + user.age);
	            System.out.println("User dept: " + user.dept);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }

}
