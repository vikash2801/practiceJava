package EmbeddedLinkedList;

import java.util.*;
public class BasicOperation1 {
	
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		list.add("Ram");
		list.add("Shyam");
		list.add(1,"Geeta");
		System.out.println(list);	
		
		list2.addAll(list);
		System.out.println("list2: " + list2);
		System.out.println("last element removed from list2: " + list2.removeLast());
		
		System.out.println("list2 size: " + list2.size());
	
		System.out.println("isEmpty: "+ list2.isEmpty());
		
		//updating elements of linkedlist
		list2.set(1,"Laksh");
		list2.add("Ganesh");
		list2.addFirst("Deen");
		
		System.out.println("list2: " + list2);
		
		list2.set(2, "Man");
		
		//converting to object array
		Object[] a = list2.toArray();
		System.out.print("Array elements: ");
		for(Object e: a) {
			System.out.print(e + " ");
		}
		
		
		
	
		
	}
	
}
