package logical_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class string {
/* 1. Count characters
 * 1.1 Swapping
 * 1.2 Palindrome
 * 1.3 String Reverse
 * 2. Check vowles and consonents
 * 3. Anagram
 * 4. Remove Spaces
 * 5. Change Lower Case to Upper case & vice versa
 * 6. Duplicate Words in String
 * 7. String count the number of words
 */

//1. Count Charactets
	
	/*
	// Chars count in a string
		public static Map<Character, Integer> charCount(String str){
			Map<Character,Integer> charCount = new HashMap<>();
			char[] chars = str.toLowerCase().toCharArray();
			for(char c : chars) {
				if(c != ' ') {
					if(!charCount.containsKey(c)) {
						charCount.put(c, 1);
					}
					else {
						charCount.put(c, charCount.get(c)+1);
					}
				}
			}
			return charCount;
		}
		*/
	
	/*public static void main (String args[]) {
		String str ="hello welcome to world.";
		int count = 0, c=1;
		for (int i = 0; i<str.length(); i++) {
			if (str.charAt(i)!=' ') {
				count++;
			}
			if (str.charAt(i)==' ') {
				c++;
				}
			}
		System.out.println(c);
		System.out.println(count);
	}*/
	
//	1.1 Swapping
	
//	int a=10, b=20, c;
//	c=a;
//	a=b;
//	b=c;
//	System.out.println(a);
//	System.out.println(b);
	
/*	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
*/
	
//	1.2 Palindrome

/*	int a=121;
	int temp, r=0, s;
	temp=a;
	
	while(a>0) {
		s=a%10;
		r=(r*10)+s;
		a=a/10;
		}
	System.out.println(r);
	
	if(r==temp) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
*/
	/*String s="heleh";
	char[] c=s.toCharArray();
	String st="";
	
	for(int i=s.length()-1; i>=0; i--) {
		st=st+s.charAt(i);
	}
	System.out.println(st);
	if(st.equals(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("No");
	}*/
	
	
//1.3  String Reverse
	/*
	public static void main(String args[]) {
		String s="Hello Hai";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println("");
		
		char[] c=s.toCharArray();
		for(int j=c.length-1;j>=0;j--) {
			System.out.print(c[j]);
		}
		
		//using string builder
		StringBuilder sb=new StringBuilder(s);
		System.out.println("\n"+sb.reverse());
	}
	*/

	
// 2.Check Vowles & Consonents 	
/*	public static void main (String args[]) {
		String str = "AeiOu jsj";
		str = str.toLowerCase();
		int count = 0, c = 0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)== 'o' || str.charAt(i) == 'u' ) {
				count++;
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
				c++;
			}
		}
		System.out.println(count);
		System.out.println(c);	
	}*/
	
// 3. Anagram	
/*	public static void main (String args[]) {
		String str = "Brag";
		String str1 = "Grab";
		
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		
		if (str.length()!=str1.length()) {
			System.out.println("not anagram");
		}
		else {
			char c[] = str.toCharArray();
			char c2[] = str1.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c2);
			
		if (Arrays.equals(c, c2)==true)	{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
			for(int i=0;i<a.length();i++) {
			if(a1[i]!=b1[i]) {
				System.out.println("No");
				break;
			}
			else {
				System.out.println("Yes");
				break;
			}
		}
	}*/
//4. Remove Spaces

	
/*		public static void main (String args[]) {
			String str = "welcome here hello.";
			str = str.replaceAll("\s","");
			System.out.println(str);
		}
*/		
//5. Change Lower Case to Upper Case & Vice Versa
	
/*		public static void main (String args[]) {
			String str = "Hello World";
			StringBuffer str1 = new StringBuffer(str);
			
			for (int i = 0; i<str.length();i++) {
				if(Character.isLowerCase(str.charAt(i))){
					str1.setCharAt(i, Character.toUpperCase(str.charAt(i)));
				}
				else if (Character.isUpperCase(str.charAt(i))) {
					str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
				}
			}
			System.out.println(str1);
		}
*/
//6. Duplicate Words	
	
/*		public static void main (String args[] ) {
			String str = "hello world hello hello world World on the On world"; 
			int count;
			str = str.toLowerCase();
			String words[]=str.split(" ");
			
			System.out.println("Duplicate Words");
			for(int i =0; i<words.length; i++) {
				count = 1;
				for(int j = i+1; j<words.length; j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j]="0";
					}
				}
				if (count>1 && words[i]!="0") 
					System.out.println(words[i]+" " +count);
				
			}
		}*/
/*	public static void main(String[] args) {
		String s="hello hai";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
		
		char[] c=s.toCharArray();
		for(int i=s.length()-1; i>=0;i--) {
			System.out.print(c[i]);
		}
		} */

// 7. String count number of words	 
	/*
	 	public static void main(String args[]) {
//Using split
		
		String s="The work work is is done work";
		String[] s1=s.split("");
		
		for(int i=0;i<s1.length;i++) {
			int c=1;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i].equals(s1[j])){
					c++;
					s1[j]="0";
				}
			}
			if(s1[i]!="0") {
			System.out.println(s1[i]+" "+c);
			}
		}
		
		System.out.println("--------");
		
// Convert to chararray
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			int c1=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					c1++;
					c[j]='0';
				}
			}
			if(c[i]!='0' && c[i]!=' ') {
			System.out.println(c[i]+" "+c1);
			}
		}
	}
	 */

}



































