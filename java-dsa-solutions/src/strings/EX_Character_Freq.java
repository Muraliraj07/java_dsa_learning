package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EX_Character_Freq {

	public static void main(String args[]) {
		charFreq("Helloh");
	}
	
	static void charFreq(String s) {
		Map<Character, Long> freqCount = s.toLowerCase().chars().mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(freqCount);
		
		// Works only with LinkedHashSet (Maintain Insertion Order)
//		for(Entry<Character, Long> ls : freqCount.entrySet()) {
//			if(ls.getValue()==1) {
//				System.out.println(ls.getKey());
//				break;
//			}
//		}
		
		Map<Character, Integer> fMap = new HashMap<Character, Integer>();
		for(char c : s.toLowerCase().toCharArray()) {
			fMap.put(c, fMap.getOrDefault(c, 0)+1);
		}
		System.out.println(fMap);
		for(Map.Entry<Character, Integer> count : fMap.entrySet()) {
			System.out.println(count.getKey() + "=" + count.getValue());
		}
	}
}
