package collections_wapperClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerDept;
	private double customerSalary;
	private String customerContact;
	private String customerLocation;
	
  Customer(int customerId, String customerName, String customerDept, double customerSalary, String customerContact, String customerLocation) {
		  
	  this.customerId = customerId;
      this.customerName = customerName;
      this.customerDept = customerDept;
      this.customerSalary = customerSalary;
      this.customerContact = customerContact;
      this.customerLocation = customerLocation;
	
	}

public int getCustomerId() {
	return customerId;
}

public String getCustomerName() {
	return customerName;
}

public String getCustomerDept() {
	return customerDept;
}

public double getCustomerSalary() {
	return customerSalary;
}

public String getCustomerContact() {
	return customerContact;
}

public String getCustomerLocation() {
	return customerLocation;
}

@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerDept=" + customerDept
			+ ", customerSalary=" + customerSalary + ", customerContact=" + customerContact + ", customerLocation="
			+ customerLocation + "]";
}
	
public static void main(String[] args) {
	
	List<Customer> customers = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	customers.add(new Customer(1001, "dora", "sales ", 40000.0, "3945724064", "HYD"));
	customers.add(new Customer(1002, "bheem", "IT ", 50000.0, "39457324064", "TN"));
	customers.add(new Customer(1003, "chutki", "Marketing ", 30000.0, "8765724064", "VJD"));
	customers.add(new Customer(1004, "shichan", "HR ", 20000.0, "39457245436", "NLR"));
	customers.add(new Customer(1005, "himawari", "manager", 60000.0, "4345724064", "CTR"));
	
	 Iterator<Customer> iterator = customers.iterator();
     System.out.println("Customer List:");
     while (iterator.hasNext()) {
         Customer cust = iterator.next();
         System.out.println(cust);
     }
     // remove customer index at 3
     Customer remove = customers.remove(3);
     System.out.println("****Removed customer at index 3:******* " + remove.getCustomerName());
     
     System.out.println("updated list of customes is : ");
     for(Customer c : customers) {
   System.out.println(c);
      }
     
     // search employee id
      System.out.println("Enter the employee ID :");
		int custId = scan.nextInt();
		
     iterator = customers.iterator();  
     boolean found = false;

     while (iterator.hasNext()) {
         Customer cust = iterator.next();
         if (cust.getCustomerId() == custId ) {
             System.out.println("Customer " + cust.getCustomerId() + " found ");
             System.out.println("Name: " + cust.getCustomerName());
             System.out.println("Location: " + cust.getCustomerLocation());
             found = true;
             break;
         }
     }

     if (!found) {
         System.out.println("Customer 1002 not found in the list");
     }
}

}
