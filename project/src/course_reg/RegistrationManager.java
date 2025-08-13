package course_reg;

import java.util.ArrayList;

public class RegistrationManager {
	
	 private ArrayList<Student> students;
	    private ArrayList<Course> courses;

	    public RegistrationManager() {
	        this.students = new ArrayList<>();
	        this.courses = new ArrayList<>();
	    }
	    
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void addCourse(Course course) {
	        courses.add(course);
	    }
	    
	    public Student findStudentById(String id) {
	        for (Student s : students) {
	            if (s.getId().equals(id)) return s;
	        }
	        return null;
	    }

	    public Course findCourseByCode(String code) {
	        for (Course c : courses) {
	            if (c.getCourseCode().equals(code)) return c;
	        }
            return null;
	    }
	    
	    public void registerStudentToCourse(String studentId, String courseCode)
	            throws CourseAlreadyRegisteredException {
	        Student student = findStudentById(studentId);
	        Course course = findCourseByCode(courseCode);

	        if (student != null && course != null) {
	            student.registerCourse(course);
	        }
	    }
	    
	    public void dropStudentFromCourse(String studentId, String courseCode)
	            throws CourseNotFoundException {
	        Student student = findStudentById(studentId);
	        Course course = findCourseByCode(courseCode);

	        if (student != null && course != null) {
	            student.dropCourse(course);
	        }
	    }
}
