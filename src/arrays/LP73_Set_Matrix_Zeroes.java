package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LP73_Set_Matrix_Zeroes {

	public static void main(String[] args) {
		int[][] matrix = {{1, 1, 1},{1, 0, 1},{1, 1, 1}};
		setMatrixZeroes(matrix);
		
		for(int[] a : matrix) {
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static int[][] setMatrixZeroes(int[][] matrix){
		Set<Integer> rowZeros = new HashSet<>();
		Set<Integer> colZeros = new HashSet<>();
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(matrix[i][j] == 0) {
					rowZeros.add(i);
					colZeros.add(j);
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(rowZeros.contains(i) || colZeros.contains(j)) {
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}

}
