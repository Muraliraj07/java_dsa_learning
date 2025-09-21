package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
Problem: Sort characters in a string by decreasing frequency.
Input: "tree"
Output: "eert" or "eetr" (because 'e' appears twice, others once).

SOL: 

Count character frequencies (using Map<Character, Integer>).
Put characters into a priority queue (max heap) based on frequency.
Pop from heap and build the result string.
*/

public class LP451_FreqSort {

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(freqSort(s));
	}
	
	public static String freqSort(String s) {
		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
		
		for(char c: s.toLowerCase().toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
		}
	/*
	This version passes a custom comparator (lambda).
	
	Instead of natural ordering, it orders characters based on their frequency in freqMap.
	
	Because we wrote freqMap.get(b) - freqMap.get(a), it sorts in descending order of frequency (i.e., max-heap behavior).		
	*/
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b) -> freqMap.get(b) - freqMap.get(a));
		pq.addAll(freqMap.keySet());
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			char c = pq.poll();
			int count = freqMap.get(c);
			for(int i=0; i<count; i++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
