package z_easy;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMin_Max {

	public static void main(String[] args) {
		int[] arr = {10, 8, 9};
		System.out.println("MIN -> " + findMin(arr));
		System.out.println("Second Max " +secMax(arr));
		
		System.out.println("Second Min " +secMin(arr));

	}
	
	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}
	
	public static int secMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > max) {
				secMax = max;
				max = num;
			}
			else if(num>secMax && num != max) {
				secMax = num;
			}
			// or 
//			else if(num>secMax && num < max) {
//				secMax = num;
//			}
		}
		return secMax;
	}
	
	public static int secMin(int[] arr) {

		OptionalInt secondMin = Arrays.stream(arr)
                .distinct()        
                .sorted()         
                .skip(1)           
                .findFirst();

        System.out.println(secondMin.isPresent() 
                ? secondMin.getAsInt() 
                : "No second minimum element");

		
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num<min) {
				secMin = min;
				min = num;
			}
			else if(num < secMin && num != min) {
				secMin = num;
			}
		}
		
		return secMin;
	}

}
