package Patterns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {
//		int n=5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		System.out.println(stripAndUppercase("Hello989)"));
		
		System.out.println(getUserName("Paul", "Jones"));
		
		char[] a={'a', 'b', 'a', 'b', 'c', 'd', 'd', 'e', 'a', 'd'};
		System.out.println(removeDuplicates(a));
		
			
		String str="As Cars can be of many types - a saloon and a hatchback are both cars.";
		String[] arr=str.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase().split(" ");
//	    //String s1=s.toLowerCase();
//		//String[] arr=s1.split(" ");
//		
//		//System.out.println(s1);
//
//		for(int i=0; i<arr.length; i++){
//		    int count=1;
//		    for(int j=i+1; j<arr.length; j++){
//		        if(arr[i].equals(arr[j]) && arr[i]!=" "){
//		            count++;
//		            arr[j]="0";
//		        }
//		    }
//		    if(arr[i]!="0" && arr[i]!=" "){
//		        System.out.println(arr[i]+","+count);  
//		    }
//		}
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : arr) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
		
	}	
//1	
	 static String stripAndUppercase(String input) {
	        if (input == null) {
	            return null;
	        }
	        
	        String result = input.replaceAll("[^a-zA-Z0-9]", "");
	        return result.toUpperCase();
	    }
	 
//2	 
	 public static String getUserName(String firstName, String lastName) {
	        // return the user name as LastName, FirstName e.g. Smith, John
	        if (firstName == null && lastName == null) {
	            return null;
	        }
	        if (firstName == null) {
	            return capitaliseFirstLetter(lastName);
	        }
	        if (lastName == null) {
	            return capitaliseFirstLetter(firstName);
	        }
	        String fCapital = capitaliseFirstLetter(firstName);
	        String lCapital = capitaliseFirstLetter(lastName);

	        return lCapital + ", " + fCapital; 
	    }
	    
	    public static String capitaliseFirstLetter(String s) {
	        if (s == null || s.length() < 1) {
	            return s;
	        }
	        char[] chars = s.toCharArray();
	        chars[0] = Character.toUpperCase(chars[0]);
	        return String.valueOf(chars);
	        
	    }  
	    
//3
	    public static char[] removeDuplicates (char[] arg) {
	        for(int i = 0; i < arg.length; i++) {
	            for(int j = i + 1; j < arg.length; j++) {
	                if(arg[i] == arg[j]) {
	                    arg[i] = 0;
	                 }
	            } 
	        }

	        int index = 0;
	        for(int i = 0; i < arg.length; i++) {
	            if(arg[i] != 0) {
	                arg[index++] = arg[i];
	            }
	        }

	        char[] result = new char[index];
	        System.arraycopy(arg, 0, result, 0, index);
	        return result;
	    }

	   
			
	
}
