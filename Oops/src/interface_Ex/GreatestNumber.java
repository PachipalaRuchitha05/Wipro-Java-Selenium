package interface_Ex;

public class GreatestNumber {
	
	public void greatNumber() {
		
		int[] numbers = {7,4,3,2,7,8,9,10,5,2};
		int greatest =0;
		
		for(int i =0; i<10; i++) {
			
			if(numbers[i] > greatest) {
                
				greatest = numbers[i];
		
		}
			
	}
		
		System.out.println("the greatest numbers is :" + greatest);
		
	}
	
	public void main(String[] args) {
		
		GreatestNumber greatestNumber = new GreatestNumber();
		greatestNumber.greatNumber();
	}
}
