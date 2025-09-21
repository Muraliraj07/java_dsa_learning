package z_mid;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(arr));
		
		System.out.println(maxProfitMultiple(arr));
	}
	
	public static int maxProfit(int[] arr) {
		int maxProfit = 0;
		int low = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < low) {
				low = num;
			}
			maxProfit = Math.max(maxProfit, num - low);
		}
		
		return maxProfit;
	}
	
	public static int maxProfitMultiple(int[] arr) {
		int maxProfit = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				maxProfit += arr[i] - arr[i-1];
			}
		}
		return maxProfit;
	}

}
