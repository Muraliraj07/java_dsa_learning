package z_hard;

import java.util.HashMap;
import java.util.Map;

public class LargestSubArray01 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
		System.out.println(larSubArray(arr));
	}

	public static int larSubArray(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxLeng = 0, prefSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			prefSum += (arr[i]==0 ? -1 : 1);
			
			if(prefSum == 0) {
				maxLeng = i+1; 
			}
			
			if(map.containsKey(prefSum)) {
				maxLeng = Math.max(maxLeng, i-map.get(prefSum));
			}
			else {
				map.put(prefSum, i); // storing first occurance
			}
		}
		return maxLeng;
	}
}
