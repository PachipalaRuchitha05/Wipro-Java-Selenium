package interface_Ex;

public class Throw_Throws {
	
	
	public static void CheckAge(int age)  {
		
		if(age<18) {
			throw new IllegalArgumentException("acess denied - you must be atleast 18 years old");
			
		}
		else {
			
			System.out.println("you are eligible to cast a vote!");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			
			CheckAge(12);
		}
		catch(IllegalArgumentException e) {
			
			System.out.println("Exception caught :"+ e.getMessage());
			
			
		}
		
		
}

}
