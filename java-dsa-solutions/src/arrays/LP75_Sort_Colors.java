package arrays;

import java.util.Arrays;

public class LP75_Sort_Colors {

	public static void main (String[] args) {
		int[] nums = {2, 0, 2, 1, 1, 0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void sortColors(int[] nums) {
		int start = 0, mid = 0, end = nums.length-1;
		
		while(mid <= end) {
			if(nums[mid] == 0) {
				swap(nums, start, mid);
				start++;
				mid++;
			}
			else if(nums[mid]==1) {
				mid++;
			}
			else {
				swap(nums, mid, end);
				end--;
			}
		}
	}
	
	public static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
}
