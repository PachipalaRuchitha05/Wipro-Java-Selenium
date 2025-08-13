package course_reg;

public class Main {
	
	public static void main(String[] args) {
		
		 try {
	            RegistrationManager manager = new RegistrationManager();

	            Student s1 = new Student("S001", "Alice");
	            Course c1 = new Course("CS101", "Intro to Computer Science");
	            Course c2 = new Course("MATH101", "Calculus I");

	            manager.addStudent(s1);
	            manager.addCourse(c1);
	            manager.addCourse(c2);

	            manager.registerStudentToCourse("S001", "CS101");
	            manager.registerStudentToCourse("S001", "MATH101");

	            	            

	            for (Course course : s1.getRegisteredCourses()) {
	                System.out.println("Registered: " + course);
	            }

	            manager.dropStudentFromCourse("S001", "CS101");

	            System.out.println("After dropping CS101:");
	            for (Course course : s1.getRegisteredCourses()) {
	                System.out.println("Registered: " + course);
	            }

	          

	        } catch (CourseAlreadyRegisteredException | CourseNotFoundException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
