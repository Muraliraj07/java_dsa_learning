package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Easy {

	public static void main(String[] args) {
		programs();
	}
	
	public static void programs() {
		List<String> names = Arrays.asList("Ravi", "Ankit", "John");
		List<Integer> scores = Arrays.asList(45, 87, 87, 62, 95, 78);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 1);
		map.put("Spring", 2);

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
		
		map.entrySet()
		.forEach(a -> System.out.println(a.getKey()  +' ' + a.getValue()));
		
		List<Integer> num = scores.stream().distinct().toList();
		System.out.println(num);
		
	}

}
