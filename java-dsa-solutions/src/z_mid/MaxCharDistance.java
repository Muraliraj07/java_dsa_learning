package z_mid;

import java.util.HashMap;
import java.util.Map;

public class MaxCharDistance {

	public static void main(String[] args) {
		String str = "abcada";
		System.out.println(charDistance(str));
	}

	/*
		Iterate and add to hashmao all char and index
		if(same char found on second time then check with max which is greater)
		   max, i-map.get(char(i))-1
		
	*/
	public static int charDistance(String str) {
		int max = 0;
		
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(chars.containsKey(str.charAt(i))) {
				max = Math.max(max, i - chars.get(str.charAt(i)) -1 );
			}
			else {
				chars.put(str.charAt(i), i);
			}
		}
		return max;
	}
}
