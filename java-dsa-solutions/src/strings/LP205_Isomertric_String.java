package strings;

import java.util.HashMap;
import java.util.Map;

/*
 Definition: Two strings s and t are isomorphic if the characters in s can be replaced to get t, with a one-to-one mapping.
"egg" & "add" → true
"foo" & "bar" → false

SOL:
Use two maps (or arrays since only ASCII/char range is small).
Map from characters in s → characters in t.
Map from characters in t → characters in s (to prevent two chars mapping to same char).
Traverse both strings together and check mapping consistency.
*/
public class LP205_Isomertric_String {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add")); 
//		System.out.println(isIsomorphic("foo", "bar"));
		System.out.println(isIsomorphic("ab", "cc")); 

	}
	
	public static Boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) return false;
		
		Map<Character, Character> mapS = new HashMap<Character, Character>();
		Map<Character, Character> mapT = new HashMap<Character, Character>();
		
		// Iterate and put each char s against t -> eg: s=egg, t=add -> {e=a}, {g=d} like this
		for(int i=0; i<s.length(); i++) {
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			
			if(mapS.containsKey(s1)) {
				if(mapS.get(s1) != t1) return false;
			}
			else {
				mapS.put(s1, t1);
			}
			
			if(mapT.containsKey(t1)) {
				if(mapT.get(t1) != s1) return false;
			}
			else {
				mapT.put(t1, s1);
			}
		}
		return true;
	}

}
