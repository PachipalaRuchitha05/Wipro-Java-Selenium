package employee_Asess;

public class ProfessionalDetails {
	
	private String empId;
	private String empDept;
	private String empDesignation;
	
	public ProfessionalDetails(String empId, String empDept, String empDesignation) {
		this.empId = empId;
		this.empDept = empDept;
		this.empDesignation = empDesignation;
		
	}
	
	public String getEmpId() {
		return empId;
	}

	public String getEmpDept() {
		return empDept;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void displayProfessionalDetails() {
		
		 System.out.println("\n\n--- Employee Professional Details ---");
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Department: " + empDept);
	        System.out.println("Designation: " + empDesignation);
	       
	}

}
