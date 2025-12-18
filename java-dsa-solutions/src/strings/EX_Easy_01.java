package strings;

import java.util.Arrays;

public class EX_Easy_01 {

	public static void main(String[] args) {
		reverseString();
		checkPalindrome();
		String str = "madam";
		System.out.println(isPalindromeRec(str, 0, str.length()-1));
			
	}

	public static void reverseString() {
		/*
		 * Solution 1		
		*/
		String str = "java";
		char[] strArray = str.toCharArray();
		int start = 0; int end = str.length()-1;
		
		while(start < end) {
			swap(strArray, start, end);
			start++;
			end--;
		}
		System.out.println(Arrays.toString(strArray));
		System.out.println(new String(strArray));
		
		/*
		 * Solution 2		
		*/
		String rev = "";
		for(int i = str.length() - 1; i>=0; i--) {
			rev = rev + str.substring(i, i+1);
		}
		System.out.println(rev);
	
		/*
		 * Solution 3		
		*/
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public static void swap(char[] strArray, int start, int end) {
		char temp = strArray[start];
		strArray[start] = strArray[end];
		strArray[end] = temp;
	}
	
	public static void checkPalindrome() {
		String str = "madam"; 
		/*
		 * Solution 1		
		*/
		int start = 0; int end = str.length()-1;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				System.out.println(false);
				return;
			}
			start++;
			end--;
		}
		System.out.println(true);
		
		/*
		 * Solution 2		
		*/
		char[] strArray = str.toCharArray();
		start = 0; end = str.length()-1;
		while(start < end) {
			if(strArray[start] != strArray[end]) {
				System.out.println(false);
				return;
			}
			start++;
			end--;
		}
		System.out.println(true);
	}
	/*
	 * Solution 3		
	*/
	public static boolean isPalindromeRec(String str, int start, int end) {
		if(start >= end) {
			return true;
		}
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return isPalindromeRec(str, start+1, end-1);
	}
}
