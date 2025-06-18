package logical_questions;

import java.util.*;

public class practice {
	public static void main(String args[]) {
		System.out.println(primeNumberCheck(2));
		System.out.println(primeNumbers(100));
		System.out.println(swapNumbers(10,20));
		System.out.println(reverse("hello hai 123"));
		palindrome("mom");
		palindromeNum(121);
		armstrong(153);
		
		int []arr= {4,2,5,6,3,1};
		System.out.println(Arrays.toString(ascending(arr)));
/*
// If we want to use Comparator in int. Convert it to its wrapper class

		Integer[] integerArr = new Integer[arr.length];
		for (int i=0; i<arr.length; i++) {
		    integerArr[i] = Integer.valueOf(arr[i]);
		}
		Arrays.sort(integerArr, Comparator.reverseOrder()); 
		System.out.println(Arrays.toString(integerArr));
*/
		String[] arr1 = { "banana", "apple", "orange", "kiwi", "grape" };
		System.out.println(Arrays.toString(ascendingString(arr1)));
System.out.println();	

		String sCount="Hello welcome #007";
		count(sCount);
		
		
		int fn=5;
		fibonacci (fn);
		System.out.println();
		for(int i=0; i<=fn; i++) {
			System.out.print(fibonacciReccursion(i)+" ");
		}
System.out.println();
		
		System.out.println(duplicateCount("Hello world"));
		
		duplicateCount2("Hellod world");
		
		System.out.println(subString("abcde","abc"));
		
		leapYear(2000);
		
		int ary[]= {4,6,3,9,8};
		System.out.println(consMultiply(ary));
		
		int[][] matrix1={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2={{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        int result[][]=matrixMulti(matrix1, matrix2);
        for(int i=0; i<result.length; i++) {
        	for(int j=0; j<result[0].length; j++) {
        		System.out.print(result[i][j]+ " ");
        	}
        	System.out.println();
        }
        
        
        int[] secArr = {5, 8, 2, 10, 3, 9};
        System.out.println(secondLargest(secArr));
        
        int arrZero[]= {0,1,0,3,2,0,2};
        System.out.println(Arrays.toString(moveZero1(arrZero)));
	}

//1 Prime Number	
	static String primeNumberCheck(int n) {
		int c=0;
		for(int i=2; i<=n; i++) {
			if(n%i == 0) {
				c++;
			}
		}
		if(c==1) {
			return "Prime Number";
		}
		
		return "Not a Prime";
	}
	
	static ArrayList<Integer> primeNumbers(int n) {
		ArrayList <Integer>a=new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			int c=0;
			for(int j=1; j<=n; j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				a.add(i);
				
			}
		}
		return a;
	}
//2 swapping	
	static String swapNumbers(int a, int b) {
//		int temp=0;
//		temp=a;
//		a=b;
//		b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		return a+ " "+b;
	}
	
//3 Reverse	
	static String reverse(String s) {
		s = s.toLowerCase();
		String rev;
	    String ans = "";
	    String words[] = s.split(" ");
	    
	    for(int i=0; i<words.length; i++) {
	    	rev=reverseWord(words[i]);
	    	ans=ans.concat(rev)+" ";
	    }
	    
	    return ans;
	}
	static String reverseWord(String s) {
		String ans="";
		for(int i=s.length()-1; i>=0; i--) {
			ans+=s.charAt(i);
		}
		return ans;
	}

//4 Palindrome	
	static void palindrome(String s) {
		s.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String ans="";
		for(int i=s.length()-1; i>=0; i--) {
			ans+=s.charAt(i);
		}
		if(s.equals(ans)) {
			System.out.println("Palindrome");
		}
	}
	
	static void palindromeNum(int n) {
		int rem=0, temp=n, sum=0;
		
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Palindrome");
		}
	}

//5 Armstrong	
	static void armstrong(int n) {
		int rem=0, sum=0, temp=n;
		while(n!=0) {
			rem=n%10;
			sum+=(rem*rem*rem);
			n=n/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("No");
		}
	}

//6 Ascending	
	static int[] ascending(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	static String[] ascendingString(String arr[]) {
		//Arrays.sort(arr);  //Ascending order
		//Arrays.sort(arr, Comparrator.reverseOrder());  //Descending order
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

//7 Counting in string 	
	static void count(String s) {
		int num=0,words=1,chars=0,symbol=0;
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isLetter(c)) {
				chars++;
			}
			else if(Character.isDigit(c)) {
				num++;
			}
			else if(Character.isWhitespace(c)) {
				words++;
			}
			else {
				symbol++;
			}
		}
		System.out.println("Word count: " + words);
		System.out.println("Character count: " + chars);
		System.out.println("Number count: " + num);
		System.out.println("Symbol count: " + symbol);
	}

//8 Fibonacci  Series
	//1
	static void fibonacci (int n) {
		int first=0;
		int second=1;
		int ans=0;
		System.out.print(first+ " "+second+" ");
		
		for(int i=0; i<=n; i++) {
			ans=first+second;
			first=second;
			second=ans;
			System.out.print(ans+ " ");
		}
	}
	//2
	static int fibonacciReccursion(int n) {
		if(n<=1) {
			return n;
		}
		return fibonacciReccursion(n-1)+fibonacciReccursion(n-2); 
	}

// 9 Duplicate count	
	static int duplicateCount(String s) {
		int count=0;
		char[] c=s.toCharArray();
		for(int i=0; i<c.length; i++) {
			for(int j=i+1; j<c.length; j++) {  // condition is i+1, prev is already checked
				if(c[i]==c[j] && c[i]!='0') {
					count++;
					c[j]='0';
				}
			}
		}
		return count;
	}
	
	static void duplicateCount2(String s) {
		char[] c=s.toCharArray();
		
		for(int i=0; i<c.length; i++) {
			int count=1;
			for(int j=i+1; j<c.length; j++) {
				if(c[i]==c[j] && c[i]!='0') {
					count++;
					c[j]='0';
				}
			}
			if(c[i]!='0' && c[i]!=' ') {
				System.out.println("Char "+c[i]+" "+"Index "+i+" "+"Count "+count);
			}
		}
	}

//10 SubString Checking	
	static boolean subString(String s, String sub) {
		
		int sLeng=s.length();
		int subLeng=sub.length();
		
		if(subLeng==0) {
			return true;
		}
		
		if(sLeng==0) {
			return false;
		}
		if(s.charAt(sLeng-1) == sub.charAt(subLeng-1)) {
			return subString(s.substring(0, sLeng-1), sub.substring(0, subLeng-1));
		}
		
		return subString(s.substring(0, sLeng-1), sub);
	}
	
//11 Leap Year	
	static void leapYear(int year) {
		if((year%4 == 0 && year%100 !=0) || year%400 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
//12 Consecutive pair multiply
	static int consMultiply(int arr[]) {
		int ans=0;
		int temp;
		for(int i=0; i<arr.length-1; i++) {
			temp=arr[i]*arr[i+1];
			
			if(temp>ans) {
				ans=temp;
			}
		}
		return ans;
	}

//13 Matrix multiplication
	static int[][] matrixMulti(int m1[][], int m2[][]){
		int ans[][]=new int[m1.length][m1[0].length];
		
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m1[0].length; j++) {
				for(int k=0; k<m2[0].length; k++) {
					ans[i][j] += m1[i][k]* m2[k][j];
				}
			}
		}
		return ans;
	}
	
//14 Second largest
	static int secondLargest(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secLargest && arr[i]<largest) {
				secLargest=arr[i];
			}
		}
		return secLargest;
	}
	
//15 Move all zeros to end
	static int[] moveZero(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]!=0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	// Another method
	static int[] moveZero1(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		
		return arr;
	}
	
}
