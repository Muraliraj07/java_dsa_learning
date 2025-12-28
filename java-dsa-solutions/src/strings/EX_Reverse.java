package strings;

import java.util.Arrays;

public class EX_Reverse {

	public static void main(String[] args) {
		String str = "java";
		System.out.println(strReverse(str));
	}

	public static String strReverse(String s) {
		int start = 0;
		int end = s.length()-1;
		char[] charArr = s.toCharArray();
		while(start<end){
			swap(charArr, start++, end--);
		}
		System.out.println(charArr); // OUTPUT: avaj -> Because PrintStream.println(char[]) is overloaded to print characters as a string
		System.out.println(Arrays.toString(charArr));// OUTPUT: [a, v, a, j] -> it’s a formatted array representation
		System.out.println(charArr.toString()); // OUTPUT: [C@396e2f39 -> Useless for arrays. It prints object reference, because arrays do not override toString().
		return new String(charArr); //OUTPUT: avaj -> Return String
	}

	public static void swap(char[] charArr, int start, int end){
		char temp = charArr[start];
		charArr[start] = charArr[end];
		charArr[end] = temp;
	}
}
