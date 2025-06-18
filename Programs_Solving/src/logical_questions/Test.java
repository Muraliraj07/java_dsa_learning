package logical_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		System.out.println(palindrome(1211));
		System.out.println(palindromString("abcb"));
		System.out.println(isPrime(5));
		System.out.println(moveHashToFront("Hello##"));
		System.out.println(longestUniqueSubstr("abcabcd"));
		System.out.println(countFreq("HelloHh"));
		System.out.println(removeVowels("aeisw"));
		System.out.println(areAnagrams("hello", "lleho"));
		System.out.println(toTitleCase("welcome all"));
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
	    Map<Character, Integer> mapStr = new HashMap<>();
	    int left = 0; int maxLength = 0;
	    for(int right=0; right<s.length(); right++) {
	    	char c = s.charAt(right);
	    	if(mapStr.containsKey(c)) {
	    		left = Math.max(left,  mapStr.get(c)+1);
	    	}
	    	mapStr.put(c, right);
	    	maxLength = Math.max(maxLength, right-left+1);
	    }
	    return maxLength;
	}
	
	public static Map<Character, Integer> countFreq(String s){
		Map<Character, Integer> map = new HashMap<>();
	    for (char c : s.toCharArray()) {
	        map.put(c, map.getOrDefault(c, 0) + 1);
	    }
	    return map;
	}
	
	public static String removeVowels(String s) {
		return s.replaceAll("(?i)[aeiou]", "");
	}
	
	public static boolean areAnagrams(String s1, String s2) {
	    if (s1.length() != s2.length()) return false;
	    char[] a1 = s1.toCharArray();
	    char[] a2 = s2.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1, a2);
	}

	public static String toTitleCase(String input) {
	    String[] words = input.toLowerCase().split(" ");
	    StringBuilder result = new StringBuilder();
	    for (String word : words) {
	        if (word.length() > 0) {
	            result.append(Character.toUpperCase(word.charAt(0)))
	                  .append(word.substring(1)).append(" ");
	        }
	    }
	    return result.toString().trim();
	}
}
