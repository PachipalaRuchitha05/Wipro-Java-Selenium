package interface_Ex;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter value of a :");
	
	int a = scan.nextInt();
	
   System.out.println("enter value of b :");
	
	int b = scan.nextInt();
	
	try {
		
		int result = a + b ;
		System.out.println("Name is "+ result );
	}
	
	catch(ArithmeticException e) {
		
		System.out.println(" InputMismatcException is raised ");
		
	}
	
	finally {
		
		System.out.println("exception is not raised");
	}
	
	}
	

}
