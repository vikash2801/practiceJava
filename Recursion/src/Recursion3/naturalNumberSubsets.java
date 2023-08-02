//print all the subsets of a set of first n natural numbers
package Recursion3;
import java.util.*;

public class naturalNumberSubsets {
	public static void findSubsets(int n, ArrayList<Integer> arrlist) {
		if(n==0) {
			for(int i =0; i<arrlist.size(); i++) {
				System.out.print(arrlist.get(i));
			}
			System.out.println();
			return;
		}
		//to be added
		arrlist.add(n);
		findSubsets(n-1, arrlist);
		
		//not to be added
		arrlist.remove(arrlist.size() -1);
		findSubsets(n-1, arrlist);
	}
	public static void main(String[] args) {
		int n = 3;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		findSubsets(n,arrList);
	}
}
