package asessmentEx;

import java.util.HashMap;
import java.util.Set;

public class MapEx {
	
	public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<>();
	
	map.put(1 , " harry ");
	map.put(2 ,  " warny ");
	map.put(3 , " rosiee ");
	map.put(4 , " dustin ");
	
	System.out.println("print the values of map :" + map);
	Set<Integer> keySet = map.keySet();
	
	System.out.println("print the keyset values :" + keySet);
	

	}
}
