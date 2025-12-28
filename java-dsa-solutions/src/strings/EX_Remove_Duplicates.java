package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EX_Remove_Duplicates {

	public static void main(String args[]) {
		String s1 = "hello";
		System.out.println(removeDupSol1(s1));
		System.out.println(removeDupSol2(s1));
		
		String s2 = "hello welcome all";
		System.out.println(removeDuplicateWords(s2));
	}
	
public static String removeDupSol1(String s) {
	String uniq = s.chars()
			.distinct().mapToObj(c -> String.valueOf((char)c))
			.collect(Collectors.joining());
	return uniq;
}

public static String removeDupSol2(String s) {
	Set<Character> set = new LinkedHashSet<Character>();
	for(char c : s.toCharArray()) {
		set.add(c);
	}
	StringBuilder res = new StringBuilder();
	for(char c : set) {
		res.append(c);
	}
	return res.toString();
}

public static String removeDuplicateWords(String sentence) {
    String[] words = sentence.split("\\s+"); // -- \\s+ means one or more white spaces eg: hello    welcome
    Set<String> seen = new LinkedHashSet<>();

    for (String word : words) {
        seen.add(word);
    }

    StringBuilder sb = new StringBuilder();
    for (String word : seen) {
        sb.append(word).append(" ");
    }

    return sb.toString().trim();
}


}
