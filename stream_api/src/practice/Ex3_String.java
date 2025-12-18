package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
1. Find the vowels in a string using streams.

2. Count word frequency in a sentence.

3. Find the longest word and length in a sentence.

4. Check if a given string is a pangram using streams.

5. Find the characters that appear only once in a string.
*/
public class Ex3_String {

	public static void main(String[] args) {
		String s = "Java Streams are Awesome";
		practice(s);
	}

	public static void practice(String s) {
// 1. Find Vowels
		List<Character> vowels = s.toLowerCase()
				.chars()
				.mapToObj(c -> (char) c)
				.filter(ch -> "aeiou".indexOf(ch) >= 0) // If the character is present, it returns its index (position), else -1
				.toList();
		System.out.println("Vowels: " + vowels);
// 2. Freq Count
		Map<Character, Long> freqCount = s.toLowerCase()
				.chars()
				.mapToObj(c -> (char) c)
				.filter(Character::isLetter)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("FreqCount: "+freqCount);
	
// 3. Find Longest word & length
		Optional<String> longWord = Arrays.stream(s.split(" "))
				.max(Comparator.comparing(String::length));		
		System.out.println("Longest word: " + longWord);

		longWord.ifPresent(word ->{
			System.out.println("String word: " + word + " length is: " + word.length());
		});

// 4. Find Unique Chars		
		List<Character> chars = s.toLowerCase().chars()
				.mapToObj(c -> (char) c)
				.filter(Character::isLetter)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e-> e.getValue() == 1)
				.map(e-> e.getKey()).toList();
		System.out.println("Unique Chars: " + chars);

//
		Map<String, Integer> sortedByLength = Arrays.stream(s.split(" "))
		        .sorted(Comparator.comparingInt(String::length))
		        .collect(Collectors.toMap(
		                word -> word,
		                String::length,
		                (oldVal, newVal) -> oldVal,
		                LinkedHashMap::new // keeps insertion order
		        ));

		System.out.println(sortedByLength);

//		
		boolean isPangram = s.toLowerCase()
                .chars()                                      // IntStream of characters
                .filter(Character::isLetter)                  // keep only alphabets
                .mapToObj(c -> (char) c)                      // convert int to Character
                .collect(Collectors.toSet())                  // unique letters
                .size() == 26;                                // check count

        System.out.println("Is Pangram? " + isPangram);
	}
	
}
