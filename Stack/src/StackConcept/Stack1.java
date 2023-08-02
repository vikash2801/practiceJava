package StackConcept;

import java.util.*;

public class Stack1 {
	
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		
		st.add(5);
		st.add(3);
		st.add(1);
		
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
	}
}
