package arrays_mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Given an unsorted array of integers nums, return the length of the 
longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. 
Therefore its length is 4.
*/

public class LP128_Longest_Consec_Seq {

	public static void main(String[] args) {
		int arr[] = {0,1,2,5,5,6,7,8,8};
		System.out.println(longestConsectiveCount(arr));
	}
// SOL: 1	
	public static int longestConsectiveCount(int[] arr) {
		int maxLeng = 0;
		
//		Set<Integer> nums = new HashSet<Integer>();
//		for(int num : arr) {
//			nums.add(num);
//		}
//		Set<Integer> set = Arrays.stream(arr)
//				.boxed() // will convert from int to Integer (autobox)
//				.collect(Collectors.toSet());
		
		Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
		
		for(int num : set) {
			// Only start from the beginning of a sequence
			if(!set.contains(num-1)) {
				int currentNum = num;
				int currentMax = 1;
				
				while(set.contains(currentNum+1)) {
					currentNum++;
					currentMax++;
				}
				maxLeng = Math.max(maxLeng, currentMax);
			}
		}
		return maxLeng;
	}
	
// SOL:2	
	public static int longCon(int[] arr) {
		int maxLeng = Integer.MIN_VALUE;
		int currMaxLeng = 1;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+1 == arr[i+1]) {
				currMaxLeng++;
			}
			else {
				currMaxLeng = 1;
			}
			if(maxLeng<currMaxLeng) {
				maxLeng = currMaxLeng;
			}
		}
		return maxLeng;
	}

}
