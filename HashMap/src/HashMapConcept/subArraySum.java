package HashMapConcept;

import java.util.HashMap;
public class subArraySum {
	
	static int totalSubArr(int[] arr,int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		map.put(0,1);
		int sum = 0;
		int ans = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			
			if( map.containsKey(sum-k)) {
				ans+= map.get(sum-k);
			}
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum)+1);
			}else {
				map.put(sum, 1);
			}
		}
		
		return ans;
		
	}
	
	public static void main(String args[]) {
		int arr[] = {10,2,-2,-20,10};
		
		int k = -10;
		int count = totalSubArr(arr,k);
		System.out.print("Total subArray having sum " + k + " : " + count);
	}
}
