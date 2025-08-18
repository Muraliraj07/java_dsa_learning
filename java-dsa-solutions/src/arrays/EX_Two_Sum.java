package arrays;

import java.util.HashSet;
import java.util.Set;

public class EX_Two_Sum {

	public static void main(String[] args) {
		int[] arr = {1, 3, 7, -1, 4, 2};
		int target = 6;
		Set<String> pairs = twoSum(arr, target);
		System.out.println(pairs);
	}
	
	private static Set<String> twoSum(int[] arr, int target) {
		Set<String> pairs = new HashSet<String>();
		Set<Integer> seen = new HashSet<Integer>();
		
		for(int num : arr) {
			int rem = target - num;
			if(seen.contains(rem)) {
				int a = Math.min(num, rem);
				int b = Math.max(num, rem);
				String pair = a + "," + b;
				if(!pairs.contains(pair)) {
					pairs.add(pair);
				}
			}
			seen.add(num);
		}
		return pairs;
	}
	
}
