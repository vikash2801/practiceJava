package Recursion2;

public class firstAndLastOccurance {
	public static int first = -1;
	public static int last = -1;
	
	public static void occurance(String s, int idx, char c) {
		
		if(idx == s.length()) {
			System.out.println("first: " + first);
			System.out.println("last: "+ last);
			return;
		}
		
		char curr = s.charAt(idx);
		if(curr == c) {
			if(first == -1) {
				first = idx;
			}
			else {
				last = idx;
			}
		}
		occurance(s,idx+1,c);
	}
	public static void main(String[] args) {
		String str =  "bcafahraieaaio";
		occurance(str,0,'a');
	}
}
