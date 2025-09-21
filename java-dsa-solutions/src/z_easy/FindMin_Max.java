package z_easy;

public class FindMin_Max {

	public static void main(String[] args) {
		int[] arr = {10, 8, 9};
		System.out.println("MIN -> " + findMin(arr));
		System.out.println("Second Max " +secMax(arr));
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

}
