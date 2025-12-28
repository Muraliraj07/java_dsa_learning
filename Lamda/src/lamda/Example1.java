package lamda;

interface Calculate {
	int operation(int a, int b);
	
}

public class Example1 {

	public static void main(String[] args) {
		Calculate sum = (a, b) -> a+b;
		System.out.println(sum.operation(2, 5));

// Without using functional interface		
		Calculate sub = new Calculate() {
			
			@Override
			public int operation(int a, int b) {
				return a-b;
			}
		};
		System.out.println(sub.operation(5,  2));
		
	}

}
