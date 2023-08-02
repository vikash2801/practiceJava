package BinaryTreeConcept;

import java.util.*;

public class BinaryTree1 {
	
	 static class Node{
		int data;
		Node left = null;
		Node right = null;
		
		Node(int data){
			this.data = data;
		}
	}
	
	static class TreeInfo{
		int height;
		int diam;
		
		TreeInfo(int height, int diam){
			this.height = height;
			this.diam = diam;
		}
	}
	static class BinaryTree{
		static Node root = null;
		static int idx = -1;
		
		public Node createTree(int[] arr) {
			idx++;
			
			
				if(arr[idx] == -1 ) {
					return null;
				}
			
				Node temp = new Node(arr[idx]);
				temp.left = createTree(arr);
				temp.right = createTree(arr);
			
			return temp;
		}
		
		
		//PreOrder tranversal of tree
		public void preOrderTraversal(Node root) {
			if(root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}
		
		//InOrder traversal of tree
		public void inOrderTraversal(Node root) {
			if(root == null) {
				return;
			}
			
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
			
		}
		
		//PostOrder traversal of tree
				public void postOrderTraversal(Node root) {
					if(root == null) {
						return;
					}
					
					postOrderTraversal(root.left);
					postOrderTraversal(root.right);
					System.out.print(root.data + " ");
					
				}
				
		///levelOrder traversal of tree
			
			static void levelOrderTraversal(Node curr) {
				if(curr == null) {
					return;
				}
				
				Queue<Node> q = new LinkedList<>();
				q.add(curr);
				q.add(null);
				
				while(!q.isEmpty()) {
					Node temp = q.remove();
					
					if( temp == null) {						
						if(!q.isEmpty()) {
							System.out.println();
							q.add(null);
						}else {
							break;
						}
					}else {
						System.out.print(temp.data + " ");
						if(temp.left != null) {
							q.add(temp.left);
						}
						if(temp.right != null) {
							q.add(temp .right);
						}
					}
				}
				
			}
			
			///counting of nodes in tree
			static int countNodes(Node root) {
				if(root == null) {
					return 0;
				}
				
				int leftCount = countNodes(root.left);
				int rightCount = countNodes(root.right);
				
				return leftCount + rightCount + 1;
			}
			
			//total sum of nodes values
			static int sumOfNodes(Node root) {
				if(root == null) {
					return 0;
				}
				
				int leftSum = sumOfNodes(root.left);
				int rightSum = sumOfNodes(root.right);
				
				return leftSum + rightSum + root.data;
			}
			
			static int height(Node root) {
				if(root == null) {
					return 0;
				}
				
				int leftHeight = height(root.left);
				int rightHeight = height(root.right);
				
				return Math.max(leftHeight, rightHeight) + 1;
			}
				
			//Diameter of a tree
			static TreeInfo diameter(Node root) {
				if(root == null) {
					return new TreeInfo(0,0);
				}
				
				/*
				 * int leftHt = height(root.left); 
				 * int rightHt = height(root.right);
				 * 
				 * int currDiam = leftHt + rightHt + 1; 
				 * int leftDiam = diameter(root.left); 
				 * int rightDiam = diameter(root.right);
				 */
				TreeInfo left = diameter(root.left);
				TreeInfo right = diameter(root.right);
				
				int rootHeight = Math.max(left.height, right.height) + 1;
				
				int leftDiam = left.diam;
				int rightDiam = right.diam;
				int currDiam = left.height + right.height + 1;
				
				int rootDiam = Math.max(currDiam, Math.max(leftDiam, rightDiam));
				
				return new TreeInfo(rootHeight, rootDiam);
				
			}
			
			//identical tree
			static boolean isIdentical(Node root, Node subroot) {
				if(root == null && subroot == null) {
					return true;
				}
				if(root == null || subroot == null) {
					return false;
				}
				if(root.data == subroot.data) {
					return (isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right));
				}
				
				return false;
				
			}
			
			//subTree of a binaryTree
			static boolean findSubTree(Node root, Node subroot) {
				if(subroot == null) {
					return true;
				}
				if(root == null) {
					return false;
				}
				
				if(root.data == subroot.data) {
					if(isIdentical(root,subroot)) {
						return true;
					}
				}
				return findSubTree(root.left, subroot) || findSubTree(root.right, subroot);
				
			}
			
			//sum of Nodes at Kth level
			static int level = 0;
			static int levelOrderSum(Node curr, int K) {
				
				if(curr == null) {
					return 0;
				}
				level++;
				int levelSum = 0;
				
				Queue<Node> q = new LinkedList<>();
				q.add(curr);
				q.add(null);
				
				while(!q.isEmpty()) {

					if(level == K) {
						while(q.peek() != null) {
							levelSum = levelSum + q.remove().data;
						}
						return levelSum;
					}
					
					Node temp = q.remove();
					
					if( temp == null) {						
						if(!q.isEmpty()) {
							level++;
							//System.out.println();
							q.add(null);
						}else {
							break;
						}
					}else {
					//	System.out.print(temp.data + " ");
						if(temp.left != null) {
							q.add(temp.left);
						}
						if(temp.right != null) {
							q.add(temp .right);
						}
					}
				}
				
				return 0;
			}
	}

	public static void main(String args[]) {
		int arr[] = {1,2,4,-1,-1,5,-1,9,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree bt = new BinaryTree();
		//creating binary tree from array
				
		
			bt.root = bt.createTree(arr);

		
		///printing all nodes in preOrder
		System.out.print("preOrderTraversal : ");
		bt.preOrderTraversal(bt.root);
		System.out.println();
		
		///printing all nodes in inOrder
		System.out.print("inOrderTraversal : ");
		bt.inOrderTraversal(bt.root);
		System.out.println();
		
		///printing all nodes in postOrder
		System.out.print("postOrderTraversal : ");
		bt.postOrderTraversal(bt.root);
		System.out.println();
		
		///printing all nodes in levelOrder
		System.out.println("levelOrderTraversal : ");
		bt.levelOrderTraversal(bt.root);
		System.out.println();
			
		//total no of nodes in tree		
		int count = bt.countNodes(bt.root);
		System.out.println("total nodes : " + count);
		
		//sum of Nodes value
		int totalSum = bt.sumOfNodes(bt.root);
		System.out.println("total sum of Nodes value : " + totalSum);
		
		//Height of tree
		int ht = bt.height(bt.root);
		System.out.println("height of tree : " + ht);
		
		//Diameter of tree
		/*
		 * int diam = bt.diameter(bt.root); 
		 * System.out.println("diameter of tree : " + diam);
		 */
		TreeInfo Info1 = bt.diameter(bt.root);
		System.out.println("Diameter of tree : " + Info1.diam);
		
		//subTree of a binaryTree
		int temp[] = {1};
		bt.idx = -1;
		Node subroot = bt.createTree(temp);
		
		System.out.print("subTree preOrderTraversal : ");
		bt.preOrderTraversal(subroot);
		System.out.println();
		
		boolean subTreeAvailable = bt.findSubTree(bt.root, subroot);
		System.out.println("is SubTree present in Tree : " + subTreeAvailable);
		
		//sum of Nodes at Kth level
		int Lsum = bt.levelOrderSum(bt.root,5);
		System.out.println("Sum of Nodes at Kth level : " + Lsum);
	}
}
