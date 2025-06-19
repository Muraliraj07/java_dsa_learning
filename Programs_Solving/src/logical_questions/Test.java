package logical_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		System.out.println(palindrome(1211));
		System.out.println(palindromString("abcb"));
		System.out.println(isPrime(5));
		System.out.println(moveHashToFront("Hello##"));
		
		int[] nums = {1,0,32,0,22};
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println(longestUniqueSubstr("abcabcd"));
		System.out.println(countFreq("HelloHh"));
		System.out.println(removeVowels("aeisw"));
		System.out.println(areAnagrams("hello", "lleho"));
		System.out.println(toTitleCase("welcome all"));
		
		System.out.println(stringRev("abcd"));
		System.out.println(numberRev(123));
		
		System.out.println(secLar(nums));
		int[] sort012 = {1,0,2,1,1,0};
		sort012(sort012);
		System.out.println(Arrays.toString(sort012));
		
		System.out.println(removeDuplicates("Hello"));
		System.out.println(firstNonRepChar("HHello"));
		
		String[] arr = {"welc", "we", "welcome"};
		System.out.println(longestCommonPrefix(arr));
		
		System.out.println("lengthOfLongestSubString -> "+lengthOfLongestSubString("abcabcd"));
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
	
	public static void moveZeros(int[] nums) {
		int index = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] !=0) {
				nums[index++] = nums[i];
			}
		}
		while(index<nums.length) {
			nums[index++] = 0;
		}
/*		int size = 0;
		int[] result = new int[nums.length];
		for(int n : nums) {
			if(n != 0) {
				result[size]=n;
				size++;
			}
		}
		while(size<nums.length) {
			result[size]=0;
			size++;
		}
		return result; */
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
	
	public static int lengthOfLongestSubString(String str) {
		int i =0, max = 0, j=0;
		Set<Character> set = new HashSet<Character>();
		while(i<str.length()) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i++));
				max = Math.max(max, set.size());
			}
			else {
				set.remove(str.charAt(j++));
			}
		}
		return max;
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
		
		for(String word : words) {
			if(word.length()>0) {
				result.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1))
				.append(" ");
			}
		}
		return result.toString().trim();
	}
	
	public static String stringRev(String s) {
		int left = 0;
		int right = s.length()-1;
		char[] chars = s.toCharArray();
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}
	
	public static int numberRev(int num) {
		int rev = 0;
		
		while(num != 0) {
			int rem = num%10;
			rev = rev *10 + rem;
			num/=10;
		}
		return rev;
	}
	
	public static int secLar(int[] nums) {
		int largest = nums[0];
		int secLargest = nums[0];
		for(int num : nums) {
			if(num>largest) {
				secLargest = largest;
				largest = num;
			}
			else if(num > secLargest && num != largest) {
				secLargest = num;
			}
		}
		return secLargest;
	}
	
	public static void sort012(int[] nums) {
		int low = 0, mid=0, high=nums.length-1;
		while(mid<=high) {
			if(nums[mid]==0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid]=temp;
				low++; mid++;
			}
			else if(nums[mid]==1) {
				mid++;
			}
			else {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
	}
	
//	Kadane’s Algorithm
	public static int maxSubArr(int[] arr) {
		int maxSum = 0;
		int currSum = 0;
		for(int i=0; i<arr.length; i++) {
			currSum = Math.max(currSum, arr[i]+currSum);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
	
	public static String removeDuplicates(String str) {
		StringBuilder result = new StringBuilder();
		Set<Character> seen = new HashSet<>();
		for (char c : str.toCharArray()) {
		    if (seen.add(c)) result.append(c);
		}
		return result.toString();
	}
	
	public static Character firstNonRepChar(String str) {
		LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<Character, Integer>();
		
		for(char c : str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) +1);
		}
		
		for(Map.Entry<Character, Integer> e: freqMap.entrySet()) {
			if(e.getValue()==1) {
				return e.getKey();
			}
		}
		return null;
	}
	
	public static String longestCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++) {
	    	System.out.println(strs[i].indexOf(prefix));
	        while (strs[i].indexOf(prefix) != 0)
	            prefix = prefix.substring(0, prefix.length() - 1);
	    }
	    return prefix;
	}
	
}
