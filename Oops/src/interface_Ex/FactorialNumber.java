package interface_Ex;

public class FactorialNumber {
	
	public void factorial() {
		
		int num= 4;
		long fact = 1;
		for(int i =1; i <= num; i ++ ) {
			
			fact = fact*i;
		}
		
		System.out.println("factorial of num is :" + fact);
	}
	
	public static void main(String[] args) {
		
		FactorialNumber factorialNumber = new FactorialNumber();
		
		factorialNumber.factorial();
	}

}
