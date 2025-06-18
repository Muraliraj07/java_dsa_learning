  package logical_questions;

//1.Pattern Program

public class numbers {
// Increasing Triangle
/*	public static void main (String[] args) {
		int n = 5;
		for (int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++){
				System.out.print("1");	
			}
			System.out.println();
		}
	}*/
	
//Decreasing Triangle
/*	public static void main (String[] args) {
		int n =5;
		for (int i =1;i<=n; i++) {
			for (int j= i; j<=n; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}*/
// row increment by 1 like 1 22 333	
/*	public static void main (String[] args) {
		int n = 5;
		for (int i =1,p=1; i<=n; i++,p++) {
			for(int j=1; j<=i; j++){
				System.out.print(p+"");	
			}
			System.out.println();
		}
	}*/
	
	
// pattern 1 12 1*3 1**4
	
	
/*	public static void main (String args[]) {
		int  n=5 ;
		
		for (int i =1,p=1; i<=n; i++) {
			for (int j = 1; j<=i; j++) {
				if (j>p && j<i) {
					System.out.print("*");
				}else
				System.out.print(j);
			}
			System.out.println();
			
		}}*/	
/*	public static void main (String args[]) {
		int n=4, s=1;
		
		for (int i =s; i<=n; i++) {
			for (int j = n; j>=i; j--) {
				if (j>i && j<n) {
					System.out.print("*");
				}else
				System.out.print(j);
			}
			System.out.println();
		}
	}
*/	
	
/*	 public static void main (String args[]) {
		 int row = 5;
		 for (int i =1; i<=row; i++) {
		 	for (int j =1; j<=i; j++) {
		 		System.out.print(j+" ");
		 	}
		 	System.out.println();
		 }}*/
		 

/*	public static void main (String args[]) {
		int row = 5;
		  for (int i =row; i>=1; i--) {	
			for(int j=row; j>=i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}*/
		
/*	public static void main (String args[]) {
		int row = 5;
		for (int i = row; i>=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	*/
/*
      		public static void main(String args[]){
      		int i, j , row = 4;
			for ( i=1; i<=row; i++) {
		    for (j=row;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		}
	*/

// 2. Transpose of 3x3 matrix
	public static void main(String args[]) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//int transpose[][] = new int[3][3];
		System.out.println("Printing Matrix After Transpose:");  
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){     
		System.out.print(arr[j][i]+" ");    
		}    
		System.out.println();
	}}
}


