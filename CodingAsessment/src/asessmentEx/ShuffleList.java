package asessmentEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	list.add("dora");
	list.add("chutki");
	list.add("bheem");
	list.add("tun tun");
	list.add("raj");
	list.add("dolu");
	
	// print the list of elements
	System.out.println("List :" + list);
	 Collections.shuffle(list);
       
	 // print the shuffled elements
     System.out.println("Shuffled List: " + list);
     
     List<String> subList = list.subList(2, 4);
     
     // Print the extracted List
     System.out.println("Extracted  subList: " + subList);
     
     list.set(3, "ben10");
     
     // print the updated List
     System.out.println("UpdatedList :" + list);
     
     
	
	
	}
}
