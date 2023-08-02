/*
 * functions that is usually used in HashSet
 * add()
 * contains()
 * size()
 * remove()
 * iterator()
 * Iterator has two functions hasNext() and next()
 */
package HashSetConcept;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<>();
		
		//insert an element -- O(1)
		set.add(5);
		set.add(3);
		set.add(7);
		
		set.add(5);
		
		//printing set
		System.out.println("HashSet : " + set);
		
		//removing an ele from HashSet -- O(1)
		set.remove(5);
		
		//printing set
		System.out.println("HashSet : " + set);
		
		set.add(11);
		set.add(15);
		
		//find an element  -- O(1)
		if(set.contains(13)) {
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
		
		
		//Iterating using iterator interface
		Iterator<Integer> it = set.iterator();
		System.out.println("Iterating HashSet using Iterator");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
