package z_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// A Leader in an array is an element that is greater than or equal to all the elements to its right.

/*
 * Storing the max number and comparing with that while iterating
 * Eg: max = 5 -> 3>5 false
 * 4 > 5 -> false
 * 17 > 5 -> true (adding to list)
 */	
public class LeaderInArray {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		System.out.println(findLeaders(arr));
	}
	
	public static List<Integer> findLeaders(int[] arr){
		List<Integer> res = new ArrayList<Integer>();
		int n = arr.length;
		int maxFromRight = arr[n-1];
		res.add(maxFromRight);
			
		for(int i = n-2; i>=0; i--) {
			if(arr[i] >= maxFromRight) {
				res.add(arr[i]);
				maxFromRight = arr[i];
			}
		}
		Collections.reverse(res); // reversing
		return res;
	}

}
