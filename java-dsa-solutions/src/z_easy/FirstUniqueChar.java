package z_easy;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Input:  "leetcode"
	Output: 0   // 'l' is the first non-repeating
*/
public class FirstUniqueChar {

	public static void main(String[] args) {
		String s = "HHello";
		System.out.println(findUinqueChar(s));
		System.out.println(usingStream(s));
	}
	
	public static int findUinqueChar(String str) {
		//LinkedHashMap maintains insertion order
		LinkedHashMap<Character, Integer> indexCharCount= new LinkedHashMap<Character, Integer>();
		
		// To find nth non repeating char
		int findNth = 1;
		for (char c : str.toLowerCase().toCharArray()) {
			indexCharCount.put(c, indexCharCount.getOrDefault(c, 0) + 1);
		}
		
		// To return char
//		for(Entry<Character, Integer> s : indexCharCount.entrySet()) {
//			if(s.getValue() == 1) {
//				return s.getKey();
//			}
//		}
		int currentUniqCharsCount = 1;
		for(int i=0; i<str.length(); i++) {
			if(indexCharCount.get(str.toLowerCase().charAt(i)) == 1) {
				if(currentUniqCharsCount == findNth) {
					return i;
				}
				currentUniqCharsCount++;
			}
		}
		return -1;
	}
	
	public static char usingStream(String str) {
		char res = 0;
		res = str.chars().mapToObj(c -> Character.toLowerCase((char) c))
		.filter(Character::isLetter)   // Function.identity() -> Group identical items together
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream()
		.filter(e -> e.getValue() == 1)
		.map(e -> e.getKey())
		.findFirst().orElseGet(null);
		
		return res;
	}
	
}
