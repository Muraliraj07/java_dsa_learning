package strings;

import java.util.Arrays;
import java.util.List;

public class Imp_Logics {

	public static void main(String[] args) {
		String s ="0100100 a";
//		convertToNum(s);
		
		stringMethods();
	}
	
	public static void stringMethods() {
		/* 
		 *  1. equals() vs ==
		 */
		String a = "Java";
		String b = "Java";
		String c = a;
		String d = new String(a);
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(c.equals(d));

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		/* 
		 *  2. subString()
		 */
		
		/* 
		 *  3. split()
		 */
		
		/* 
		 *  4. indexOf() / lastIndexOf()
		 */
		
		/* 
		 *  5. replace() vs replaceAll()
		 */
		
		/* 
		 *  6. trim()
		 */
		
		
		/* 
		 *  7. contains()
		 */
		
		/* 
		 *  8. join()
		 */
		
	
	}

	public static void convertToNum(String s) {
		int[] numArr = s.chars().toArray();  // To get ASCII Values
		System.out.println(Arrays.toString(numArr));
		
		int[] numArr1 = s.chars()
				.map(c -> c - '0') // '0' is ASCII 48 --> '1' - '0' = 1
				.toArray();
		System.out.println(Arrays.toString(numArr1));
		
		int[] numsArr2 = s.chars()
				.map(c -> {
					if(Character.isDigit(c)) return c - '0';
					else return (char) c;
				}).toArray();
		System.out.println(Arrays.toString(numsArr2));
		
		List<Integer> numList = s.chars()
				.boxed()
				.toList();
		System.out.println(numList);
		
		char[] charArr = s.toCharArray();
		System.out.println(charArr);
		
		/*		
		Java: \\ → literal \
		Regex: \s → whitespace matcher
		Combined: "\\s" → whitespace regex inside Java string
		*/		
		String[] stringArr = s.split("\\s");
		System.out.println(Arrays.toString(stringArr));
		
		List<String> stringList = Arrays.asList(s.split("\\s"));
		System.out.println(stringList.toString());		
	}
	
}
