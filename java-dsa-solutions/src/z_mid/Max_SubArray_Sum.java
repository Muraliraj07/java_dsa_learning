package z_mid;

import java.util.Arrays;

/*
	Given an integer array (may contain negative numbers), 
find the contiguous subarray that has the largest sum.
   
 Input:  [-2,1,-3,4,-1,2,1,-5,4]
 Output: 6
 Explanation: Subarray [4,-1,2,1] has the largest sum = 6
 
 Sol: 
 
 Initialize currSum and maxSum as arr[0]
 Use currSum (currSum, arr[i] +currSum) to check which value is max
 Check that with maxSum and replace.

*/
public class Max_SubArray_Sum {

	public static void main(String[] args) {
		int[] arr = {2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(maxSubArray(arr));
	}

	//Kadane’s Algorithm
	public static int maxSubArraySum2(int[] arr) {
		int maxSub = arr[0];
		int currSub = arr[0];
		
		// Already index 0 initialized to currentSum. So start with index 1
		for(int i=1; i<arr.length; i++) {
			currSub = Math.max(arr[i], currSub + arr[i]);
			maxSub = Math.max(maxSub, currSub);
		}
		return maxSub;
	}
	
	// Brute force
	public static int maxSubArraySum(int[] arr) {
		int currMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=i; j<arr.length; j++) {
				sum+=arr[j];
				currMax = Math.max(currMax, sum);
			}
		}
		return currMax;
	}

// Returning max subarray	
	/*
 	Initialize maxEnd and max = arr[0]
 	add to maxEnd until current value(arr[i] > maxEnd + arr[i] and tempStart as i
 	
 	if(maxEnd > max) - Found MaxSubArray So, set start as tempStart & end as i
 	
*/	
	public static String maxSubArray(int[] arr) {
		int max = arr[0];
		int maxEnd = arr[0];
		
		int start=0, end=0, tempStart = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > maxEnd + arr[i]) {
				maxEnd = arr[i];
				tempStart = i;
			}
			else {
				maxEnd+=arr[i];
			}
			if(maxEnd > max) {
				max = maxEnd;
				start = tempStart;
				end = i;
			}
		}
		int[] res = new int[end-1];
		int i = 0;
		while(start <= end) {
			res[i] = arr[start];
			i++;
			start++;
		}
		return Arrays.toString(res);
	}

}
