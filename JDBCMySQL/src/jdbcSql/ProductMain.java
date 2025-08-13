package jdbcSql;

import java.util.Scanner;

public class ProductMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ProductInsert productInsert = new ProductInsert();
		ProductDelete productDelete = new ProductDelete();
		ProductUpdate productUpdate = new ProductUpdate();
		DisplayProduct displayProduct = new DisplayProduct();
		
		int exit;
		 do {
	            System.out.println("1. Insert a new Record");
	            System.out.println("2. Delete a record");
	            System.out.println("3. Update a record");
	            System.out.println("4. Display all records");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice from 1 = 5: ");
	            exit = scan.nextInt();
		    
	            switch (exit) {
	     
                case 1: productInsert.insertProduct();
                break;
                case 2: productDelete.deleteProduct(); 
                break;
                case 3: productUpdate.updateProduct();
                break;
                case 4: displayProduct.displayProduct();
                break;
                case 5: System.out.println("Exiting...");
                break;
                default: System.out.println("Invalid choice");
	}
		 }
	            while (exit != 5);
	            
}
}
