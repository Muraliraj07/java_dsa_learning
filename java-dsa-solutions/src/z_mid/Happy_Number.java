package z_mid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Happy_Number {

	public static void main(String[] args) {
//		happyNum(13);
        System.out.println(nextHappy(8));    // next happy number after 13

	}
	
	  public static boolean isHappy(int num) {
	        Set<Integer> seen = new HashSet<>();

	        while (num != 1 && !seen.contains(num)) {
	            seen.add(num);
	            num = sumOfSquares(num);
	        }

	        return num == 1;
	    }
	
	 public static int nextHappy(int num) {
	        int next = num + 1;
	        while (!isHappy(next)) {
	            next++;
	        }
	        return next;
	    }

	    // Helper: sum of squares of digits
	    public static int sumOfSquares(int num) {
	        int sum = 0;
	        while (num > 0) {
	            int d = num % 10;
	            sum += d * d;
	            num /= 10;
	        }
	        return sum;
	    }
	
	
	
	
	
	
	
	public static int happyNum(int num) {
		List<Integer> nums1 = nums(num);
		
		while(num>0) {
			int sum = 0;
			while(sum >=0) {
				List<Integer> nums = nums(sum);
				for(int i=0; i<nums.size(); i++) {
					sum+= nums.get(i);
				}
				if(sum == 1) {
					return num;
				}
			}
			num++;
		}
		return num;
	}
	
	public static List<Integer> nums(int num){
		List<Integer> nums = new ArrayList<>();
		int temp = num;
		while(temp > 0) {
			int rem = temp%10;
			nums.add(rem);
			temp/=10;
		}
		return nums;
	}
}
