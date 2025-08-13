package interface_Ex;

import java.util.Arrays;

public class ReverseArray {
	
	public void revArray() {
		
		int[] arr = {3,6,8,5,9};
		
		for( int i=0; i<arr.length/2; i++) {
			
			int reverse = arr[i];
			
			arr[i] = arr[arr.length-1 -i];
			
			arr[arr.length-1 -i] = reverse;
		}
		
		System.out.println("Reverse array is : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		
		reverseArray.revArray();
	}

}
