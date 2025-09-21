package z_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 
Eg 1: Input: 13,2 4,15,12,10,5
        Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
        Output: 9,2,7,4,5,6,3,8,1 
        
        Note: count start with 1 not 0
*/
public class SortElements {

	public static void main(String[] args) {
		int[] arr = {13,2, 4,15,12,10,5};
		System.out.println(Arrays.toString(sortOddDescAndEvenAsc(arr)));
	}
	
	public static int[] sortOddDescAndEvenAsc(int[] arr) {
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		int[] res = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int pos = i+1;
			if (pos % 2 == 1) {
				odd.add(arr[i]);
            } else {
                even.add(arr[i]);
            }
		}
		Collections.sort(even);
		Collections.sort(odd, Collections.reverseOrder());
		int eveIndx = 0, oddIndx = 0;
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				res[i] = odd.get(eveIndx++);
			}
			else {
				res[i] = even.get(oddIndx++);
			}
		}
		
		return res;
	}

	
}
