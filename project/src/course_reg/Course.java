package course_reg;

public class Course {
	
	private String courseCode;
    private String courseName;
    
    public Course(String courseCode, String courseName) {
    	
    	this.courseCode = courseCode;
    	this.courseName = courseName;
    	
    }
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Course)) return false;
        Course other = (Course) obj;
        return courseCode.equals(other.courseCode);
    }
 
 @Override
    public int hashCode() {
        return courseCode.hashCode();
    }

 @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }


}
