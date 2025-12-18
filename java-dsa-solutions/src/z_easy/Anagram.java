package z_easy;

import java.util.Arrays;

public class Anagram {

	 public static void main(String[] args) {
	        System.out.println(isAnagram("listen", "silent"));  // true
	        System.out.println(isAnagram("triangle", "integral"));  // true
	        System.out.println(isAnagram("hello", "world"));  // false
	    }
	 
	 public static boolean isAnagram(String s1, String s2) {
	        // Remove spaces and make lowercase for uniform comparison
	        s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();

	        // If lengths differ, not anagrams
	        if (s1.length() != s2.length()) return false;

	        // Convert to char arrays and sort
	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        return Arrays.equals(arr1, arr2);
	    }

}
