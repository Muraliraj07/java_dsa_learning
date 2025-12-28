package problems;

import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "Programming";
		removeDuplicate(s);
	}
	
	public static void removeDuplicate(String s) {
		/* 
		 * Solution 1		
		*/
		String res1 = s.chars()
				.mapToObj(c -> (char) c)
				.distinct()
				.map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(res1);
		
		/* 
		 * Solution 2		
		*/
		String res2= s.chars().distinct()
				.mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.joining());
		System.out.println(res2);
	}
}
