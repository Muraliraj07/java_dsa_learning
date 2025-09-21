package z_mid;

public class ExpandString {

	public static void main(String[] args) {
		String s = "a10b1";
		System.out.println(expandString(s));
	}
	
	public static String expandString(String s) {
		StringBuilder res = new StringBuilder();
		int i=0;
		while(i<s.length()) {
			char c = s.charAt(i++);
			StringBuilder countStr = new StringBuilder();
			while(i<s.length() && Character.isDigit(s.charAt(i))) {
				countStr.append(s.charAt(i++));
			}
			int count = Integer.parseInt(countStr.toString());
			for(int j=0; j<count; j++) {
				res.append(c);
			}
		}
		return res.toString();
	}
}
