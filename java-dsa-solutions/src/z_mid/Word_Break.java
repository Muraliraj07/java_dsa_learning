package z_mid;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Word_Break {

	public static void main(String[] args) {
		String s = "applepenapple";
		List<String> wordDict = Arrays.asList("apple", "pen");
		System.out.println(wordBreak(s, wordDict));
	}
	
//	public static Boolean wordBreak(String s, List<String> wordDict) {
//		for(String st : wordDict) {
//			if(!s.contains(st)) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	public static boolean wordBreak(String s, List<String> wordDict) {
		Set<String> dict = new HashSet<>(wordDict);
		boolean[] dp = new boolean[s.length()+1];
		dp[0] = true; // dp[0]    → "" (empty string)
		
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<i; j++) {
				//dp[j] means no other word used. No shared 
				// Eg: apple -> [apple, app] -> false
				if(dp[j] && dict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

}
