package StackConcept;

import java.util.*;

public class StackBasedOnLinkedList {
	static class Node{
		int data;
		Node next;
		
		Node(int itm){
			data = itm;
			next = null;
		}
	}
	
	static class StackTest{
		Node head = null;
		
		
		public boolean isEmpty() {
			return head == null;
		}
		
		public void push(int val) {
			
			Node temp = new Node(val);
			if(head == null) {
				head = temp;
			}else {
				temp.next = head;
				head = temp;
			}	
		}
		
		public int pop() {
			if(head == null) {
				return -1;
			}		
			int top = head.data;
			head = head.next;
			
			return top;
		}
		
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}	
		
	}
	
	public static void main(String args[]) {
		StackTest st = new StackTest();
		st.push(2);
		st.push(7);
		st.push(11);
		st.push(9);
		
		while(!st.isEmpty()) {
			System.out.println(st.peek());
			st.pop();
		}
		
	}
}
