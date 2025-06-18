package Patterns;

public class Hill_Pattern {

	public static void main(String[] args) {
		int n=5;
		System.out.println("Hill Pattern");
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			for (int j=i; j<n;j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for (int j=1;j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Reverse Hill Pattern");
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<i;j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			for (int j=i;j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diamond Pattern");
		System.out.println();
		
		for (int i=1; i<n; i++) { // change it to reduce 1 row
			for (int j=i; j<n;j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("* ");
			}
			for (int j=1;j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1; i<=n; i++) {
			for (int j=1; j<i;j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			for (int j=i;j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


