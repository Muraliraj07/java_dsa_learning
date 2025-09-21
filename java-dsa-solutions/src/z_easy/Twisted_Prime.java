package z_easy;

public class Twisted_Prime {

	public static void main(String args[]) {
		System.out.println(isTwistedPrime(98));
	}
	
	public static boolean isTwistedPrime(int n) {
		return (isPrime(n) && isPrime(reverse(n)));
	}
	
	/*
	Example 1: num = 36
Factors are (2 × 18), (3 × 12), (4 × 9), (6 × 6)
Notice: once you cross 6 (which is √36), the factors just repeat in reverse order.
So checking up to √36 = 6 is enough.	
	*/	
	
	public static boolean isPrime(int num) {
		if (num <=1) return false;
		if(num == 2) return true;
		if(num % 2 == 0) return false; // To check quickly without looping -> like 2,4,6,8...
		
		for(int i=3; i<=Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static int reverse(int n) {
		int rev = 0;
		while(n>0) {
			rev = rev * 10 +(n % 10);
			n/=10;
		}
		return rev;
	}
	
}
