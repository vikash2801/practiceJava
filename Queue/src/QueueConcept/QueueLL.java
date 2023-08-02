package QueueConcept;

public class QueueLL {
	private static class Node{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}

	static class QueueTest{
		static Node head = null;
		
		
		public boolean isEmpty() {
			return head == null;
		}
		
		public void add(int item) {
			Node newItem = new Node(item);
			if(isEmpty()) {
				head = newItem;
				return;
			}
			
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = newItem;
		}
		
		public int remove() {
			if(isEmpty()) {
				return -1;
			}
			int front = head.data;
			head = head.next;
			return front;
		}
		
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}

	
	public static void main(String args[]) {
		QueueTest qt = new QueueTest();
		
		qt.add(9);
		qt.add(10);
		qt.add(11);
		qt.add(12);
		
		while(!qt.isEmpty()) {
			System.out.print(qt.remove() + " ");
			
		}
		
	}
}
