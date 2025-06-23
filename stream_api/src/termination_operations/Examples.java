package termination_operations;

import java.util.Arrays;
import java.util.List;

/*
3. Terminal Operations
	- toArray(): Converts the stream into an array.
	- min(), max(): Finds minimum or maximum using a comparator.
	- findFirst(), findAny(): Returns first or any element.
	- anyMatch(), allMatch(), noneMatch(): Predicate checks.
	- reduce(): Reduces stream to a single value.
*/
public class Examples {

	public static void main(String[] args) {

	}
	
	public static void examples() {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4); 
		List<String> names = Arrays.asList("Java", "Python", "Go");
		
		String[] array = names.stream()
		    .toArray(String[]::new);
		
		int[] intArray = nums.stream()
			    .mapToInt(Integer::intValue) // or .mapToInt(n -> n)
			    .toArray();

	}
}
