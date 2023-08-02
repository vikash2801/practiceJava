package TrieConcept;

import TrieConcept.BasicTrie.*;

public class UniqueSubString {
	static int cnt = 1;
	
	public static int count(Node root) {
		if(root == null) {
			return 0;
		}
		for(int i=0; i<26; i++) {
			if(root.children[i] != null) {
				count(root.children[i]);
				cnt++;
			}
			
		}
		return cnt;
	}
	
	public static void main(String args[]) {
		
		String str = "apple";
		int count = 0;
		BasicTrie Tri = new BasicTrie();
		for(int i=0; i<str.length(); i++) {
			String subStr = str.substring(i);
			Tri.insert(subStr);
		}
		System.out.println("total unique subString in " + str + " : " + count(Tri.root));
	}
}
