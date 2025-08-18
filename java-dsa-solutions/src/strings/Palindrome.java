package strings;

public class Palindrome {

	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
//		str = str.replaceAll("//s+", "").toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
