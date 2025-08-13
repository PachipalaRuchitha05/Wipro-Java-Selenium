package collections_wapperClasses;

public class BooleanClass {
	
	public static void main(String[] args) {

	String name = "myra"; 
	
	boolean bol= Boolean.parseBoolean(name); 
	Boolean obj = Boolean.valueOf(name); 
	boolean val = obj.booleanValue(); 
	
	System.out.println(bol);
	System.out.println(obj);
	System.out.println(val);
	
	  
	
}
}