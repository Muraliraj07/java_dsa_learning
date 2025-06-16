package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]

*/
public class LP118_Pascal_Triangle {

	public static void main(String[] args) {
		int numRow = 5;
		List<List<Integer>> result = generatePascalTriangle(numRow);
		for(List<Integer> row : result) {
			System.out.println(row);
		}
	}
	
	public static List<List<Integer>> generatePascalTriangle(int numRows){
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i=0; i<numRows; i++) {
			List<Integer> row = new ArrayList<>();
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i) {
					row.add(1);
				}
				else {
					List<Integer> preRow = result.get(i-1);
					int val = preRow.get(j-1) + preRow.get(j); // Getting the pre row values
					row.add(val);
				}
			}
			result.add(row);
		}
		
		return result;
	}

}
