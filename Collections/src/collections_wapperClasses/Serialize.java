package collections_wapperClasses;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	
	public static void main(String[] args) {
	       Student1 s1 = new Student1(23 ,"harry");
	 
	       try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
	          out.writeObject(s1);
	          System.out.println("Object serialized to student.ser");
	       } catch (Exception e) {
	          e.printStackTrace();
	       }
	   }

}
