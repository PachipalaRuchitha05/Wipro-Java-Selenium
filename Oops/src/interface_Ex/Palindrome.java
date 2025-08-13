package interface_Ex;

public class Palindrome {
	
	public void palindromeText() {
		
		String text = " MOM ", reverseText = "";
		
		int length = text.length();
		
		for(int i = length-1; i >=0; i--) {
			
			 reverseText = reverseText + text.charAt(i);
		}
		
		if(text.toLowerCase().equals(reverseText.toLowerCase())) {
			
			System.out.println(text + " is a palindrome");
		}
		
		else {
			
			System.out.println(text + "is not a palindrome");
		}
		
	
	}
		public static void main(String[] args) {
			Palindrome palindrome = new Palindrome();
			
			palindrome.palindromeText();
			
	}
	

}
