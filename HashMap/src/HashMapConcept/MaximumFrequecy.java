package HashMapConcept;

import java.util.*;
public class MaximumFrequecy {

	public static void main(String args[]) {
		int[] arr = {4,2,4,4,2,8,2,4,2,9};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int max = 0; int maxKey = -1;
		for(int key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				maxKey = key;
			}
		}
		
		System.out.print("Maximum occurance in arr: ");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]);
		}
		System.out.println();
		System.out.println("Key -> Value\n" + maxKey + "  ->  " + max);
	}
}
