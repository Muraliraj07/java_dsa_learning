 
package logical_questions;

import java.util.*;
/* 1. odd or even
 * 1.1 Prime number Check
 * 1.2 swap two variables
 * 2. String Reverse
 * 3. number reverse
 * 4.palindrome number
 * 5.palindrome string
 * 6.Armstrong Number
 * 7. Ascending 
 * 8.Descending
 * 9. Butterfly Suffle program
 * 10. Count words and characters
 * 11. fibnocci series
 * 12. Prime Number
 * 13. Multiplication table
 * 14. duplicates in string
 * 15. Factorial program
 * 16. Square
 * 17. Leap year
 * 18. Consecutive elements
 * 19. Consecutive pair multiply
 */
public class examples {
	// 1. odd or even
	
/*	public static void main (String args[]) {
	//int n = 6;
		int n;
		System.out.println("enter num");
		Scanner s = new Scanner (System.in);
		n= s.nextInt();
		
		if (n%2 == 0) {
			System.out.println("even");
			
		}
		else
			System.out.println("odd");
	}*/
	
	/*public static void main (String args[]) {
      int n ;
      Scanner s = new Scanner (System.in);
      System.out.println("enter the size: ");
      n = s.nextInt();
      
      int[] arr= new int[n];
      System.out.println("enter the numbers: ");
      for (int i =0; i<n; i++) {
    	  arr[i]= s.nextInt();
      }
      
      System.out.println("the even numbers are: ");
      for(int i = 0; i<n; i++) {
    	  if (arr[i]%2==0) {
    		System.out.print(arr[i]+" ");  
    	  }
      }
      System.out.println(" ");
      System.out.println("the odd numbers are; ");
      for (int i =0; i<n; i++) {
    	  if (arr[i]%2==1) {
    		  System.out.println(arr[i]+ " ");
    	  }
      }
}*/
	
//1.1 Prime Number Check	
/*	
	public static boolean isPrime(int n) {
	    if (n <= 1) return false;
	    for (int i = 2; i * i <= n; i++) {
	    	System.out.println(i*i);
	        if (n % i == 0) return false;
	    }
	    return true;
	}
 
//		int n=82;
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
//     System.out.println(c==0? "prime" : "not prime");
		
		
//		for(int i=2; i<=100; i++) {
//			int co=0;
//			for(int j=2; j<=i;j++) {
//				if(i%j==0) {
//					co++;
//				}
//				
//			}
//			if(co==1) {
//				System.out.println(i+" ");
//			}
//		}

//Specific Number
		int co;
		for(int i=1;i<=ch;i++) {
			co=0;
			for(int j=1;j<i;i++) {
				if(i%j==0) {
					co++;
					break;
				}
			}
			if(co==0) {
				System.out.println(ch+ " is prime");
			}
		}
		
*/	
// 1.2 Swap two variables	
	/*
	 public static void main(String args[]) {
	//using third variable
		int a=10,b=20,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	//Without using third variable
		int x=10,y=20;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	 */
// 2. String Reverse
	
	    // Reverse every words
/*	static String reverse(String s1) {
 // 	String s=String.valueOf(s1);
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
	private static String reverseWord(String s) {
		String ans="";
		for(int i=s.length()-1; i>=0; i--) {
			ans+=s.charAt(i);
		}
		return ans;
	}
	*/
	
//	String s="Hello World";
//	
//	String[] sp=s.split(" ");
//	String out="";
//	
//	for(int i=0; i<sp.length;i++) {
//		String word=sp[i];
//		String rev="";
//		
//		for(int j=word.length()-1; j>=0; j--) {
//			rev+=word.charAt(j);
//		}
//		out+=rev+" ";
//	}
//	System.out.println(out);
	
/*	public static void main (String args []) {
		String str;
		Scanner s = new Scanner (System.in);
		System.out.println("enter here");
		str = s.nextLine();
	    char chars[]=str.toCharArray();
	    for (int i = chars.length-1; i>=0; i--) {
			
		System.out.print(chars[i]);
	}
	} */
/*	public static void main (String args[]) {
	StringBuilder sb = new StringBuilder("king");
	System.out.println(sb.reverse());
	}
	

// 3. Number Reverse
	/*public static void main (String args[]) {
	int num = 12345, reverse = 0;
	while (num !=0) {
		int remainder = num%10;
		reverse = reverse * 10 + remainder;
		num = num/10;
	}
	System.out.println(reverse);
}*/
	
//	4. palindrome number
  /*  public static void main (String args[]) {
    	int num = 12321, r, sum=0, temp;
    	temp =num;
    	while (num>0) {
    		r = num % 10;
    		sum = sum *10 + r;
    		num = num/10;
    	}
      if (temp == sum) {
    	  System.out.println("palindrome");
      }
      else
    	  System.out.println("nope");
    } */
	
//   5. palindrome String    
/*	 public static void main(String[] args) {

			String s="mom";
		String r="";
		for(int i=s.length()-1;i>=0; i--) {
			r+=s.charAt(i);
		}
		if(s.equals(r)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
			
			
			
		    String str = "Radar", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }
			
		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
		  
	5a.	  	public static void main (String args[]) {
	String str ="radar";
	StringBuilder sb=new StringBuilder(str);  
    sb.reverse();  
    String rev=sb.toString();  
    if(str.equals(rev)){  
	System.out.println("palindrome");
	}
	else
		System.out.println("not");
	}}
*/
	// 6. Armstrong Number
/*	public static void main (String args[]) {
		int n = 153, a, i=0, j=0;
		a=n;
		while (a>0) {
		
		i= a%10;
		a=a/10;
		j = j + (i*i*i);
		
		}
	if (n == j) {
		System.out.println("armstrong");
	}
	else 
		System.out.println("nope");
	
}*/
	
	//7. Ascending order
	

	/* public static void main(String[] args)
	    {
	    
	    int a[]= {3,5,42,7,4};
		int temp=0;
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
		}
	    
	    String[] arr = { "banana", "apple", "orange", "kiwi", "grape" };
		String s="";
		
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                   s=arr[i];
                   arr[i]=arr[j];
                   arr[j]=s;
				}
			}
		}
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
		}
	    
	    
	        Scanner sc=new Scanner(System.in);
	        int n;    //Array Size Declaration
	        System.out.println("Enter the number of elements :");
	        n=sc.nextInt();    //Array Size Initialization
	        
	        int arr[]=new int[n];    //Array Declaration
	        System.out.println("Enter the elements of the array :");
	        for(int i=0;i<n;i++)     //Array Initialization
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        Arrays.sort(arr);    //Sorts the Array in Ascending Order
	 
	        System.out.printf("Sorted arr[] : %s",
	                          Arrays.toString(arr));   //Prints the sorted Array
	    }
}*/

// 8. Descending Order
/*
 public static void main (String args[]) {
	
	Integer s[]= {3,5,2,7,4};
	
	Arrays.sort(s, Collections.reverseOrder());
	System.out.printf("Sorted array[] %s", Arrays.toString(s));
}}
 */
	
// String ascending order &dec
	
/*	public static void main (String args[]) {
		String s[] = {"z","hai", "jd", "df", "ewfew"};
		Arrays.sort(s, Collections.reverseOrder());
		System.out.println(Arrays.toString(s));
	}/*
	
	
	
	//9. Butterfly Suffle program
/*	public static void main (String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int len = a.length/2;
		for (int i = len-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		for (int i =a.length-1; i>=len; i--) {
			System.out.println(a[i]);
		}
	}*/
	
	//10. count words and characters
/*	public static void main (String args[]) {
		String s = "the universe has no end";
	    int count =0, c=1;
	    
	    for (int i =0; i < s.length(); i++) {
	    	if (s.charAt(i)!= ' ') {
	    		count++;
	    	}
	    	if (s.charAt(i)==' ') {
	    		c++;
	    	}
	    		
	    }
	System.out.println("the total chars are " + count);
	System.out.println("the total words are " + c);
}}
*/
 //11. fibnocci series
	/*public static void main (String args[]) {
	int n1 = 0, n2 = 1, n = 10;
	System.out.print(n1+" "+ n2);
	for (int i=2; i<n; i++ ) {
		int n3 = n1+n2;
		System.out.print(" "+n3);
		n1 = n2;
		n2 = n3;
		
	}*/
	
//12. Prime Number
/*	public static void main(String[] args) {
	int n, count= 0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number to check ");
	n = s.nextInt();
	for(int i=1; i<=n;i++) 
	{
	if(n%i==0) 
	{
		count++;
	}
	}
	if(count == 2)
	{
		System.out.println("Prime Number");
	}
	else
	{
		System.out.println("Not Prime");
	}
	}
*/	
 /*public static void main (String [] args) {
	 int i = 0, j = 0;
	 String primeNumbers ="";
	 for ( i = 1; i<=100; i++) {
		 int count = 0;
		 for ( j=1; j<=i; j++) {
			 if (i%j==0) {
				 count++;	 
			 }
		 }
	 if (count==2) {
		   primeNumbers = primeNumbers + i + " ";
	 }}
	System.out.println("prime numbers" + primeNumbers);
 }*/


	//13. Multiplication table
	
	/*public static void main(String[] args) {
	int n =7;
	for (int i =1; i<=10; i++) {
		System.out.println(n+"*"+i+"="+n*i);
	}
}*/
	
	//14. duplicates in string
	
	/*public static void main (String[] args) {	
		   String s="Hello";
	        char[] c=s.toCharArray();
	        
	        for(int i=0; i<s.length(); i++) {
	        	int co=0;
	        	for(int j=i+1; j<s.length(); j++) {
	        		
	        		if(c[i]==c[j] && c[i]!=' ') {
	        			co++;
	        			c[j]='0';
	        		}
	        	}
	        	if(co>0 && c[i]!='0') {
	        		System.out.println(c[i]);
	        	}
	        } 
		    } */  


// 15. Factorial program
/*     public static void main (String args[]) {
	 int i,fact=1;  
	  int number=5;//It is the number to calculate factorial    
	  for(i=1;i<=number;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+number+" is: "+fact);    
}*/
	
	
	// 16.square
/*  public static void main(String args[])
{
double a = 3;
System.out.println(Math.pow(a,5)); //Math.sqrt(3)
}
*/
	// 17. Leap year
	/*public static void main (String args[]) {
		int year = 1900;
		if (((year%4==0)&&(year %100 != 0)) || (year % 400 ==0)) {
			System.out.println("leap year");
		}
		else 
			System.out.println("no");
	}*/
	
// 18. Consecutive elements
/*	
	int[] arr = {0, 1, 2, 3, 0, 1, 2, 3, 4, 5, 6};
    int maxCount = 0;
    int currentCount = 1; 
    
    for(int i=1; i<arr.length; i++) {
		if(arr[i]==arr[i-1]+1) {
			currentCount++;
		}
		else {
			Math.max(maxCount, currentCount);
			currentCount=1;
		}
	}
	System.out.println(Math.max(maxCount, currentCount)); 
*/
	
	
// 19. Consecutive pair multiply
/*
 	int arr[]= {4,6,10, 3,1,10, 8};
		int maxProduct = arr[0] * arr[1]; 

        for (int i = 1; i < arr.length - 1; i++) {
            int currentProduct = arr[i] * arr[i + 1];
            maxProduct = Math.max(maxProduct, currentProduct);
        }
	System.out.println(maxProduct);
*/
	
// 20.	Recursion	Factorial
/*	
	public static void main(String args[]) {
		int n=5;
		long fact= factorial(n);
		System.out.println(fact);
	}
	static long factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n* factorial(n-1);
		}
	}
*/	
}















