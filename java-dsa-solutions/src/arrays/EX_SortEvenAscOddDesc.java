package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EX_SortEvenAscOddDesc {

	public static void main(String[] args) {
		int[] arr = {5, 2, 9, 1, 3, 7};
		sortEvenOdd(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortEvenOdd(int[] arr) {
		List<Integer> evenIndex = new ArrayList<Integer>();
		List<Integer> oddIndex = new ArrayList<Integer>();
		
		for(int i = 0; i<arr.length; i++) {
			if(i%2 == 0) {
				evenIndex.add(arr[i]);
			}
			else {
				oddIndex.add(arr[i]);
			}
		}
		
		Collections.sort(evenIndex);
		
		Collections.sort(oddIndex, Collections.reverseOrder());
//		oddIndex.sort(Collections.reverseOrder());
		int even = 0;
		int odd = 0;
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				arr[i] = evenIndex.get(even++);
			}
			else {
				arr[i] = oddIndex.get(odd++);
			}
		}
	}
}
