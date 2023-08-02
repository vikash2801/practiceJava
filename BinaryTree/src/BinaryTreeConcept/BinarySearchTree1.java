package BinaryTreeConcept;

import BinaryTreeConcept.BinaryTree1.Node;

public class BinarySearchTree1 {
		
	static class BST{
		
		public Node createTree(Node curr, int elem) {
			Node temp = new Node(elem);
			
			if(curr == null) {
				curr = temp;
				return curr;
			}
			
			if(curr.data > elem) {
				curr.left = createTree(curr.left,elem);
			}else {
				curr.right = createTree(curr.right,elem);
			}
			return curr;
		}
		
		//printing BST in InOrderTraversal
		public void printBST(Node curr) {
			if(curr == null) {
				return;
			}
			
			printBST(curr.left);
			System.out.print(curr.data + " ");
			printBST(curr.right);
		}
		
		//searching an element
		public boolean search(Node root, int item) {
			if(root == null) {
				return false;
			}
			
			if(root.data == item) {
				return true;
			}else if(root.data > item) {
				return search(root.left, item);
			}else {
				return search(root.right, item);
			}
			
		}
		
		//find InOrderSuccessor (from Right SubTree)
		public Node InOrderSuccessor(Node root) {
			while(root.left != null) {
				root = root.left;
			}
			return root;
		}
		
		//deleting an element in BST
		public Node deletion(Node root, int del_item) {
			
			if(root == null) {
				System.out.println(del_item + " is not present in BST");
				return null;
			}
			
			if(root.data == del_item) {
				if(root.left == null && root.right == null) {
					return null;
				}
				if(root.left == null) {
					return root.right;
				}
				if(root.right == null) {
					return root.left;
				}
				
				Node IS = InOrderSuccessor(root.right);
				root.data = IS.data;
				root.right = deletion(root.right,IS.data);
				
			}else if(root.data > del_item) {
				root.left = deletion(root.left, del_item);
			}else {
				root.right = deletion(root.right, del_item);
			}
			
			return root;
		}
		
	}
	
	
	
	
	public static void main(String args[]) {
		int arr[] = {4,2,6,8,3,1};
		BST bt = new BST();
		Node btRoot = null;
		for(int i=0; i<arr.length; i++) {
			btRoot = bt.createTree(btRoot, arr[i]);
		}
		bt.printBST(btRoot);
		System.out.println();
		
		//search an element
		boolean varFind = bt.search(btRoot, 8);
		System.out.println("is 8 present in BST: " + varFind);
		
		//deletion of Nodes
		Node newRoot = bt.deletion(btRoot,4);
		System.out.println("BSTree after deletion");
		bt.printBST(newRoot);
	}
}
