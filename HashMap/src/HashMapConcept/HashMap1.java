/*
 * functions that is usually used in HashMap
 * put()
 * get()
 * containsKey()
 * size()
 * remove()
 * keySet()
 * entrySet()
 */
package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String args[]) {
		HashMap<Integer,String> map = new HashMap<>();
		
		//inserting key:value in HashMap
		map.put(54,"Sita");
		map.put(67, "Lucky");
		map.put(71, "Anam");
		
		//printing HashMap
		System.out.println("HashMap : " + map);
		
		//updating key:value
		map.put(71, "Ranjan");
		map.put(82,"Shikha");
		
		//printing HashMap
		System.out.println("HashMap After update : " + map);
		
		map.remove(71);
		
		//printing HashMap
		System.out.println("HashMap After Delete Ops : " + map);
		
		//searching for key
		if(map.containsKey(82)) {  //map.containsValue("Shikha")
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		//Iterator for HashMap
		System.out.println("Iterating HashMap using iterator");
		// for ( it e : collection)
		for(Map.Entry<Integer,String> e : map.entrySet()){
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
	}
}
