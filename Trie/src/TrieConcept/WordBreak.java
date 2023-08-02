package TrieConcept;

public class WordBreak {
	static class Node{
		Node[] children;
		boolean eow;
		
		Node(){
			children = new Node[26];
			for(int i=0; i<26; i++) {
				children[i] = null;
			}
			eow = false;
		}
	}
	static class Trie{
		
		static Node root = new Node();
		
		//inserting unique prefix/string in trie
		public static void insert(String item) {
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
		
		//searching a word in Trie
		public static boolean search(String key) {
			Node curr = root;
			
			for(int i=0; i<key.length(); i++) {
				int idx = key.charAt(i) - 'a';
				
				if(curr.children[idx] == null) {
					return false;
				}
				
				if((i == key.length()-1) &&  curr.children[idx].eow == true) {
					return true;
				}
				
				curr = curr.children[idx];				
			}
			return false;
		}
		
		
	}
	
	//finding whether wordBreak is possible or not in a key
	// so that all sub-part are present as separate word in the array
	public static Trie tri = new Trie();
		
	public static boolean wBreak(String key) {
		if(key.length() == 0) {
			return true;
		}
		for(int i=1; i<=key.length(); i++) {
			String firstPart = key.substring(0,i);
			String secondPart = key.substring(i);
			
			if(tri.search(firstPart) && wBreak(secondPart) ) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public static void main(String args[]) {
		String words[] = {"the", "there", "here", "their"};
		
		for(int i=0; i<words.length; i++) {
			tri.insert(words[i]);
		}
		
		System.out.println(tri.search("their"));
		
		System.out.println(wBreak("theirhere"));
		
	}

}
