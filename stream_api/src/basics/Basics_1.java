package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basics_1 {

	public static void main(String[] args) {
		basics();
	}
	
	public static void basics() {
		List<String> names = Arrays.asList("Ankit", "Ravi", "Amit", "John", "Ajay");
		
		List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7);
		
		List<String> emails = Arrays.asList("a@gmail.com", "b@yahoo.com", "c@gmail.com");
		
		List<String> filterNames = names.stream()
		.filter(name -> name.startsWith("A"))
		.collect(Collectors.toList());
		
		System.out.println("Filter start with A -> " + filterNames +"\n");
	
		List<String> upperCaseAll = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("Uppercase all string -> " + upperCaseAll +"\n");
		
		long count = names.stream()
				.filter(name -> name.length()>4)
				.count();
		
		System.out.println("Count char greater than n -> " + count +"\n");
		
		List<String> filterByCount = names.stream()
				.filter(name -> name.length()>4).collect(Collectors.toList());
		
		System.out.println("Filter name char count > n -> " + filterByCount +"\n");
		
		List<Integer> evenNums = nums.stream()
				.filter(num -> num % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println("Filter even nums -> " + evenNums +"\n");
		
		/*
	 	Returns an unmodifiable list
	 		 	
	 	validEmails.add("Hello"); Throws UnsupportedOperationException
	 	because .toList() is immutable introduced in java 16
	 	
	 	collect(Collectors.toList() -- is mutable
		*/	
		List<String> validEmails = emails.stream()
				.filter(email -> email.endsWith("@gmail.com")).toList();
		
		System.out.println("Filter valid emails -> " + validEmails +"\n");
		
		long validEmailCount = emails.stream()
				.filter(email -> email.endsWith("@gmail.com")).count();
		
		System.out.println("Count valid emails -> " + validEmailCount +"\n");

		
	}
}
