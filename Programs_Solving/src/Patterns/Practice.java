package Patterns;

public class Practice {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println("--------------2");
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
System.out.println("--------------3");
		
		for(int i=1, p=1; i<=n; i++,p++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print(p);
			}
			System.out.println();
		}
		
System.out.println("-------------4");
//Floyd Triangle
		int a=1;
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print(a++);
			}
			System.out.println();
		}
		
System.out.println("------------5");
		
		for(int i=1, p=5; i<=n; i++,p--) {
			for(int j=1; j<=i; j++ ) {
				System.out.print(p);
			}
			System.out.println();
		}
		
System.out.println("------------6");
		
		for(int i=1, p=0; i<=n; i++,p+=2) {
			for(int j=1; j<=i; j++ ) {
				System.out.print(p);
			}
			System.out.println();
		}
System.out.println("------------7");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++ ) {
				if(i%2==0) {
				System.out.print("2");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
System.out.println("-------------8");
		
		int p=1;
		
		for(int i=1; i<n; i++,p++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++ ) {
				System.out.print(p);
			}
			for(int j=1; j<i; j++ ) {
				System.out.print(p);
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++,p++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(p);
			}
			for(int j=i;j<=n;j++) {
				System.out.print(p);
			}
			System.out.println();
		}
		
System.out.println("------------9");
		
		for(int i=1,q=1; i<n; i++,q++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++ ) {
				System.out.print(q);
			}
			for(int j=1; j<i; j++ ) {
				System.out.print(q);
			}
			System.out.println();
		}
		for(int i=1, q=5; i<=n; i++,q--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n;j++) {
				System.out.print(q);
			}
			for(int j=i;j<=n;j++) {
				System.out.print(q);
			}
			System.out.println();
		}
		
// COLUMN CHANGING
		
// Starting Same Number		
System.out.println("--------10");
		
		for(int i=1; i<=n; i++) {
			int q=1;
			for(int j=1;j<=i;j++) {
				System.out.print(q++);
			}
			System.out.println();
		}
System.out.println("--------11");
// Starting Different Number		
		for(int i=1,k=n; i<=n; i++,k--) {
			int r=k;
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(r--);
			}
			System.out.println();
		}
		
System.out.println("--------12");
// Same Starting and Ending number		
		for(int i=1; i<=n; i++) {
			int s=1;
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<i; j++ ) {
				System.out.print(s++);
			}
			for(int j=1; j<=i; j++ ) {
				System.out.print(s--);
			}
			System.out.println();
		}
	}
}
