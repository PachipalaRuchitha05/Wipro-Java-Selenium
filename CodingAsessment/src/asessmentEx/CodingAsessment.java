package asessmentEx;

import java.util.Scanner;

public class CodingAsessment {
	
	public static class ReverseTable{
		public void printTable() {
			
			int number = 5;
		    for (int i = 10; i >= 1; i--) {
		        System.out.println(number + " x " + i + " = " + (number * i));
		    }
		   
		}
	
	
	public void printAlphabets() {
		
		 for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.print(ch + " ");
	        }
	        System.out.println();
	}
	
	public void printAsciiValues() {
		
         for (char ch = 'A'; ch <= 'Z'; ch++) {
        	 int asciiValue = ch;
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
	
	}
	
	}
	
	public void printFactorial() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int number = scanner.nextInt();
        int factorial = 1;

          for (int i = 1; i <= number; i++) {
              factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
	
	public void PrintNumbers() {
	
		 Scanner scanner = new Scanner(System.in);

	        int positiveCount = 0;
	        int negativeCount = 0;
	        int zeroCount = 0;
	        char choice;
	        
	        do {
	            System.out.print("Enter a number: ");
	            int number = scanner.nextInt();

	            if (number > 0) {
	                positiveCount++;
	            } else if (number < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }

	            System.out.print("Do you want to enter another number? (y/n): ");
	            choice = scanner.next().charAt(0); 
	        } while (choice == 'y' || choice == 'Y');

	        System.out.println("\n--- Results ---");
	        System.out.println("Positive numbers: " + positiveCount);
	        System.out.println("Negative numbers: " + negativeCount);
	        System.out.println("Zeros: " + zeroCount);

	        scanner.close();
	}
	
	      public void addNumbers() {
	    	  
	    	  int sum = 0;
	          int count = 0;
	          
	          for (int i = 100; i <= 200; i++) {
	             
	              if (i % 9 == 0) {
	                  sum += i;   
	                  count++;   
	              }
	          }
	          
	          System.out.println("Number of integers between 100 and 200 divisible by 9: " + count);
	          System.out.println("Sum of integers between 100 and 200 divisible by 9: " + sum);
	      }
	    
	
	        public void onesComplement() {
	        	Scanner scannner = new Scanner(System.in);
	        	int n = scannner.nextInt();
	        	
	        	System.out.println("one's complement of number is :" + ~n);
	        
	         }
	
        }

	
        
	}
	

