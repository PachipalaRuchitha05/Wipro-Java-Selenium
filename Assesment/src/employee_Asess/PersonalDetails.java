package employee_Asess;

public class PersonalDetails {
	
	 private String empName;
	    private String empDob;
	    private String empAddress;
	    private String empContact;
	    private String empEmail;
	    
	    // using constructor 
	    
	    public PersonalDetails(String empName, String empDob, String empAddress, String empContact, String empEmail) {
	        this.empName = empName;
	        this.empDob = empDob;
	        this.empAddress = empAddress;
	        this.empContact = empContact;
	        this.empEmail = empEmail;
	    }
	    
	    // generate getters 
	    
	public String getempName() {
			return empName;
		}


		public String getempDob() {
			return empDob;
		}


		public String getempAddress() {
			return empAddress;
		}


		public String getempContact() {
			return empContact;
		}


		public String getEmail() {
			return empEmail;
		}


	public void displayPersonalDetails() {
		
		 System.out.println("\n\n--- Employee Personal Details ---");
	        System.out.println("Name: " + empName);
	        System.out.println("DOB: "+ empDob);
	        System.out.println("Address: "+ empAddress);
	        System.out.println("Contact Number: " + empContact);
	        System.out.println("Email: " + empEmail);
	}

}
