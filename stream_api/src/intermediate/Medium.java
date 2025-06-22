package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Medium {
	
	public static void main(String[] args) {
		programs();
	}

	public static void programs() {
		List<String> items = Arrays.asList("banana", "apple", "pear");
		List<Integer> nums = Arrays.asList(5, 1, 4, 2, 3);
		List<Integer> numsWithDuplicates = Arrays.asList(1, 3, 4, 1, 5, 3, 4, 6);

		// .sorted will compare only int we can't check boolean like a.length() > b.length()
		List<String> sortByLength = items.stream()
				.sorted((a,b) -> a.length() - b.length()) // b.length() - a.length() for desc
				.toList();
		
		List<String> sortByLength2 = items.stream()
				.sorted(Comparator.comparingInt(String::length)).toList(); // .reverse.toList
		
		System.out.println("Sort by length -> "+ sortByLength + "\n" );
		System.out.println("Sort by length 2 -> "+ sortByLength2 + "\n" );
		
		List<Integer> sortAndSkip = nums.stream()
				.sorted()
				.skip(2)
				.toList();
		
		List<Integer> sortDescAndSkip = nums.stream()
			//	.peek(n -> System.out.println("Printing value - " +n)) // for debugging purpose to print values
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.toList();
			
		System.out.println("Sort and skip first n values -> " + sortAndSkip + "\n" );
		System.out.println("Sort desc and skip first n values -> " + sortDescAndSkip + "\n" );
				
		List<Integer> distinctValues = numsWithDuplicates.stream()
				.distinct()
				.limit(3)
				.toList();
		System.out.println("Remove duplicates and return first n distinct -> " + distinctValues);
		
		

		
	}
		
}
