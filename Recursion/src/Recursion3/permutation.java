package Recursion3;

public class permutation {
	public static void findPermutation(String s, String perm) {
		
		if(s.length()== 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i<s.length(); i++) {
			char currChar = s.charAt(i);
			String newstr = s.substring(0, i) + s.substring(i+1);
			findPermutation(newstr, perm + currChar);
		}
	}
	public static void main(String[] args) {
		String str = "abcd";
		findPermutation(str,"");
	}

}
