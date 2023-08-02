package QueueConcept;

import java.util.*;

public class QueueAL {
	
	static class QueueTest{
		ArrayList<Integer> arrList = new ArrayList<>();
		
		
		public boolean isEmpty() {
			return arrList.size() == 0;
		}
		
		public void add(int item) {
			arrList.add(item);
		}
		
		public int remove() {
			if(isEmpty()) {
				return -1;
			}
			int front = arrList.get(0);
			for(int i=0; i<arrList.size()-1; i++) {
				int temp = arrList.get(i+1);
				arrList.set(i, temp);
			}
			arrList.remove(arrList.size()-1);
			return front;
		}
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return arrList.get(0);
		}
	}

	
	public static void main(String args[]) {
		QueueTest qt = new QueueTest();
		
		qt.add(5);
		qt.add(6);
		qt.add(7);
		qt.add(8);
		
		while(!qt.isEmpty()) {
			System.out.print(qt.remove() + " ");
			
		}
		
	}
}
