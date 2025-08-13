package collections_wapperClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionName {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList();
		
		names.add("dora");
		names.add("bujji");
		names.add("dolu");
		names.add("bolu");
		names.add("raju");
		
		System.out.println("before sorting :" + names);
		
		Collections.sort(names);
		
		System.out.println("after sorting :" + names);
		
		names.set(3, "chota bheem");
		
		System.out.println(names);
		
		
	}

}
