package Recursion1;
import java.util.Scanner;

public class powerOfX {
	public static int power(int x, int n) {
		//for stack of stackLength n
		/*if(x == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		return power(x,n-1)*x;
		*/
		
		//for stack of stackLength log(n)
		if(x == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		if(n%2 == 0) {
			return power(x,n/2) * power(x,n/2);
		}
		else {
			return x * power(x,n/2) * power(x,n/2);
		}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		
		System.out.println("power of "+ x + " to the power of "+ n + " : "+ power(x,n));
		in.close();
	}

}
