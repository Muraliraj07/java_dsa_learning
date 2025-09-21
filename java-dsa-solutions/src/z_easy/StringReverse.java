package z_easy;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println(reverse1("Hello World"));
		System.out.println(reverse2("Hello World"));
		System.out.println(reverse3("Hello World"));

		
	}
	
	// Output: olleH dlroW
	public static String reverse1(String str) {
		String[] strs = str.split(" ");
		StringBuilder rev = new StringBuilder();
		for(String word : strs) {
			rev.append(new StringBuilder(word).reverse().toString()).append(" ");
		}
		return rev.toString();
	}
	
// Manual way	
	// Output: olleH dlroW
	public static String reverse2(String str) {
		String[] sp = str.split(" ");
		StringBuilder res = new StringBuilder();
		
		for(String s : sp) {
			for(int i=s.length()-1; i>=0; i--) {
				res.append(s.charAt(i));
			}
			res.append(" ");
		}
		return res.toString();
	}
	
	// Output: dlroW olleH
	public static String reverse3(String str) {
		StringBuilder res = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			res.append(str.charAt(i));
		}
		return res.toString();
	}
}
