package array_and_string;

public class LP_1071_Gcd_Of_Strings {

	public static void main(String[] args) {
		String s1 = "ABCABC";
		String s2 = "ABC";
		System.out.println(gcdOfString(s1, s2));
	}

	public static String gcdOfString(String s1, String s2) {
		if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }
		int gcdLeng = gcd(s1.length(), s2.length());
		
		return s1.substring(0, gcdLeng);
	}
	
	// Euclidean Algorithm
	private static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
}
