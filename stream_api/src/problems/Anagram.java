package problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {

	public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        groupAnagram(words);
	}

	public static void groupAnagram(List<String> strs) {
		
		Map<String, List<String>> map =  strs.stream().collect(Collectors.groupingBy(word -> {
			char[] chars = ((String) word).toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}));
		System.out.println(map);

		map.entrySet()
		.stream()
		.filter(a -> a.getValue().size() > 1)
		.forEach(System.out::println);
		
		
	}
}
