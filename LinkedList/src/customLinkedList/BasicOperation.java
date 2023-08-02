package customLinkedList;

class Node{
	int data;
	Node next;
	
	Node(){
		
		this.next = null;
	}
	Node(int val){
		this.data = val;
		this.next = null;
	}
}

class LinkedList{
	Node head;
	
	LinkedList(){
		head = null;
	}
	
	LinkedList(int v1){
		head.data = v1;
		head.next = null;
	}
	
	Node addLast(int data) {
		Node temp = new Node(data);
		
		if(head == null) {
			head = temp;
		}else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}		
		
		return head;
	}
	
	Node addFirst(int data) {
		Node temp = new Node(data);
		
		if(head == null) {
			head = temp;
		}else {
			temp.next = head.next;
			head = temp;
		}		
		
		return head;
	}
	
	void printList() {
		
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("NULL");
	}
}

public class BasicOperation {
		
	public static void main(String args[]) {
		LinkedList ll = new LinkedList(4);
		ll.addLast(7);
		ll.addLast(2);
		ll.printList();
		ll.addFirst(8);
		ll.printList();
	}
}
