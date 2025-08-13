package interface_Ex;

public class SwappingValues {
	
	public void swapValues() {
		
		int a= 10;
		int b = 20;
		
		int swap = a;
		a = b;
		b = swap;
		
		System.out.println("after swaping values of a is : " +a + " and b is : " + b );

	}
	
   public static void main(String[] args) {
	   
	   SwappingValues swap = new SwappingValues();
	   swap.swapValues();
   }
	
}
