package pattern_two_pointer;

public class Ex1_Two_Sum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int target = 7;
		System.out.println(twoSum(arr, target));
	}

	public static boolean twoSum(int[] arr, int target) {
		int left = 0, right =arr.length - 1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			
			if(sum == target)return true;
			else if(sum < target) {
				left++;
			}
			else right--;
			
		}
		return false;
	}
}
