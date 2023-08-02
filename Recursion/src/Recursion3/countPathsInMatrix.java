package Recursion3;

public class countPathsInMatrix {
	public static int countPaths(int i, int j, int m, int n) {
		if(i==m || j==n) {
			return 0;
		}
		if(i==m-1 && j==n-1) {
			return 1;
		}
		int rightPath = countPaths(i, j+1, m, n);
		
		int bottomPath = countPaths(i+1, j, m, n);
		
		return rightPath + bottomPath;
	}
	public static void main(String[] args) {
		int m = 3, n = 3;
		int totalPath = countPaths(0,0,m,n);
		System.out.println("total possible path(only right/bottom) from (0,0) to ("+m+","+n+") : " + totalPath);

	}
}
