package termination_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/*
3. Terminal Operations
	- toArray(): Converts the stream into an array.
	- min(), max(): Finds minimum or maximum using a comparator.
	- findFirst(), findAny(): Returns first or any element.
	- anyMatch(), allMatch(), noneMatch(): Predicate checks.
	- allMatch()
	- noneMatch()
	- reduce(): Reduces stream to a single value.
*/
public class Examples {

	public static void main(String[] args) {
		examples();
	}
	
	public static void examples() {
		List<Integer> nums = Arrays.asList(1, 5, 2, 3, 4); 
		List<String> names = Arrays.asList("Java", "Python", "Go");
		
		List<String> chars = Arrays.asList("A", "B", "C", "A", "C", "D");
		
		String[] array = names.stream()
		    .toArray(String[]::new);
		
		int[] intArray = nums.stream()
			    .mapToInt(Integer::intValue) // or .mapToInt(n -> n)
			    .toArray();
		
		boolean anyStartWithMatch = names.stream()
				.anyMatch(name -> name.startsWith("J"));
		System.out.println("ANY MATCH -> " + anyStartWithMatch);
		
		int sum = nums.stream()
				.reduce(0, Integer::sum);
		System.out.println("SUM -> " + sum);
		
		int product = nums.stream()
				.reduce(1, (a,b) -> a*b);
		System.out.println("PRODUCT -> " + product);
		
		int max = nums.stream()
				.reduce(0, Integer::max);
		System.out.println("MAX -> "+max);
		
		String longestWord = names.stream()
				.max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println("LONGEST WORD -> " + longestWord);
		
		String concatStrings = names.stream()
				.reduce("", (a,b)-> a+b);
		System.out.println("CONCAT ALL STRING -> " + concatStrings );
		
		Set<String> charSet = new HashSet<>();
		Optional<String> firstDuplicate = chars.stream()
				.filter(c -> !charSet.add(c))
				.skip(1) // remove this if want first duplicate
				.findFirst();
		System.out.println("SECOND DUPLICATE -> " + firstDuplicate);
		
		Map<String, Long> freqMap = chars.stream()
				.collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()));
		Optional<String> firstNonRepChar = freqMap.entrySet().stream()
				.filter(entry -> entry.getValue() ==1)
				.map(Map.Entry::getKey)
//				.skip(1)
				.findFirst();
		System.out.println("FIRST NON-REP CHAR -> " + firstNonRepChar );
	}
}
