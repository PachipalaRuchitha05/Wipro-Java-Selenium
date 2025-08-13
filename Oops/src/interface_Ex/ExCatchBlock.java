package interface_Ex;

public class ExCatchBlock {
	
	
		public static void main(String[] args){
			int x=6;
			try{
				x= 12/6;
			}catch(ArithmeticException ae){
				System.out.println("ArithmeticExceptiopn Caught hers: "+ae);
				try{
					String str=null;
					int str_length = str.length();
				}catch(NullPointerException ne){
					System.out.println("NullPointerException Occured");
				}
			}
			finally{
					x=12/2;
				System.out.println("X: "+x+" Finally block executed...."); 
			}
		}
	}	


