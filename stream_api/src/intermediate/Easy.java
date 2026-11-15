package intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*1. Intermediate Operations
These operations transform a Stream or filter its elements and return another Stream.

They are lazy, meaning they don't execute until a terminal operation is invoked.
Operation	Purpose	Example

* filter()	 Filter elements	              	num > 5
 	- filter() is used when you want to retrieve only those elements that satisfy a particular condition.
 	- It accepts a Predicate functional interface, which returns a boolean (true or false).
 	   (Predicate is a functional interface in Java that checks a condition and returns a boolean (true or false))

* map()	     Transform elements	              	String::toUpperCase
    - map() is used when you want to convert one element into another form.
    - It accepts a Function functional interface.

* flatMap()	 Flatten nested collections	      	Convert List of Lists into List
* distinct() Remove duplicates	              	Unique elements
* sorted()	 Sort elements						Ascending order
* limit()	 Restrict number of elements		First 5 elements
* skip()	 Skip elements						Skip first 2
* peek()	 Inspect elements					Debugging
* takeWhile() Take elements while condition is true	Java 9+
* dropWhile() Drop elements while condition is true	Java 9+

 */

/*
ntermediate operations have two subcategories:
- Stateless: filter(), map(), peek()
- Stateful: sorted(), distinct()
 */
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
