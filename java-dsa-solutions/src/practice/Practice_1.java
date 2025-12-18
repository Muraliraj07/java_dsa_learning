package practice;

import java.util.HashMap;

public class Practice_1 {

	public static void main(String[] args) {
		String word1 = "abcabcd";
		String word2 = "pd";
		
//		System.out.println(mergeAlternatelySol2(word1, word2));
		
		System.out.println(longSubString(word1));
	}

	public static String mergeAlternatelySol1(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int i=0, j=0, k=0;
        StringBuilder res = new StringBuilder();

        while(i<l1 && j<l2){
            if(k%2==0){
                res.append(word1.charAt(i++));
            }
            else{
                res.append(word2.charAt(j++));
            }
            k++;
        }
        while(i<l1){
            res.append(word1.charAt(i++));
        }
        while(j<l2){
            res.append(word2.charAt(j++));
        }
    return res.toString();
	}
	
	public static String mergeAlternatelySol2(String word1, String word2) {
		StringBuilder res = new StringBuilder();
		int n = Math.min(word1.length(), word2.length());
		
		for(int i=0; i<n; i++) {
			res.append(word1.charAt(i));
			res.append(word2.charAt(i));
		}
		
		if(word1.length() < word2.length()) {
			res.append(word2.substring(n));
		}
		if(word2.length() < word1.length()) {
			res.append(word1.substring(n));
		}
		
		return res.toString();
	}
	
	
	public static String longSubString(String s) {
		String res = "";
		HashMap<Character, Integer> map = new HashMap<>();
		int currMax = 0; int max = 0;
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				currMax = i - map.get(s.charAt(i));
				max = Math.max(max, currMax);
				res = s.substring(map.get(s.charAt(i)), i);
			}
			else {
				map.put(s.charAt(i), i);
			}
		}
		return res;
	}
}
