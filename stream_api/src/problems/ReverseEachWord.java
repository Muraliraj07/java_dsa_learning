package problems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "Hello World";
		reverseEachWord(s);
	}

	public static void reverseEachWord(String s) {
		String res = Arrays.stream(s.split(" "))
				.map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(res);
	}
	
}
