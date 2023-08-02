package QueueConcept;

//Queue using double linked list
import java.util.*;
public class QueueDST {

			static class QueueTest{
				Stack<Integer> st1 = new Stack<>();
				Stack<Integer> st2 = new Stack<>();
							
				//checking Queue is empty or not
				public boolean isEmpty() {
					return st1.isEmpty();
				}
				
				//adding element at the rear in Queue 
				public void add(int item) {
					
					//empting first stack to add new item at bottom
					while(!st1.isEmpty()) {
						st2.push(st1.pop());
					}
					st1.push(item);
					//placing all prev item back to stack1
					while(!st2.isEmpty()) {
						st1.push(st2.pop());
					}
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
				
				qt.add(17);
				qt.add(18);
				qt.add(19);
				qt.add(20);
				
				while(!qt.isEmpty()) {
					System.out.print(qt.remove() + " ");
					
				}
				
			}
		}

