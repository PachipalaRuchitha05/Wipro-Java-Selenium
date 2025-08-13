package course_reg;

public interface Registerable {
	
	 void registerCourse(Course course) throws CourseAlreadyRegisteredException;
	    void dropCourse(Course course) throws CourseNotFoundException;

}
