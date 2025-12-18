package pattern_sorting;

/*
1. Concept

Insertion Sort is like how you arrange cards in your hand while playing:
Start with the first card (already sorted).
Take the next card and place it in the correct position relative to the first.
Keep inserting the next card into the correct spot among the already sorted cards.
So at each step, the left portion of the array is sorted, and you insert the current element into it.

2. Time Complexity

Best Case (already sorted): O(n) → just one comparison per element.

Worst Case (reverse sorted): O(n²).

Average Case: O(n²).

Space Complexity: O(1) (in-place).

Stable Sort: ✅ Yes.

*/
import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] arr = {7, 8, 4, 5, 2};
		insertionSort(arr);
        System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			int val = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > val) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = val;
		}
	}
}
