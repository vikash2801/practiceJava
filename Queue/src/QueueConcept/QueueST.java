package QueueConcept;
//Queue using single linked list
import java.util.*;

public class QueueST {
	
		static class QueueTest{
			Stack<Integer> st1 = new Stack<>();
						
			//checking Queue is empty or not
			public boolean isEmpty() {
				return st1.isEmpty();
			}
			
			//adding element at the rear in Queue 
			public void add(int item) {
				
				if(isEmpty()) {
					st1.push(item);
					return;
				}
				//using recursion to place an item at the bottom
				int top = st1.pop();
				add(item);
				st1.push(top);
				
			}
			
			//removing the front element from queue
			public int remove() {
				
				return st1.pop();
			}
			
			//peeking the front element of queue
			public int peek() {
				
				return st1.peek();
			}
		}

		
		public static void main(String args[]) {
			QueueTest qt = new QueueTest();
			
			qt.add(13);
			qt.add(14);
			qt.add(15);
			qt.add(16);
			
			while(!qt.isEmpty()) {
				System.out.print(qt.remove() + " ");
				
			}
			
		}
	}
