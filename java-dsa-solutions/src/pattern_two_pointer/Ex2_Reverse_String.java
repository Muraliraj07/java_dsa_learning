package pattern_two_pointer;

public class Ex2_Reverse_String {

	public static void main(String[] args) {
		String s = "Murali";
		reverse(s);
		System.out.println(s);
	}

	public static void reverse(String s) {
		char[] c = s.toCharArray();
		int left = 0, right = s.length() - 1;

		while(left < right) {
			char temp = c[left];
			c[left] = c[right];
			c[right] = temp;
			
			left++;
			right++;
		}
	}
	
}
