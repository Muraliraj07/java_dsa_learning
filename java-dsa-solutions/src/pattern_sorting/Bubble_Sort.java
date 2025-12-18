package pattern_sorting;

import java.util.Arrays;

/*
Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, 
compares adjacent elements, and swaps them if they are in the wrong order.

The largest (or smallest, depending on sorting order) element “bubbles up” to the correct position 
in each pass.

It’s called bubble sort because smaller elements “bubble” to the top (beginning) while 
larger elements sink to the bottom (end).

Time Complexity: 

Best Case (already sorted): O(n) — if optimized with a swap flag

Worst Case: O(n²)

Average Case: O(n²)

Space Complexity: O(1) (in-place sorting)

*/
public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 5};
		bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean isSwapped;
		for(int i=0; i<n-1; i++) {
			isSwapped = false;
		// n-i-1 --> Last index will be placed larger number each pass. So next time no need to check that.
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			// If no swap happened, array is sorted
			if(!isSwapped) {
				break;
			}
		}
	}

}
