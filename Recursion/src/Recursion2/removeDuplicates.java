package Recursion2;

public class removeDuplicates {
	public static boolean[] map= new boolean[26];
	public static void remove(String s, int idx, String newstr) {
		
		if(idx == s.length()) {
			System.out.println("newstring: "+ newstr);
			return;
		}
		char currChar = s.charAt(idx);
		int mapIndex = currChar - 'a';
		if(map[mapIndex] == false) {
			newstr+= currChar;
			map[mapIndex]= true;
			remove(s,idx+1,newstr);
		}else {
			remove(s,idx+1,newstr);
		}
	}
	
	public static void main(String[] args) {
		String str = "abbcddcefe";
		remove(str,0,"");
	}
}
