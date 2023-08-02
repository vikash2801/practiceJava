package Recursion2;
import java.util.Scanner;

public class towerOfHanoi {
	public static void Hanoi(int n, String src, String helper, String dest) {
		if(n==1) {
			System.out.println("transfer disk "+ n + " from "+ src + " -> " + dest);
			return;
		}
		
			Hanoi(n-1, src, dest, helper);
			System.out.println("transfer disk "+ n + " from "+ src + " -> " + dest);
			Hanoi(n-1, helper, src, dest);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfDisk = in.nextInt();
		Hanoi(noOfDisk, "S", "H", "D");
		
		in.close();
	}
}
