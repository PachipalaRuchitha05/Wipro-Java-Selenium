package employee_Asess;

public class SalaryDetails {
	
	private double basicSalary;   
	private double allowances;     
	private double deductions;     
	private double netSalary;  
	
	public SalaryDetails(double basicSalary, double allowances, double deductions, double netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.allowances = allowances;
		this.deductions = deductions;
		this.netSalary = netSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getAllowances() {
		return allowances;
	}

	public double getDeductions() {
		return deductions;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void displaySalaryDetails() {
		
		System.out.println("\n\n--- Employee Salary Details ---");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowances);
        System.out.println("Deductions:  " + deductions);
        System.out.println("Net Salary: " + netSalary);
	}

}
