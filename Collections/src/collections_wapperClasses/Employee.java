package collections_wapperClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	
	private int id;
	private String name ;
	private String dept;
	
	Employee(int id, String name, String dept){
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		
	}
	
	public int getId() {
		
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	 @Override
	    public String toString() {
	        return "Employee ID: " + id + ", Name: " + name + ", dept: " + dept;
	    }
	
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		employees.add(new Employee(1001, "nobita", "dev"));
		employees.add(new Employee(1002, "sizukaa", "tester"));
		employees.add(new Employee(1003, "chutki", "dev"));
		employees.add(new Employee(1004, "bheem", "anlyst"));
		employees.add(new Employee(1005, "dolu", "dev"));
		
		System.out.println("******* Display all employees ***** ");
		
		for(Employee emp : employees) {
			
			System.out.println(emp);
		}
		
		//  search employee by ID
		
		System.out.println("Enter the employee ID :");
		
		int searchId = scan.nextInt();
		
		boolean found = false;
		
		for(Employee emp : employees) {
			
			if(emp.getId() == searchId) {
				
				System.out.println("serachId :" + emp );
				
				found = true;
				break;
		}
		}
		
		if(!found) {
			
			System.out.println( searchId +"Emp Id is not found ");
		}
		
		System.out.println("Remove the employee :");
		
		int removeId = scan.nextInt();
		Employee toRemove = null;
		
		for(Employee emp : employees) {
			if(emp.getId() == removeId) {
				toRemove = emp;
				break;

			}
			
		}
		
		

		if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Employee removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }
		
		System.out.println("An updated employee list");
		
		for(Employee emp : employees) {
			
			System.out.println(emp);
		}
			
		
		
	}

}
