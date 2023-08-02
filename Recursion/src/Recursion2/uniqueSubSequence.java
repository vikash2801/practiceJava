package Recursion2;
import java.util.HashSet;

public class uniqueSubSequence {
	public static void findSubSequence(String s, int idx, String newstr, HashSet<String> hset) {
		
		if(idx == s.length()) {
			if(hset.contains(newstr)) {
				return;
			}else {
				hset.add(newstr);
				System.out.println(newstr);
				return;
			}
			
		}
		
		char currChar = s.charAt(idx);
		//want to be added
		findSubSequence(s,idx+1, newstr + currChar, hset); 
		
		//doesn't want to be added
		findSubSequence(s,idx+1, newstr, hset);
	}
	public static void main(String[] args) {
		String str = "aaa";
		HashSet<String> set = new HashSet<>();
		findSubSequence(str,0,"",set);
	}
}
