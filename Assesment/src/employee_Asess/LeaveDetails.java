package employee_Asess;

public class LeaveDetails {
	
	private int earnedLeaves;
    private int casualLeaves;
    private int sickLeaves;
    private int totalLeaves;
    private int availableLeaves;
	
	public LeaveDetails(int earnedLeaves, int casualLeaves, int sickLeaves, int totalLeaves, int availableLeaves) {
		super();
		this.earnedLeaves = earnedLeaves;
		this.casualLeaves = casualLeaves;
		this.sickLeaves = sickLeaves;
		this.totalLeaves = totalLeaves;
		this.availableLeaves = availableLeaves;
	}

	public int getEarnedLeaves() {
		return earnedLeaves;
	}

	public int getCasualLeaves() {
		return casualLeaves;
	}

	public int getSickLeaves() {
		return sickLeaves;
	}

	public int getTotalLeaves() {
		return totalLeaves;
	}

	public int getAvailableLeaves() {
		return availableLeaves;
	}

	public void displayLeaveDetails() {
		
		System.out.println("\n\n--- Employee Leave Details ---");
        System.out.println("Earned Leaves: " + earnedLeaves);
        System.out.println("Casual Leaves: " + casualLeaves);
        System.out.println("Sick Leaves: " + sickLeaves);
        System.out.println("Total Leaves : " + totalLeaves);
        System.out.println("Available Leaves: " + availableLeaves);
	}

}
