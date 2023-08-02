package Recursion2;
import java.util.*;

public class reverseString {
	public static void reverse(String s, int idx) {
		if(idx == -1) {
			return;
		}
		char curr = s.charAt(idx);
		System.out.print(curr);
		reverse(s,idx-1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		reverse(str, str.length()-1);
		in.close();
	}
}