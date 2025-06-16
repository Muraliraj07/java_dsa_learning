package arrays;

import java.util.ArrayList;
import java.util.List;

/*
 Given an array nums of distinct integers, return all the 
 possible permutations. You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
*/
public class LP46_All_Possible_Permutations {

	public static void main(String[] args) {
		// For int array
		int arr[] = {1,2,3};
		List<List<Integer>> result = allPermutations(arr);
		for(List<Integer> perm: result) {
			System.out.println(perm);
		}
		
		// For String
		String s = "abc";
		List<String> strResults = allPermutationsString(s);
		for(String perm : strResults) {
			System.out.println(perm);
		}
	}
	
	public static List<List<Integer>> allPermutations(int[] arr){
		List<List<Integer>> result = new ArrayList<>();
		backTrack(arr, 0, result);
		return result;
	}
	
	public static void backTrack(int[] arr, int index, List<List<Integer>> result) {
		if(index == arr.length) {
			List<Integer> perm = new ArrayList<>();
			for(int num : arr) {
				perm.add(num);
			}
			result.add(perm);
			return;
		}
		
		for(int i=index; i<arr.length; i++) {
			swap(arr, index, i);
			backTrack(arr, index + 1, result);
			swap(arr, index, i);
		}
	}
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	/*
	Finding all possible permutations for string
	 */	
	public static List<String> allPermutationsString(String s){
		List<String> result = new ArrayList<>();
		backTrack(s.toCharArray(), 0, result);
		return result;
	}
	
	static void backTrack(char[] chars, int index, List<String> result) {
		if(index == chars.length) {
			result.add(new String(chars));
			return;
		}
		for(int i=index; i<chars.length; i++) {
			swap(chars, index, i);
			backTrack(chars, index+1, result);
			swap(chars, index, i);
		}
	}
	
	private static void swap(char[] chars, int start, int end) {
		char temp = chars[start];
		chars[start] = chars[end];
		chars[end] = temp;
	}
}
