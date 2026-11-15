package src.basics;

import java.util.*;
import java.util.stream.Collectors;

public class UsingNums {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(
                1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 9
        );
    }

    public static void solutions(List<Integer> nums){
        List<Integer> even = nums.stream().filter(num -> num%2 == 0)
                .toList();

        List<Integer> odd = nums.stream().filter(num -> num%2 !=0)
                .toList();

        List<Integer> gretThan = nums.stream().filter(num -> num>5)
                .toList();

        List<Integer> between = nums.stream().filter(num -> (num > 5 && num < 8))
                .toList();

        List<Integer> square = nums.stream().map(num -> num*num)
                .toList();

        List<String> convertToString = nums.stream().map(num -> num.toString())
                .toList();

        List<Integer> distinct = nums.stream()
                .distinct()
                .toList();

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = nums.stream()
                .filter(num -> !seen.add(num))
                .toList();

        List<Integer> exactlyOne = nums.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting())) // or Function.identity() -> Returns the same input value.
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        Long countEven = nums.stream()
                .filter(num -> num%2 == 0)
                .count();

        Integer sum1 = nums.stream()
                .reduce(0, Integer::sum); // reduce() → Custom aggregation.

        int sum2 = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        OptionalDouble average = nums.stream()
                .mapToInt(Integer::intValue)
                .average();

        Integer min = nums.stream()
                .reduce(0, Integer::min); // 0 is initial value

        Integer product = nums.stream()
                .reduce(1, (a,b) -> a*b);

        Optional<Integer> max = nums.stream()
                .max(Integer::compareTo);

        //Stats
        IntSummaryStatistics stats = nums.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        List<Integer> asc = nums.stream()
                .sorted()
                .toList();

        List<Integer> desc = nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        Optional<Integer> sechigh = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        List<Integer> limitMaxThree = nums.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        String join = nums.stream()
                .map(String::valueOf) // convert the numbers to strings
                .collect(Collectors.joining(","));

        List<Integer> list1 = List.of(10, 20, 30, 40, 50);
        List<Integer> list2 = List.of(30, 40, 50, 60, 70);

        List<Integer> common = list1.stream()
                .filter(n-> list2.contains(n))
                .toList();

        List<Integer> diff = list1.stream()
                .filter(n -> !list2.contains(n))
                .toList();

    }
}
