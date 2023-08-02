package StackConcept;

import java.util.Stack;

public class Problem2 {
	
	public static void reverse(Stack<Integer> newSt) {
		if(newSt.isEmpty()) {
			return;
		}
		int top = newSt.pop();
		reverse(newSt);
		System.out.println(top);
	}
	
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		
		st.push(9);
		st.push(29);
		st.push(39);
		
		
		System.out.println("Reverse Stack:");
		reverse(st);
	}
}
