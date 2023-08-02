package EmbeddedLinkedList;

import java.util.*;
public class reverseLinkedList {

	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		
		System.out.println("linkedlist: "+ ll);
		
		//reversing linked list
		
		for(int i=0; i<ll.size()/2; i++) {
			Object temp = ll.get(i);
			Object eleFromLast = ll.get(ll.size()-i-1);
			
			ll.set(i, eleFromLast.toString());
			ll.set(ll.size()-i-1, temp.toString());	
			
		}
		System.out.println("reversed linkedlist: "+ ll);
	}
}
