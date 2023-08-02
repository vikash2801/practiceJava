package Recursion3;

public class waysOfTilesFitting {
	public static int noOfWays(int n, int m) {
		
		if(n==m) {
			return 2;
		}
		if(n<m) {
			return 1;
		}
		//if 1*m tiles placed vertically
		int vertPath = noOfWays(n-m,m);
		
		//if 1*m tiles placed horizontally
		int horiPath = noOfWays(n-1,m);
		
		return vertPath + horiPath;
		
	}
	public static void main(String[] args) {
		int n=4, m=2;
		int total = noOfWays(n,m);
		System.out.println("total ways to fix (1*"+m+") tiles on ("+n+"*"+m+") floor : " + total);
	}
}
