package arrays;

public class LP121_Best_Time_to_Buy_Sell_Stock {

	public static void main(String[] args) {
		int[] nums = {7,1,5,3,6,4};
		System.out.println(maxProfit(nums));
	}
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MIN_VALUE;
		int maxPrice = 0;
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
			}
			else {
				maxPrice = Math.max(maxPrice, price - maxPrice);
			}
		}
		return maxPrice;
	}

}
