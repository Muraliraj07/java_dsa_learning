package pattern_sorting;

import java.util.Arrays;

/*
Selection Sort is another simple comparison-based algorithm.

It works by repeatedly finding the minimum (or maximum) element from the unsorted part 
of the array and putting it at the beginning.

Unlike Bubble Sort (which swaps many times in each pass), Selection Sort makes at most one swap per pass.


Time Complexity:

Best Case: O(n²)

Worst Case: O(n²)

Average Case: O(n²)

Space Complexity: O(1)

*/
public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
		selectionSort(arr);;
		System.out.println(Arrays.toString(arr));
	}
	
	// Find the minimum value and replace it to starting index++
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}
