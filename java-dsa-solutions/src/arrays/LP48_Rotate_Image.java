package arrays;

public class LP48_Rotate_Image {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotateImage(matrix);
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
	}

}
