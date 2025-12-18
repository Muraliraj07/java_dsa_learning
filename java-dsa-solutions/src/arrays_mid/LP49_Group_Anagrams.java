package arrays_mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LP49_Group_Anagrams {

	public static void main(String args[]) {
		String[] words = {"eat","tea","tan","ate","nat","bat"};
		usingStream(words);
	}
	
	public static void groupAnagrams(String[] strs){
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String sort = new String(c);
			
/*
	It checks if a given key exists in the map.
	If it already exists, it just returns the existing value (List<String> here).
	If it does not exist, it computes a new value using the lambda (k -> new ArrayList<>()), 
inserts it into the map, and then returns it.			
*/
			map.computeIfAbsent(sort, k -> new ArrayList<>()).add(s);
			
/*			if(map.get(sort) != null) {
				List<String> strList = map.get(sort);
				strList.add(s);
			}
			else {
				List<String> str = new ArrayList<String>();
				str.add(s);
				map.put(sort, str);
			} 
*/
		}
		for(Map.Entry<String, List<String>> maps : map.entrySet()) {
			if(maps.getValue().size()>1) {
				System.out.println(maps.getValue());
			}
		}
	}
	
	public static void usingStream(String[] strs) {
	//	List<String> words = Arrays.asList(strs);
		
		Map<String, List<String>> anagramGroups = Arrays.stream(strs)
				.collect(Collectors.groupingBy(word  -> {
					char[] chars = word.toCharArray();
					Arrays.sort(chars);
					return new String(chars);
				}
				));
		System.out.println(anagramGroups.values());
		
		anagramGroups.values().stream()
		.filter(group -> group.size() > 1)
		.forEach(group -> System.out.println("Anagram group: " + group));

	}
	
}
