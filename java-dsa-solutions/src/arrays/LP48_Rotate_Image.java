package arrays;

import java.util.Arrays;

/*
48. Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify 
the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

*/
public class LP48_Rotate_Image {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotateImage(matrix);
		
		for(int[] a : matrix) {
			System.out.println(Arrays.toString(a));
		}
	}
	public static void rotateImage(int[][] matrix) {
		int m = matrix.length;
		
		for(int i=0; i<m; i++) {
			for(int j=i+1; j<m; j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
		for(int i=0; i<m; i++) {
			reverseRow(matrix[i]);
		}
	}
	
	static void reverseRow(int[] arr) {
		int left = 0; 
		int right = arr.length-1;
		
		if(left<right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
            right--;
		}
	}

}
