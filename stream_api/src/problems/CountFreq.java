package problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFreq {

	public static void main(String[] args) {
		String s = "Hello";
		freqCount(s);
	}
	
	public static void freqCount(String s) {
		Map<Character, Long> map = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		
		Character firstNonRepStr = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(a-> a.getValue() ==1)
				.map(a -> a.getKey())
				.findFirst()
				.orElse(null);
		System.out.println(firstNonRepStr);
	}

}
