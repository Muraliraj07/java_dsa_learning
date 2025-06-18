package Number_Patterns;

public class Column_Same_Ex1 {
	
	public static void main(String[] args) {
		int n=5;
//		for (int i=1, k=0; i<=n; i++, k++) {
//			int p=4;
//			for (int j=i; j<=n; j++) {
//				System.out.print("  ");
//			}
//			for (int j=1; j<i; j++) {
//				System.out.print(p-- +" ");
//			}
//			
//			System.out.println();
//		}
		
		
		for (int i=1, k=n; i<=n; i++, k--) {
			int p=k;
			for (int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<n; j++) {
				System.out.print(p-- +" ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
		
		
//		int n=5;
//		 for (int i = 1; i <= n; i++)
//	        {
//			 
//			 for (int j=i; j<=n; j++) {
//				 System.out.print("  ");
//			 }
//	            for (int j = i; j >= 1; j--)
//	            {
//	                System.out.print(j + " ");
//	            }
//	            
//	            System.out.println();
//	        }
		 
		 
}}
