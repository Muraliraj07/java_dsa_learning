package array_and_string;

/*
1768. Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
starting with word1. If a string is longer than the other, append the additional letters onto the 
end of the merged string.

Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*/

public class LP_1768_Merge_Strings_Alternately {

	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "pd";
		
		System.out.println(mergeAlternatelySol2(word1, word2));
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
}
