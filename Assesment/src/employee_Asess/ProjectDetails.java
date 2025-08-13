package employee_Asess;

public class ProjectDetails {
	 private String projectName;
	    private String role;
	    
	public ProjectDetails(String projectName, String role) {
			super();
			this.projectName = projectName;
			this.role = role;
		}

	public String getProjectName() {
		return projectName;
	}

	public String getRole() {
		return role;
	}

	public void displayProjectDetails() {
		
		 System.out.println("\n\n--- Employee Projects ---");
	        System.out.println("1. Project Name: " + projectName);
	         System.out.println("2. Project role: " + role);
	        
	}

}
