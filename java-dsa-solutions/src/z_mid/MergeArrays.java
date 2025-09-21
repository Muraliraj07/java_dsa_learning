package z_mid;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 3, 5, 6, 10, 9};
		System.out.println(Arrays.toString(mergerArrays(arr1, arr2)));
	}
	
	/*
	 * HashSet : [1, 2, 3, 5, 6, 7] // order is unpredictable, may vary
	 * LinkedHashSet: [5, 1, 7, 3, 2, 6] // preserves insertion order 
	 * TreeSet : [1, 2, 3, 5, 6, 7] // always sorted
	 */
	
	public static int[] mergerArrays(int[] arr1, int[] arr2) {
		Set<Integer> res = new TreeSet<Integer>(); // Use list if you want duplicates also
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] == arr2[j]) {
				res.add(arr1[i]);
				// If you want duplicates also
//				res.add(arr1[j]);
				i++;
				j++;
			}
			else if(arr1[i] < arr2[j]) {
				res.add(arr1[i++]);
			}
			else {
				res.add(arr2[j++]);
			}
		}
		while(i<arr1.length) {
			res.add(arr1[i++]);
		}
		while(j<arr2.length) {
			res.add(arr2[j++]);
		}
		return res.stream().mapToInt(Integer :: intValue).toArray();
	}

}
