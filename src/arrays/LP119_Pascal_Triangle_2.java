package arrays;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer rowIndex, return the rowIndexth (0-indexed) 
row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers 
directly above it as shown:

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]

*/
public class LP119_Pascal_Triangle_2 {

	public static void main(String[] args) {
		int rowIndex = 3;
		System.out.println(pascalTriangeRowReturn(rowIndex));
	}

	public static List<Integer> pascalTriangeRowReturn(int rowIndex) {

		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i <=rowIndex+1; i++) { // Iterating till the index
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					List<Integer> preRow = result.get(i - 1);
					int val = preRow.get(j - 1) + preRow.get(j);
					row.add(val);
				}
			}
			result.add(row);
		}

		return result.get(rowIndex);

	}

}
