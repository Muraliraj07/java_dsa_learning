package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LP1624_Largest_SubString_Count {

	public static void main(String args[]) {
		String s = "abcddesacbb";
		System.out.println(subStringCount(s));
		System.out.println(lengthOfLongestSubstringSol1(s));
	}
	
	// With duplicates - Longest distance between same char
	public static int subStringCount(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxLeng = -1;
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				// map.get(s.charAt(i))-1 -> abca -> 3-0-1 -> 2
				maxLeng = Math.max(maxLeng, i - map.get(s.charAt(i))-1);
			}
			map.put(s.charAt(i), i);
		}
		return maxLeng;
	}
	
	// Without Duplicates
	public static int lengthOfLongestSubstringSol1(String s) {
	    Map<Character, Integer> map = new HashMap<>();
	    int maxLen = 0;
	    int start = 0;
/*	    
i=0: 'a' → window = "a" → maxLen=1
i=1: 'b' → window = "ab" → maxLen=2
i=2: 'c' → window = "abc" → maxLen=3
i=3: 'a' again → move start from 0 → 1 → window = "bca"
i=4: 'b' again → move start from 1 → 2 → window = "cab"
*/	    
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if (map.containsKey(c)) {
	            start = Math.max(start, map.get(c) + 1); // Moving the start if same char found again
	        }
	        map.put(c, i);
	        maxLen = Math.max(maxLen, i - start + 1);
	    }
	    return maxLen; //desacb
	}

	
	public static int lengthOfLongestSubstringSol2(String s) {
		Set<Character> seen = new HashSet<Character>();
		int maxLeng = 0;
		int left = 0;
		for(int i=0; i<s.length(); i++) {
			if(seen.contains(s.charAt(i))) {
				seen.remove(s.charAt(left));
				left++;
			}
			maxLeng = Math.max(maxLeng, i - left +1);
			seen.add(s.charAt(i));
		}
		return maxLeng;
	}
}
