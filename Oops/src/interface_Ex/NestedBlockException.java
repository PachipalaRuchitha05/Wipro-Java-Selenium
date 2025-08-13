package interface_Ex;

public class NestedBlockException {
	
	
	public static void main(String[] args) {
		
		int[] num = {10, 0};
		
		try {
			
			System.out.println(" outer try block ");
			
			try {
				System.out.println("inner try block ");
				
				int result = num[0] / num[1];
				
				System.out.println("Result : " + result);
			}
			catch (ArithmeticException e) {
				
				System.out.println(" Arithmetic Excetion is thrown ");
				
			}
			
			int arr = num[1];
			System.out.println("array out of index :" + arr);
		}
			catch (ArrayIndexOutOfBoundsException e) {
				
				System.out.println(" ArrayOutOfBoundsException is thrown ");
			}
		
			finally {
				
				System.out.println("finally block will execute always whether exception is raised or not");
		}
		
	}

}
