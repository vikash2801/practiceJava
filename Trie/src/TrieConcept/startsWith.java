package TrieConcept;

import TrieConcept.BasicTrie.*;
public class startsWith {
	public static BasicTrie tri = new BasicTrie();
	
	public static boolean startswith(String str) {
		Node curr = tri.root;
		for(int i=0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			
			if(curr.children[idx] == null) {
				return false;
			}
			curr = curr.children[idx];
		}
		return true;
	}
	public static void main(String args[]) {
		
		String words[] = {"apple", "banana", "a", "appl"};
		for(int i=0; i<words.length; i++) {
			tri.insert(words[i]);
		}
		System.out.println(startswith("appl"));
		
	}
}
