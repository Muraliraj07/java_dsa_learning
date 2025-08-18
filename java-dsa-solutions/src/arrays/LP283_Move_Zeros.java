package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Given an integer array nums, move all 0's to the end of it while maintaining 
the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

/*
1. MOVE ZEROS TO END
2. MOVE ZEROS TO START
3. MOVE ZEROS TO END USING STREAM
*/

public class LP283_Move_Zeros {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12, 0};
//		moveZerosToEnd(nums);
//		System.out.println(Arrays.toString(nums));
		
		moveZerosToStart(nums);
		System.out.println(Arrays.toString(nums));
		
		List<Integer> numList = Arrays.asList(1, 0, 3, 9, 0);
		List<Integer> result = moveZeroToEndUsingStream(numList);
		System.out.println(result);
	}
// 1. MOVE ZEROS TO END	
	public static void moveZerosToEnd(int[] nums) {
		int index = 0;
		for(int num : nums) {
			if(num != 0) {
				nums[index++]=num;
			}
		}
		while(index < nums.length) {
			nums[index++] = 0;
		}
	}
// 2. MOVE ZEROS TO START
	public static void moveZerosToStart(int[] nums) {
		int index = nums.length-1;
		for(int i = nums.length-1; i >=0; i--) {
			if(nums[i] != 0) {
				nums[index] = nums[i];
				index--;
			}
		}
		while(index >= 0) {
			nums[index--] = 0;
		}
	}
// 3. MOVE ZEROS TO END USING STREAM
	public static List<Integer> moveZeroToEndUsingStream(List<Integer> nums) {
		List<Integer> result = Stream.concat(
				nums.stream().filter(n -> n!=0), 
				nums.stream().filter(n -> n==0))
				.toList();
		return result;
	}

}
