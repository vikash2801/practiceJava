package StackConcept;

import java.util.Stack;

//to add new data at the bottom of stack (NOT on top)

public class Problem1 {
	public static void addBefore(int data, Stack<Integer> st) {
		
		if(st.isEmpty()) {
			st.push(data);
			return;
		}
		
		int newData = st.pop();
		addBefore(data,st);
		st.push(newData);
	}
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		
		st.push(3);
		st.push(5);
		st.push(1);
		
		//push 4 at bottom ( means before 3)
		addBefore(4,st);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
			
		}
	}
}
