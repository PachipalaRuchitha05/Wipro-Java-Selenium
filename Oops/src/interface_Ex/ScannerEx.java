package interface_Ex;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter yoru name :");
		
		String name = sc.nextLine();
		
		System.out.println("your age is : ");
		
		int age = sc.nextInt();
		
		System.out.println("salary is : ");
		
		 double salary = sc.nextDouble();
		
		System.out.println("name is : " + name + " age is :" + age + " salary is :" + salary );
		
	}

}
