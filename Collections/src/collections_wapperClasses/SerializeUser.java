package collections_wapperClasses;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeUser {
	
	public static void main(String[] args)  {
		 User user = new User("dora","harry@gmail.com", 30, "CSE");
		 

	        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
	            out.writeObject(user);
	            
	            System.out.println("User object serialized to user.ser");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	   }

}
