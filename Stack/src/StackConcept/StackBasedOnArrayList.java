package StackConcept;

import java.util.*;

public class StackBasedOnArrayList {
	
	 static class StackTest{
		 ArrayList<Integer> list = new ArrayList<>();
		
		//check if stack is empty
		 public boolean isEmpty() {
			return list.size() == 0;
		}
		//push the element in stack
		 public void push(int ele) {
			
			list.add(ele);
		}
		//pop the top element of stack
		 public int pop() {
			if(list.isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);

			return top;
			
		}
		//peek the top element of stack
		 public int peek() {
			if(list.isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
	
	public static void main(String args[]) {
		StackTest st = new StackTest();
		st.push(6);
		st.push(8);
		st.push(1);
		
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		
	}
}
