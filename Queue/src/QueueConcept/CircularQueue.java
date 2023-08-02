package QueueConcept;

public class CircularQueue {
	static class QueueTest{
		int arr[];
		int size;
		int rear = -1;
		int front = -1;
		
		
		QueueTest(int len){
			size = len;
			arr = new int[size];
		}
		
		public boolean isEmpty() {
			return rear == -1 && front == -1;
		}
		
		public boolean isFull() {
			return front == (rear + 1)%size;
		}
		
		public void add(int val) {
			if(isEmpty()) {
				front = rear = 0;
				arr[rear] = val;
				return;
			}
			if(isFull()) {
				System.out.println("queue overflow");
				return;
			}
			
			rear = (rear + 1)%size;
			arr[rear] = val;
		}
		
		public int remove() {
			
			if(isEmpty()) {
				return -1;
			}
			int frontItem = arr[front];
			front = (front + 1 )%size;
			return frontItem;
		}
		
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return arr[front];
		}
		
	}

	public static void main(String args[]) {
		QueueTest qt = new QueueTest(4);
		
		qt.add(20);
		qt.add(21);
		qt.add(22);
		qt.add(23);
		
		while(!qt.isEmpty()) {
			System.out.print(qt.remove() + " ");
			
		}
	}
}
