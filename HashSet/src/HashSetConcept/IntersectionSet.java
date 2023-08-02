package HashSetConcept;

import java.util.HashSet;
public class IntersectionSet {
	
	static int intersection(int arr1[], int arr2[]) {
		
		HashSet<Integer> set1 = new HashSet<>();
		int n1 = arr1.length;
		int n2 = arr2.length;
		int count = 0;
		
		for(int i=0; i<n1; i++) {
			set1.add(arr1[i]);
		}
		
		for(int j=0; j<n2; j++) {
			if(set1.contains(arr2[j])) {
				count++;
				set1.remove(arr2[j]);
			}
		}
		
		return count;
	}
	
	public static void main(String args[]) {
		int arr1[] = {2,3,4,8};
		int arr2[] = {5,3,6,2,8,4};
		
		int intersectionLen = intersection(arr1,arr2);
		
		System.out.println("length of intersection set: "+ intersectionLen);
	}
}
