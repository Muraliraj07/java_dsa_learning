package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Easy {

	public static void main(String[] args) {
		programs();
	}
	
	public static void programs() {
		List<String> names = Arrays.asList("Ravi", "Ankit", "John");
		List<Integer> scores = Arrays.asList(45, 87, 87, 62, 95, 78);


		List<String> sortString = names.stream()
				.sorted()
				.toList();
		System.out.println("Sort -> " + sortString + "\n");
		
		List<String> sortReverse = names.stream()
				.sorted(Comparator.reverseOrder())
				.toList();
		System.out.println("Sort reverse -> " + sortReverse + "\n");
		
		List<Integer> top3 = scores.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.toList();
		System.out.println("Top 3 scores in list -> " + top3 + "\n");
		
	}

}
