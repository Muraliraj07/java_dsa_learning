package src.basics;

import java.util.*;
import java.util.stream.Collectors;

public class UsingString {

    public static void main(String[] args){
        List<String> names = Arrays.asList(
                "Ankit", "Ravi", "Amit", "John",
                "Ajay", "Ravi", "Ankit", "Alexander"
        );
        solutions(names);
    }

    public static void solutions(List<String> names){
        List<String> startWith = names.stream()
                .filter(n -> n.startsWith("A"))
                .toList();

        List<String> upperCase = names.stream()
                .map(n -> n.toUpperCase())
                .toList();

        List<String> length = names.stream()
                .filter(n -> n.length()>4)
                .toList();

        Optional<String> longest = names.stream()
                .max(Comparator.comparingInt(String::length));

        List<String> sortByLeng = names.stream()
                .sorted(Comparator.comparing(String::length))  // .sorted(Comparator.comparing(String::length).reversed)
                .toList();

        List<String> sortedNames = names.stream()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .toList();

        Map<String, Long> counts = names.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()));

        List<String> exactlyOne = names.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        long count = names.stream()
                .filter(n -> n.startsWith("A"))
                .count();

        String join = names.stream()
                .collect(Collectors.joining(",", "[", "]"));

        // isEmpty()	Checks whether length is 0
        List<String> result = names.stream()
                .filter(n -> n != null && !n.isBlank()) // Checks empty or whitespace-only strings
                .toList();
    }
}
