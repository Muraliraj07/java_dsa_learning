package intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Hard {

	public static void main(String[] args) {
		programs();
	}
	
	public static void programs () {
		List<Integer> numsWithDuplicates = Arrays.asList(1,2,2,3,4,4,5,6);
		List<Integer> nums = Arrays.asList(3, 4, 1, 2, 5, 6);

		
		List<Integer> distinctNums = numsWithDuplicates.stream()
				.filter(num -> Collections.frequency(numsWithDuplicates, num) == 1)
				.toList();
		System.out.println("Distinct Nums -> "+ distinctNums + "\n");
		
		Map<Integer, Long> freqCount = numsWithDuplicates.stream()
				.collect(Collectors.groupingBy(n-> n, Collectors.counting()));
		System.out.println("Frequency Count -> " + freqCount + "\n");
		
		List<Integer> nonDuplicates = numsWithDuplicates.stream()
				.filter(n -> freqCount.get(n) == 1)
				.toList();
		System.out.println("Distinct Nums sol2 -> " + nonDuplicates + "\n");

		List<Integer> sort = nums.stream()
		    .sorted(Comparator.<Integer>comparingInt(n -> n % 2).thenComparingInt(n -> n))
		    .toList();
		System.out.println("Sort even first then odd nums -> " + sort + "\n");
		
		Optional<Integer> secondLargest = numsWithDuplicates.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		System.out.println("Second Largest -> " + secondLargest.orElseGet(null) + "\n");
		
	}
}
