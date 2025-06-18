package Number_Patterns;

public class Row_Same_Ex2 {

	public static void main(String[] args) {
		System.out.println("Even & Odd rows different values");
		int n=5;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (i%2==0) {
					System.out.print("2 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diamond Pattern");
		int p=1;
		for (int i=1; i<n; i++, p++) { // change it to reduce 1 row
			for (int j=i; j<n;j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print(p+" ");
			}
			for (int j=1;j<=i; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		for (int i=1; i<=n; i++,p++) {
			for (int j=1; j<i;j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print(p+" ");
			}
			for (int j=i;j<n; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Mirror Diamond Pattern");
		
		for (int i=1, r=1; i<n; i++, r++) { // change it to reduce 1 row
			for (int j=i; j<n;j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print(r+" ");
			}
			for (int j=1;j<=i; j++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		for (int i=1, r=5; i<=n; i++,r--) {
			for (int j=1; j<i;j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=n; j++) {
				System.out.print(r+" ");
			}
			for (int j=i;j<n; j++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}

}
