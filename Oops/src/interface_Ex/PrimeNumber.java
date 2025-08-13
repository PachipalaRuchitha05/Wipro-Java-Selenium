package interface_Ex;

public class PrimeNumber {
	
	public void prime() {
		
		int num = 3;
		boolean flag = false;
		
		if(num == 0 || num == 1){
			flag = true;
		}
		
		for(int i= 2; i<=num/2; i++) {
			if(num%i ==0) {
				
				flag = true;
			}
			
		}
		
		if(!flag) {
			System.out.println(num + " is a prime number" );
		}
		
		else {
			System.out.println(num + " is not a prime  number ");
		}
	}
	public static void main(String[] args) {
		
		PrimeNumber primeNumber = new PrimeNumber();
		
		primeNumber.prime();
	}

}
