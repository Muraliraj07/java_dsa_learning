package arrays;

import java.util.Arrays;

/*
	A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations 
of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

*/
public class LP31_Next_Permutation {

	public static void main(String[] args) {
//		int[] arr = {5,4,7,5,3,2};
		int[] arr = {5,4,7,3};
		nextPermutation(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void nextPermutation(int[] arr) {
		int i = arr.length-2;
		/*		
		      5
		    2   4
		  1       3
		*/		
		
		// Finding the ele which is greater i+1. we get 2
		while(i>=0 && arr[i]>=arr[i+1]) { 
			i--;
		}
		
		// Again iterating from right and finding the ele which is greater than i
		// else j--
		// Swap it and reverse from index i+1 to form lexicographic order
		if (i >= 0) {
	        int j = arr.length - 1;
	        while (arr[j] <= arr[i]) {
	            j--;
	        }
	        swap(arr, i, j);
	    }
		reverse(arr, i+1, arr.length-1);
		
	}
	
	public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
	}

	public static void swap(int arr[], int start, int end) {
		int temp = arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
	
}
