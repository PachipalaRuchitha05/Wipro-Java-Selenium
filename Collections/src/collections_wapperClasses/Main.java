package collections_wapperClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	
	 List<Student> students = new ArrayList<>();

     students.add(new Student("dora", 23));
     students.add(new Student("bujji", 21));
     students.add(new Student("hima", 20));
     students.add(new Student("hrish", 25));
     
     System.out.println("\nbefore sorting students age :");
     
     for(Student s : students) {
    	 System.out.println(s);
     }
    
     System.out.println("\nAfter sorting student age :");
     Collections.sort(students, new AgeComparator());

     for(Student s1 : students) {
    	 System.out.println(s1);
     }
     
     System.out.println("\nAfter sorting student names :");
     Collections.sort(students, new NameComparator());
     for(Student s1 : students) {
    	 System.out.println(s1);
     }
     
     // using anonymous classes 
     
     System.out.println("\nsorting age by using anonymous classes: ");
     
     Collections.sort(students ,new Comparator<Student>(){
    	 
    	 public int compare(Student s1, Student s2) {
    		 return Integer.compare(s1.getAge(), s2.getAge());
    		 
    	 }
    	 
     });
     
     for(Student sAge : students) {
    	 System.out.println(sAge);
     }
      
     
     System.out.println("\nsorting name by using anonymous classes: ");
     Collections.sort(students, new Comparator<Student>(){
    	 public int compare(Student s3, Student s4) {
    		 return s3.getName().compareTo(s4.getName()); 
    	 }
     });
     
     
     for(Student sName : students) {
    	 System.out.println(sName);
     }
     // using lamda expressions
     
     System.out.println("\n sorting age by using lamda expressions :");
     students.sort((s1,s2)-> Integer.compare(s1.getAge(), s2.getAge()));
     students.forEach(System.out::println);
     
}
}
