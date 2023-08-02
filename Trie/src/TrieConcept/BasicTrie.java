package TrieConcept;

public class BasicTrie {
	
	static class Node{
		Node[] children;
		boolean eow;
		
		public Node() {
			children = new Node[26];
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
			eow = false;
		}
	}
	
	static Node root = new Node();
	
	static void insert(String item) {
		Node curr = root;
		for(int i=0; i<item.length(); i++) {
			int idx = item.charAt(i) - 'a';
			
			if(curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			if(i == item.length()-1) {
				curr.children[idx].eow = true;
			}
			
			curr = curr.children[idx];
		}
	}
	
	static boolean search(String key) {
		Node curr = root;
		for(int i=0; i<key.length(); i++) {
			int idx = key.charAt(i) - 'a';
			
			if(curr.children[idx] == null) {
				return false;
			}
			if((i == key.length() -1) && (curr.children[idx].eow == false)) {
				return false;
			}
			curr = curr.children[idx];
		}
		return true;
	}
	
	
	
	
	public static void main(String args[]) {
		String words[] = {"the", "a", "there", "their", "any"};
		for(int j=0; j<words.length; j++) {
			insert(words[j]);
		}
		
		System.out.println(search("thor"));
		System.out.println(search("their"));
		System.out.println(search("an"));
	}
}
