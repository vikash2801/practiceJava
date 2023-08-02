package Recursion3;

public class waysToCallGuests {
	public static int callGuests(int n) {
		if(n<=1) {
			return 1;
		}
		//either call individually
		int way1 = callGuests(n-1);
		
		//or call in pair
		//ways to find pair for one guest = n-1
		int way2 = (n-1)* callGuests(n-2);
		
		return way1 + way2;
	}
	public static void main(String[] args) {
		int noOfGuest = 4;
		int totalWays = callGuests(noOfGuest);
		System.out.println("ways to call "+noOfGuest+ " guest : "+totalWays);
	}
}
