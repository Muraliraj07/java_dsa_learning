package z_mid;

public class RemoveUnbalancedParentheses {

	public static void main(String[] args) {
		String s = "(abc))((de))";
		System.out.println(removeUnbalanced(s));
	}

	public static String removeUnbalanced(String s) {
		StringBuilder res = new StringBuilder();
		boolean[] remove = new boolean[s.length()];
		int balance = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				balance++;
			}
			else if(s.charAt(i) == ')') {
				if(balance > 0) {
					balance--;
				}
				else {
					remove[i] = true;
				}
			}
		}
		
		balance = 0;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == ')') {
				balance++;
			}
			else if(s.charAt(i) == '(') {
				if(balance > 0) {
					balance--;
				}
				else {
					remove[i] = true;
				}
			}
		}
		
		for(int i=0; i<s.length(); i++) {
			if(!remove[i]) {
				res.append(s.charAt(i));
			}
		}
		return res.toString();
		
	}
}
