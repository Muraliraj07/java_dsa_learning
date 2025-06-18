package Patterns;

public class Right_Side_Triangle {

	public static void main(String[] args) {
		int n=5;
		System.out.println("Right Side Increase Triangle");

		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				System.out.print("  ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Right Side Decrease Triangle");
		System.out.println();

		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
