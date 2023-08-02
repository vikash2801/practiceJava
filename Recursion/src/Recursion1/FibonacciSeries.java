package Recursion1;
import java.util.*;

public class FibonacciSeries {
	public static void fibonacci(int first, int second, int noOfTerms) {
		if(noOfTerms == 1) {
			System.out.print(first + " ");
			return;
		}
		if(noOfTerms == 2) {
			System.out.print(first + " " + second + " ");
			return;			
		}
		
		System.out.print(first + " ");
		int next = first + second;
		fibonacci(second,next,noOfTerms -1);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		fibonacci(0,1,num);
		in.close();
	}
}
