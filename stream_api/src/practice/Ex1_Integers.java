package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex1_Integers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 4, 2, 2, 6, 9, 8);
		practice(nums);;
	}
	
	public static void practice(List<Integer> nums) {
		List<Integer> sortAsc = nums.stream().distinct().sorted().toList();
		System.out.println("Sort Asc Nums: " +sortAsc);
		
		List<Integer> sortDesc = nums.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println("Sort Desc Nums: " +sortDesc);
		
		List<Integer> evenNum = nums.stream().filter(n-> n%2 == 0).toList();
		long count = nums.stream().filter(n-> n%2 == 0).count();
		System.out.println("Even Number: " + evenNum + " Count " + count);
		
		
		List<Integer> distinctNums = nums.stream().distinct().toList();
		System.out.println(distinctNums);
		
		List<Integer> uniqueNums = nums.stream()
				.filter(n->Collections.frequency(nums, n) == 1)
				.toList();
		System.out.println("Unique Nums: " + uniqueNums);
		
		List<Integer> between = nums.stream().filter(n -> n>=3 && n<=8).collect(Collectors.toList());
		System.out.println("Between:" + between);
		
		List<Integer> greaterThan = nums.stream().filter(n -> n > 5).toList();
		long greaterThanCount =  nums.stream().filter(n -> n > 5).count();
		System.out.println("GreaterThan: "+ greaterThan + " Count:" + greaterThanCount);
		
		boolean anyMatch = nums.stream().anyMatch(n -> n>5);
		System.out.println("AnyMatch: "+ anyMatch);
		
		boolean allMatch = nums.stream().allMatch(n -> n%2==0);
		System.out.println("AllMatch: " + allMatch);
		
		boolean noneMatch = nums.stream().noneMatch(n -> n<0);
		System.out.println("NoneMatch: " + noneMatch);
		
		
		List<Integer> sqOfNum = nums.stream().map(n -> n*n).toList();
		System.out.println("Sq Of Num: " + sqOfNum);
	
		List<String> numToString = nums.stream()
				.map(n -> "Number - " +n) // String::valueOf or String.valueOf(n)
				.toList();
		System.out.println("Num to String:" + numToString);
		
		long sum = nums.stream().reduce(0, (a, b) -> a+b);
		System.out.println("Sum: " + sum);
		
		long produce = nums.stream().reduce(1, (a, b) -> a*b);
		System.out.println("Sum: " + produce);
		
		int max = nums.stream().max(Integer::compare).get();
		int min = nums.stream().min(Integer::compare).get();
		System.out.println("Max: " + max + " and Min: " + min);
	
		double avg = nums.stream().mapToInt(Integer::intValue)
				.average()
				.getAsDouble();
		System.out.println("Average: " + avg);

		int secMax = nums.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get();
		System.out.println("Sec Max: " + secMax);
	
		Map<Integer, Long> freqCount = nums.stream()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println("Freq Count: " + freqCount);
		
		List<Integer> duplicates = freqCount.entrySet().stream()
				.filter(e -> e.getValue() > 1)
                .map(m -> m.getKey()) // Map.Entry::getKey
                .collect(Collectors.toList());
		System.out.println("Duplicates: "+ duplicates);
		
		Map<String, Long> evenOddCount = nums.stream().collect(Collectors.groupingBy(n -> n%2 == 0 ? "even" : "odd", Collectors.counting()));
		System.out.println("Even vs Odd frequency: " + evenOddCount);

	}

}
