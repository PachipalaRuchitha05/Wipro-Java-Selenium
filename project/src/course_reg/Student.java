package course_reg;

import java.util.ArrayList;

public class Student extends Person implements Registerable {
	
	 private ArrayList<Course> registeredCourses;
	 
	 public Student(String id, String name) {
	        super(id, name);
	        this.registeredCourses = new ArrayList<>();
	    }
	 
	 public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
	        if (registeredCourses.contains(course)) {
	            throw new CourseAlreadyRegisteredException("Already registered for course: " + course.getCourseCode());
	        }
	        registeredCourses.add(course);
	    }
	 
	 public void dropCourse(Course course) throws CourseNotFoundException {
	        if (!registeredCourses.contains(course)) {
	            throw new CourseNotFoundException("Course not found in registration: " + course.getCourseCode());
	        }
	        registeredCourses.remove(course);
	    }
	 
	 public ArrayList<Course> getRegisteredCourses() {
	        return registeredCourses;
	    }

}
