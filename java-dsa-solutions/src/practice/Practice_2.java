package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Practice_2 {

	public static void main(String args[]) {
		int[] nums = {2,11,15, 4};
		System.out.println(Arrays.toString(twoSum(nums, 9)));
		
		String str = "abcabcbb";
		System.out.println(lengOfSubString(str));
	}
	
	
	public static int lengOfSubString(String str) {
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int left = 0;
		for(int right=0; right<str.length(); right++) {
			if(map.containsKey(str.charAt(right))) {
				left = Math.max(left, map.get(str.charAt(right)) +1);
			}
			map.put(str.charAt(right), right);
			max = Math.max(max, right-left + 1);
		}
		return max;
	}
	
	public static int[] twoSum(int[] nums, int target) {
		for(int i=1; i< nums.length; i++){
            for(int j =i; j<nums.length; j++){
                if(nums[j-i] + nums[j] == target){
                    return new int[] {j, j-i};
                }
            }  
        }
        return new int[2];
	}
}
