package Recursion2;

public class moveAllX {
	public static int count = 0;
	public static void moveX(String s, int idx, String newstr) {
		if(idx == s.length()) {
			for(int i=0; i<count; i++) {
				newstr+= "x";
			}
			System.out.println("updated string: "+ newstr);
			return;
		}
		
		char currChar = s.charAt(idx);
		if(currChar == 'x') {
			count++;
			moveX(s,idx+1,newstr);
		}else {
			newstr+= currChar;
			moveX(s,idx+1,newstr);
		}
	}
	public static void main(String[] args) {
		String str = "abxcxxdxrfxh";
		moveX(str,0,"");
	}

}
