package logical_questions;

import java.util.*;

public class Practice2 {
	public static void main(String args[]) {
		/*
		 * int arr[]= {400, 200, 500, 100}; int t=2;
		 * System.out.println(maxSumSubarray(arr, t));
		 * 
		 * }
		 * 
		 * public static int maxSumSubarray(int[] arr, int k) { int maxSum = 0; int
		 * currentSum = 0;
		 * 
		 * for (int i = 0; i < arr.length; i++) { currentSum += arr[i];
		 * 
		 * if (i >= k - 1) { maxSum = Math.max(maxSum, currentSum); currentSum -= arr[i
		 * - k + 1]; } }
		 * 
		 * return maxSum;
		 */
		
//		for(int i=2; i<20; i++) {
//			int c=0;
//			for(int j=2; j<=i; j++) {
//				if(i%j==0) {
//					c++;
//				}
//			}
//			if(c==1) {
//				System.out.println(i);
//			}
//		}
		
//		int n=11;
//		int c=0;
//		for(int i=2; i<=Math.sqrt(n); i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		System.out.println(c);
//		if(c==1) {
//			System.out.println("Prime");
//		}
		
//		int n=19;
//		int c=0;
//		for(int i=2; i<=Math.sqrt(n); i++) {     // check till it sq root of n i<=math.sqrt(n)  simple and fast
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==0) {
//			System.out.println("Prime");
//		}
//		else {
//			System.out.println("NO");
//		}
		
		/*
		 * String s="Hello hai"; char[] c=s.toCharArray();
		 * 
		 * int st=0; int end=c.length-1;
		 * 
		 * while(st<end) { char temp=c[st]; c[st]=c[end]; c[end]=temp;
		 * 
		 * st++; end--; }
		 * 
		 * String rev=new String(c); System.out.println(rev);
		 */
	
		
	String str="Hello world";
   		
		HashMap<Character, Integer> freqMap=new LinkedHashMap(); // LinkedHashMap to maintain insertion order
		
		for(char c: str.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: freqMap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("First non-repeat character is "+entry.getKey());
				return;
			}
		}

	}
}



