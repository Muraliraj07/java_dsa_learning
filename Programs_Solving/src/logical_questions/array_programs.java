 package logical_questions;

import java.util.*;

/*1. To find repeated numbers and frequency in array 
 *  
 *2. 3x3 matrix multiplication
 *
 *3. Number of elements in array
 *
 *4. List reverse
 *
 *5. Array Reverse
 *
 *6. Duplicate int & String
 *
 *7. Commom elemnts in two arrays int & String
 *
 *8. Second Largest element in array
 *
 *9. Second Smallest element in array
 *
 *10. Array to Arraylist
 *
 *11. Sum of Two Number equal to given number
 *
 *12. Finding the missing number
 *
 *13. To move all zeros to end of an array
 *
 *14. To sort an  array in alphabetical order
 *
 *15. Sum values
 *
 *16. Contains
 *
 *17. Index
 *
 *18. Decimal to HexaDecimal
 */


public class array_programs {

/*	public static void main (String args[]) {
	
1.  To find repeated numbers and  Frequency of element using array
		
			int ar[]= {1, 2, 3, 2, 5, 1, 7,8, 8,2,8};
		int max=0;
		for(int i=0; i<ar.length; i++) {
			int c=1;
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					c++;
					ar[j]=0;
				}
			}
			if(c>max) {
				max=c;
			}
			if(c>1 && ar[i]!=0) {
				System.out.println(ar[i]+" count is "+ c+" position "+(i));
			}
		}
		
		System.out.println("Max freq is "+max);
		
		


		public static void main (String[] args) {
		int[] arr = {22, 11, 33, 22, 33, 44, 33};
		int[] freq =new int[ arr.length];
		
		for (int i=0; i<arr.length;i++) {
			int count=1;                     
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					freq[j]=-1;
				}
			}
			if (freq[i]!=-1) {
				freq[i]=count;
			System.out.println("frequency of an element: "+arr[i] +" "+ freq[i]);

			}}
		int possition;
			for (int i=0; i<arr.length; i++) {
				if (freq[i]>0) {
					
					possition=i;
					System.out.println(arr[i]+" occurs "+ freq[i]+ " times " +"possition "+ possition);
				}
		}
			int max= freq[0];
			for (int i=0; i<freq.length; i++) {
				if (freq[i]>max) {
					max=freq[i];
					System.out.println("max freq "+ max);
				}
		                         	}
	}
}

// 2. 3x3 matrix multiplication		
	
	public static void main(String[] args) {
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}}; 
		int c[][]=new int[3][3];
		

		int m = a.length;
        int n = a[0].length;
        int p = b[0].length;

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                	result[i][j]  += a[i][k] * b[k][j];
                }
            }
        }
        
// storing and printing        
        for (int i = 0; i < 3; i++) {
    	    for (int j = 0; j < 3; j++) {
    	        System.out.print(result[i][j] + " ");
    	    }
    	    System.out.println();
    		}
	}

		
// Addition		
public static void main(String[] args) {
		int arr1[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int arr2[][]= {{1,1,1},{2,2,2},{3,3,3}};
	
	
		int row=arr1.length;
		int col=arr1[0].length;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				 System.out.print(arr1[i][j] + arr2[i][j] +" ");
			}
			System.out.println();
		}
	}	

// Transpose	

public static void main(String[] args) {
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
    	    for (int j = 0; j < 3; j++) {
    	        System.out.print(result[i][j] + " ");
    	    }
    	    System.out.println();
    	}
	}		
	

Java Program to find the number of elements present in an array
 
3. Number of elements in array
	
	 public static void main(String args[])   
	   {  
	        int a[] = {9,8 ,7 ,0 ,6 ,5 ,4 ,7 ,3 ,4 ,5 ,2 ,1};  
	        int count=0;          
	   
	        System.out.println("The entered elements are: ");
	        for(int i:a)
	        {
	             System.out.print(a[i]+" ");
	            count++;   
	        }
	        System.out.println("");
	        System.out.println("The total number of elements in an array is "+count);     
	   }
	   
4. List reverse

		 public static void main(String[] args)
	    {
	        LinkedList<Integer> ll = new LinkedList<Integer>();
	        ll.add(1);
	        ll.add(2);
	        ll.add(3);
	        ll.add(4);
	        ll.add(5);
	        System.out.println("The elements of the linked list before reversing: " + ll);
	        Collections.reverse(ll);
	        
	       //   int middle = ll.get(ll.size()/2); // To find middle element.
	       
	        System.out.println("The elements of the linked list after reversing: " + ll);
	    }
	
5.Array Reverse
	/*public static void main (String args[]) {
		int[] arr = {33,24,54,33,52,343};
		for (int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);	
		}
	}
	*/
//6. Duplicate int & String
//	public static void main (String args[]) {
//	int[] arr = {1, 3, 5, 3, 1, 6, 6, 1, 6};
//	for (int i=0; i<arr.length; i++) {
//		int c=1;
//		for (int j=i+1; j<arr.length; j++) {
//			if (arr[i]==arr[j]) {
//				c++;
//				arr[j]=0;
//				
//			}
//			
//		}
//		if(c>1 && arr[i]!=0) {
//			System.out.println("Duplicate element "+arr[i]);
//		}
//	}
//}

//7. Commom elemnts in two arrays int & String
	/*public static void main(String args[]) {
		String [] array1 = {"raj", "king", "aa", "cc"};
		String [] array2= {"aa", "fasf", "cc"}; 
		for (int i = 0; i < array1.length; i++){
    for (int j = 0; j < array2.length; j++) {
        if(array1[i] == (array2[j]))
        {
         System.out.println("Common element is : "+(array1[i]));
         break;
         }
    }}}}
    
8. Second Largest element in array
   	int[] arr = {5, 8, 2, 10, 3};
		
		int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	 for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

		System.out.println(secondLargest); 
  
9. Second Smallest Element in array
 
  		int[] arr = {5, 8, 2, 10, 3};
		
		int smallest=Integer.MAX_VALUE;
		int sec_Smallest=Integer.MAX_VALUE;
		
		for(int num: arr) {
			if(num<smallest) {
				sec_Smallest=smallest;
				smallest=num;
			}
			else if(num < sec_Smallest && num != smallest) {
				sec_Smallest=num;
			}
		}
		System.out.println(sec_Smallest);
}
10. Array to ArrayList
 
 		public static void main(String args[]) {
		String[] my_array= new String[] {"hello", "world"};
		ArrayList<String> arr= new ArrayList<String>(Arrays.asList(my_array));
		System.out.println(arr);
	}		
	
11. Sum of Two Number equal to given number
	
        public static void main(String args[]) {
		int[] arr = {1,4,5,3,6,7};
		int check = 8;
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]+arr[j]==check) {
					
					System.out.println(arr[i]+" "+ arr[j]+ " is"+check);
				}
			}
		}
	}	
	
12. Finding the missing number
	
		public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7,8};
		float total =8;
		float missing = total *((total+1)/2);
		int sum =0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(missing - sum);
	}


13. To move all zeros to end of an array

		int arr[] = {1,0,4,3,0,5,0,5,3}; 
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j]!=0) {
					    temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	
14.to sort an  array in alphabetical order.
 
 	String[] s= {"hai","wel", "done", "c"};
		for(int i=0; i<s.length;i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		
 
    	public static void main(String args[])   
	    {  
	      Scanner sc=new Scanner(System.in);
	      Scanner sc1=new Scanner(System.in);

	      int n;
	      System.out.println("Enter the number of elements ");
	      n=sc.nextInt();   

	      String str[]=new String[n]; 
	      System.out.println("Enter the String ");
	      for(int i=0; i<n ;i++)    
	      {
	          str[i]=sc1.nextLine();
	      }

	      Arrays.sort(str);    

	      System.out.println(Arrays.toString(str)); 
	   }  
	
 Sorting	
	public static void main(String args[])  {
	
	
		int[] s= {2214,5235,5352,523532,2343};
		
		for(int i=0; i<s.length;i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i]>s[j]) {
					int temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		
		int[] arr = {2214,5235,5352,523532,2343};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[] a1 = {"dog", "cat", "lion", "tiger"};
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
	}

15. Sum values
/*	public static void main(String args[])  {
		int total=0;
		int[] arr = {4,5,5,2};
		for (int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		for (int i : arr) {
			total +=i;
		}
		System.out.println(total);
	}
	
16. Contains
	
	public static boolean contains(int[] arr, int item) {
		for (int i: arr) {
			if (item== i) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[])  {
		int[] a1 = {2,34,225,3,532};
		System.out.println(contains(a1, 345));
	
	}
  
	
17. Index
public static int findIndex (int[] my_array, int t) {
    if (my_array == null) return -1;
    int len = my_array.length;
    int i = 0;
    while (i < len) {
        if (my_array[i] == t) return i;
        else i=i+1;
    }
    return -1;
}
public static void main(String[] args) {
  int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
  System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
  System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
   }
}
*/
/*
	
// 18. HexaDecimal - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1A, 1B, 1C, 1D, 1E, 1F, 20

	public static void main(String[] args) {
// Binary - Decimal		
		System.out.println(Integer.parseInt("1010", 2));
		
// Decimal - Binary
		System.out.println(Integer.toBinaryString(10));

// Dec - HexDec
		System.out.println(Integer.toHexString(10)); // A 
		System.out.println(Integer.toHexString(17)); // F
		
// HexDec - Dec		
		System.out.println(Integer.parseInt("A", 16));
	
	}
*/
	
	
	
}

























