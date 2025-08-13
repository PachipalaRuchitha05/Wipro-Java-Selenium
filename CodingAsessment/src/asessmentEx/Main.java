package asessmentEx;

import asessmentEx.CodingAsessment.ReverseTable;

public class Main {
	
		public static void main(String[] args) {
	   
		ReverseTable table = new ReverseTable();
		
		table.printTable();
		
		System.out.println("\n Print the alphabets from A-Z : ");
		table.printAlphabets();
		
		System.out.println("\n Print ASCII Values: ");
		table.printAsciiValues();
		
		System.out.println("\n Print factorial of a number : ");
		table.printFactorial();
		
		System.out.println("\n Print the numbers :");
		table.PrintNumbers();
		
		System.out.println("\n add numbers between 100 and 200 divisible by 9 : ");
		table.addNumbers();
	
		System.out.println("\n print the one's complement of number :");
		table.onesComplement();
		
		}

}
