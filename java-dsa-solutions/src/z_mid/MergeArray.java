package z_mid;

import java.util.Arrays;

/*
 * Array merge with adjacent equals → double current, shift zeros to end
 * Array merge problem (sometimes called the “2048 game style” merge)
*/
public class MergeArray {

	public static void main(String[] args) {

		int[] arr = {2, 2, 0, 4, 4, 8};
		mergeArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeArray(int[] arr) {
		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i-1] == arr[i]) {
//				arr[i-1] = arr[i-1] + arr[i];
//				arr[i] = 0;
//			}
//		}
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] !=0 && arr[i] ==  arr[i+1]) {
				arr[i] = arr[i] * 2;
				arr[i+1] = 0;
			}
		}
// Shifting zeros to end		
		int index = 0;
		for(int num :arr) {
			if(num != 0) {
				arr[index++] = num; 
			}
		}
		while(index < arr.length) {
			arr[index++] = 0;
		}
		
// Shifting zeros to start		
	
//		int index = arr.length-1;
//		for(int i=arr.length-1; i>=0; i--) {
//			if(arr[i] != 0) {
//				arr[index--] = arr[i];
//			}
//		}
//		while(index >= 0) {
//			arr[index--] = 0;
//		}
	}
}
