package arrays;

/*
Kadane’s Algorithm

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/
public class LP53_Maximum_Subarray {

	public static void main(String[] args) {
		int[] nums = {5,4,-1,7,8};
		System.out.println(maxSubArraySol2(nums));
	}
	
	// Brute Force O(n²)
	private static int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<nums.length; i++) {
			int sum = 0;
			for(int j=i; j<nums.length; j++) {
				sum+=nums[j];
				if(sum>max) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	// Kadane’s Algorithm (O(n))
	private static int maxSubArraySol2(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum+nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
