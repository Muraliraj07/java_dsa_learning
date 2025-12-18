package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex2_Strings {

	public static void main(String[] args) {

		List<String> names = Arrays.asList(
			    "Murali", "Kumar", "Arun", "Kumar", "Vijay", "Aravind", "Mohan", "Anu", "Mani", "Arun"
			);
		practice(names);
	}
	
	public static void practice(List<String> strs) {
		List<String> startsWith = strs.stream().filter(a -> a.startsWith("A")).toList();
		System.out.println("Start With A:" + startsWith);
		
		List<String> endWith = strs.stream().filter(a -> a.endsWith("n")).toList();
		System.out.println("End With n:" + endWith);

		List<String> contains = strs.stream().filter(a -> a.contains("a")).toList();
		System.out.println("Contains - a: " + contains);

		/*		
			. means any character (except newline)
		 	*  means zero or more occurrences
		So .* together means: “match any number of any characters (could be empty, one, or many).”
		*/	
		List<String> withoutVowels = strs.stream().filter(a -> !a.toLowerCase().matches(".*[aeiou]")).toList();
		System.out.println(withoutVowels);
		
		List<String> sortAndLimit = strs.stream().sorted().limit(3).toList();
		System.out.println(sortAndLimit);
		
		List<String> getLongest2Names = strs.stream()
				.sorted(Comparator.comparingInt(String::length).reversed())
				.limit(2)
				.toList();
		System.out.println(getLongest2Names);
		
		
	}

	
}
