package TrieConcept;

import TrieConcept.BasicTrie.*;

public class LongestWord {
	
	static String ans = "";
	public static void longestWord(Node root, StringBuilder temp) {
		
		if(root == null) {
			return;
		}
		for(int i=0; i<26; i++) {
			if(root.children[i] != null && root.children[i].eow == true) {
				temp.append((char)(i+'a'));
				if(temp.length() > ans.length()) {
					ans = temp.toString();
				}
				root = root.children[i];
				
				longestWord(root,temp);
				temp.deleteCharAt(temp.length()-1);
			}
		}		
		
	}
	
	public static void main(String args[]) {
		BasicTrie Tri = new BasicTrie();
		String words[] = {"a", "banana", "app", "ap", "appl", "apply", "apple"};
		
		for(int i=0; i<words.length; i++) {
			Tri.insert(words[i]);
		}
		Node curr = Tri.root;
		longestWord(curr, new StringBuilder(""));
		System.out.println(ans);
	}
}
