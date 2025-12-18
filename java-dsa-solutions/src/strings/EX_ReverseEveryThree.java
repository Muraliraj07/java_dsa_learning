package strings;

public class EX_ReverseEveryThree {

	public static void main(String[] args) {
		String str = "JARWIZAB";
		
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i +=3) {
			System.out.println(Math.min(i+3, str.length()));
			String part = str.substring(i, Math.min(i+3, str.length()));
			
			sb.append(new StringBuilder(part).reverse());
		}
		return sb.toString();
	}

}
