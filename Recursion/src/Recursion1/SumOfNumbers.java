package Recursion1;
import java.util.*;

public class SumOfNumbers {
	public static int calculateSum(int n) {
		if(n==1) {
			return 1;
		}
		
		return calculateSum(n-1) + n;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("sum of first " + num + " natural numbers is "+ calculateSum(num));
		in.close();
	}
}
