package Recursion1;
import java.util.*;

public class FactorialOfNumber {
	public static void factorial(int n, int fact) {
		if(n==0) {
			System.out.println("factorial : " + 1);
			return;
		}
		if(n==1) {
			System.out.println("factorial : " + fact);
			return;
		}
		fact = fact * n;
		factorial(n-1,fact);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		factorial(num,1);
		
		in.close();
	}
}
