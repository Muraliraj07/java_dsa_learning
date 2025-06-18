package logical_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice3 {
	public static void main (String args[]) {
		int[]arr= {2,3,5,1,6,4};
		int target=15;
		
		System.out.println(Arrays.toString(sortArr(arr)));
//		System.out.println(check(arr, target));
		
	}
	
	public static boolean check(int[] arr, int target) {
		Arrays.sort(arr);
		int left=0;
		int right= arr.length-1;
		
		while(left<right) {
			int currSum=arr[left]+arr[right];
			
			if(currSum==target) {
				return true;
			}
			else if(currSum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		return false;
	}
	
	
	public static boolean isPalindrome(String s) {
	    int left = 0;
	    int right = s.length() - 1;

	    while (left < right) {
	        if (s.charAt(left) != s.charAt(right)) {
	            return false; // Not a palindrome
	        }
	        left++;
	        right--;
	    }
	    return true; // It's a palindrome
	}
	
	
	public static int[] sortArr(int[] s) {
		
//		for(int i=0; i<arr.length; i++) {
//			int a = arr[0], temp = arr[0];
//			int b = 0;
//			if(arr[i] > temp) {
//				b = arr[i];
//				arr[i] = temp;
//				temp = b;
//			}
//		}
		return s;
	}

}
