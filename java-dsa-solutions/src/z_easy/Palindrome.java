package z_easy;

public class Palindrome {

	public static void main (String[] args) {
		String s = "I DID, DID I?";
		System.out.println(checkPalindrome(s));
	}
	
	public static boolean checkPalindrome(String str) {
		boolean isPalindrome = true;
		str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			if(str.charAt(start) !=  str.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		return isPalindrome;
	}
}
