package Number_Patterns;

public class Row_Same_Pattern {

	public static void main(String[] args) {
		
		// use the same for right, left, hill, reverse
		System.out.println("Increment Rows");
		int n=5;
		for (int i=1, p=1; i<=n; i++, p++) {
			for (int j=1; j<=i; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Decrement Rows");
		
		for (int i=1, p=5; i<=n; i++, p--) {
			for (int j=1; j<=i; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Rows Increment By 2");
		
		for (int i=1, p=0; i<=n; i++, p+=2) {
			for (int j=1; j<=i; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}
