package HashMapConcept;

import java.util.HashMap;

public class findItinerary {

	public static void main(String arg[]) {
		
		HashMap<String,String> map = new HashMap<>();
		map.put("Chennai", "Bengaluru");
		map.put("Mumbai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		
		String start = "";
		
		for(String key: map.keySet()) {
			if(!map.containsValue(key)) {
				start = key;
			}
		}
		System.out.println("Source -> Destination path :");
		while(map.containsKey(start)) {
			System.out.print(start + "->");
			start = map.get(start);
		}
		System.out.println(start);
	}
}
