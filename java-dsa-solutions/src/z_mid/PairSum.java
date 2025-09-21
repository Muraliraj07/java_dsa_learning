package z_mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSum {

	public static void main(String[] args) {
		int[] arr = {8, 7, 2, 5, 3, 1};
		System.out.println(pairSum(arr, 10));
	}

	public static List<List<Integer>> pairSum(int[] arr, int sum){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		// Brute Force
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				List<Integer> pair = new ArrayList<Integer>();
//				if(arr[i]+arr[j] == sum) {
//					pair.add(arr[i]);
//					pair.add(arr[j]);
//					
//					res.add(pair);
//				}
//			}
//		}
		
		Set<Integer> seen = new HashSet<Integer>();
		for(int num : arr) {
			int rem = sum - num;
			if(seen.contains(rem)) {
				int a = Math.min(num, rem);
				int b = Math.max(num, rem);
				List<Integer> pair = Arrays.asList(a,b);
				if(!res.contains(pair)) {
					res.add(pair);
				}
			}
			seen.add(num);
		}
		return res;
		
	}
}
