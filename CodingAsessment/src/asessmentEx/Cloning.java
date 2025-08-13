package asessmentEx;

import java.util.HashSet;
import java.util.TreeSet;

public class Cloning {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("10");
		set.add("20");
		set.add("30");
		set.add("70");
		set.add("50");
		set.add("60");
		 System.out.println("Original HashSet: " + set);
		  @SuppressWarnings("unchecked")
		  
		 HashSet<String> clonedSet = (HashSet<String>) set.clone();
		  
		 System.out.println("cloned HashSet: " + clonedSet);
		 
		 // converting hashSet into TreeSet
		 
		 TreeSet<String> treeSet = new TreeSet<>(set);
		 
		 System.out.println("TreeSet :" + treeSet);
		
	}

}
