package z_easy;

public class Find_Is_SubString {

	public static void main(String[] args) {
		String s1 = "testing12345";
		String s2 = "1234";
		System.out.println(isSubString1(s1, s2));
	}
	
	public static int isSubString(String s1, String s2) {
//	    return s1.contains(s2); // return true or false
		return s1.indexOf(s2);
	}
	
	public static int isSubString1(String s1, String s2) {
	    int n = s1.length();
	    int m = s2.length();

	    if (m == 0) return 0; // empty substring case
	    if (m > n) return -1; // substring longer than string

		/*
		 * Slide over s1
		 * i<m not need. Stop at n-m because inner loop will iterate till last index of s1.
		 */	    
	    for (int i = 0; i <= n - m; i++) {
	        int j;
	        for (j = 0; j < m; j++) {
	            if (s1.charAt(i + j) != s2.charAt(j)) {
	                break; // mismatch, break inner loop
	            }
	        }
	        if (j == m) {
	            return i; // found full match starting at index i
	        }
	    }
	    return -1; // not found
	}
}
