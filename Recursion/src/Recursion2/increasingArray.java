package Recursion2;


public class increasingArray {
	public static boolean checkIncreasing(int[] num, int idx) {
		if(idx == num.length - 1) {
			return true;
		}
		if(num[idx]<num[idx+1]) {
			return checkIncreasing(num,idx+1);
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {1,3,3};
		System.out.println(checkIncreasing(arr,0));
		
	}
}
