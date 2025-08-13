package employee_Asess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMenu {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        int menu;

	        do {
	            System.out.println("\n\n\t\t\tEmployee Menu");
	            System.out.println("\t\t\t-------------");
	            System.out.println("\t1. Display Employee Personal Details.");
	            System.out.println("\t2. Display Employee Professional Details.");
	            System.out.println("\t3. Display Employee Salary Details.");
	            System.out.println("\t4. Display Employee Earned Leaves and Casual Leaves.");
	            System.out.println("\t5. Display Employee Projects Undertaken.");
	            System.out.println("\t6. Exit the Menu.");
	            System.out.print("\n\tEnter your choice: ");

	           menu = scanner.nextInt();

	            switch (menu) {
	                case 1:
	                	List<PersonalDetails> personalDetails = new ArrayList<>();
	                	
	                	personalDetails.add(new PersonalDetails( "dora", "25-01=2003","HYD","6473892743", "dora@gmail.com"
	                       ) );
	                	
	                   for(PersonalDetails pd : personalDetails) {
	                	   System.out.println("ID: " + pd.getempName());
	                        System.out.println("Department: " + pd.getempDob());
	                        System.out.println("Designation: " + pd.getempAddress());
	                        System.out.println("Designation: " + pd.getempContact());
	                        System.out.println("Designation: " + pd.getEmail());
	                	   
	                	   
	                   }
	                    break;
	                case 2:
	                	 List<ProfessionalDetails> professionalDetailsList = new ArrayList<>();
	                	 professionalDetailsList.add(new ProfessionalDetails( "1001", "IT","Software Engineer" ));
	                	 
	                     for (ProfessionalDetails pd1 : professionalDetailsList) {
	                        System.out.println("ID: " + pd1.getEmpId());
	                        System.out.println("Department: " + pd1.getEmpDept());
	                        System.out.println("Designation: " + pd1.getEmpDesignation());
	                        
	                    }
	                    break;
	                case 3:
	                   List<SalaryDetails> salaryDetails = new ArrayList<>();
	                   salaryDetails.add(new SalaryDetails(20000.0, 30000.0,50000.0, 40000.0));
	                   for(SalaryDetails sd : salaryDetails) {
	                	   System.out.println("\n\n--- Employee Salary Details ---");
	                       System.out.println("Basic Salary: " + sd.getBasicSalary());
	                       System.out.println("Allowances: " + sd.getAllowances());
	                       System.out.println("Deductions:  " + sd.getDeductions());
	                       System.out.println("Net Salary: " + sd.getNetSalary());
	                   }
	               
	                    break;
	                case 4:
	                   List<LeaveDetails> leaveDetails = new ArrayList<>();
	                   leaveDetails.add(new LeaveDetails(20, 10, 5, 15, 20));
	                   for(LeaveDetails ld : leaveDetails) {
	                	   System.out.println("Earned Leaves: " + ld.getEarnedLeaves());
	                       System.out.println("Casual Leaves: " + ld.getCasualLeaves());
	                       System.out.println("Sick Leaves: " + ld.getSickLeaves());
	                       System.out.println("Total Leaves : " + ld.getTotalLeaves());
	                       System.out.println("Available Leaves: " + ld.getAvailableLeaves());
	                	   
	                   }
	                    break;
	                case 5:
	                   List<ProjectDetails> projectDetails = new ArrayList<>();
	                   projectDetails.add(new ProjectDetails("employee details", "developer"));
	                    for(ProjectDetails pd : projectDetails) {
	                    	
	                    	 System.out.println("1. Project Name: " + pd.getProjectName());
	            	         System.out.println("2. Project role: " + pd.getRole());
	            	        
	                    }
	                    break;
	                case 6:
	                    System.out.println("\nExiting the Menu.");
	                    break;
	                default:
	                    System.out.println("\nInvalid choice. ");
	            }
	        } 
	        
	        while (menu != 6);

	        scanner.close();
	    }
	}


