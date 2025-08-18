package strings;

public class EX_ExpandCompressedString {

	public static void main (String args[]) {
		String input = "a2b10";
        System.out.println("Expanded: " + expand(input));
	}
	
	public static String expand(String s) {
		StringBuilder res = new StringBuilder();
		int i = 0;
		
		while(i < s.length()) {
			StringBuilder countStr = new StringBuilder();
			char c = s.charAt(i++);
			while(i < s.length() && Character.isDigit(s.charAt(i))) {
				countStr.append(s.charAt(i++));
			}
			
			int count = Integer.parseInt(countStr.toString());
			for (int j = 0; j < count; j++) {
				res.append(c);
			}
		}
		
		return res.toString();
	}
}
