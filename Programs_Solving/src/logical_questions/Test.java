package logical_questions;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		System.out.println(palindrome(1211));
		System.out.println(palindromString("abcb"));
		System.out.println(isPrime(5));
		System.out.println(moveHashToFront("Hello##"));
		System.out.println(longestUniqueSubstr("abcabcd"));
	}
	
	public static boolean palindrome(int num) {
		int original = num;
		int rem=0;
		int rev=0;
		while(num>0) {
			rem = num%10;
			rev = rev *10 + rem;
			num/=10;
		}
		return rev == original;
	}
	
	public static boolean palindromString(String s) {
		int left = 0; 
		int right = s.length()-1;
		
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean isPrime(int n) {
	    if (n <= 1) return false;
	    for (int i = 2; i * i <= n; i++) {
	    	System.out.println(i*i);
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	
	public static String moveHashToFront(String s) {
	    StringBuilder hash = new StringBuilder();
	    StringBuilder other = new StringBuilder();
	    for (char c : s.toCharArray()) {
	        if (c == '#') hash.append('#');
	        else other.append(c);
	    }
	    return hash.append(other).toString();
	}
	
	public static int longestUniqueSubstr(String s) {
	    Map<Character, Integer> map = new HashMap<>();
	    int left = 0, maxLen = 0;
	    for (int right = 0; right < s.length(); right++) {
	        char c = s.charAt(right);
	        if (map.containsKey(c)) {
	            left = Math.max(left, map.get(c) + 1);
	        }
	        map.put(c, right);
	        maxLen = Math.max(maxLen, right - left + 1);
	    }
	    return maxLen;
	}
}
