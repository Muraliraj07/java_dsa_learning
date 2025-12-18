package problems;

import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "Programming";
		removeDuplicate(s);
	}
	
	public static void removeDuplicate(String s) {
		String res = s.chars()
				.mapToObj(c -> (char) c)
				.distinct()
				.map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(res);
	}
}
