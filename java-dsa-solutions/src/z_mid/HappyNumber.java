package z_mid;

import java.util.HashSet;
import java.util.Set;

/*
A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(nextHappyUsingFloydCycle(8));

		System.out.println(nextHappy(8)); //Finding next number
		System.out.println(isHappy(10)); //Checking given number is happy num or not
	}
	
	// SOL 1
	// Check if number is happy using Floyd's cycle detection
	
	/*	 FloydCycle Logic
🔹 The Key

It’s not that slow “catches up” —
👉 fast eventually laps slow from behind inside the cycle.

Imagine you and your friend are running around a circular track:

You jog at 1 lap/minute (slow).

Your friend runs at 2 laps/minute (fast).

At the start, you’re side by side.
After 1 minute:

You’ve done 1 lap.

Your friend has done 2 laps → they are 1 lap ahead.

But since the track is circular, being “1 lap ahead” is the same as being right behind you.
Next minute, they’ll catch you again at the same spot.

This is why in a cycle, the fast pointer always meets the slow pointer.
	
	*/	
	public static boolean isHappyUsingFloydCycle(int num) {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow);          // move 1 step
            fast = sumOfSquares(sumOfSquares(fast)); // move 2 steps
        } while (slow != fast);

        return slow == 1; // if we met at 1, it's happy
    }
	
	public static int nextHappyUsingFloydCycle(int num) {
		int next = num + 1;
		while(!isHappyUsingFloydCycle(next)) {
			next++;
		}
		return next;
	}
	
	// SOL 2
	public static boolean isHappy(int num) {
		Set<Integer> seen = new HashSet<Integer>();
		
		while(num != 1 && !seen.contains(num)) {
			seen.add(num);
			num = sumOfSquares(num);
		}
		return num==1;
	}
	
	public static int nextHappy(int num) {
		int next = num + 1;
		while(!isHappy(next)) {
			next++;
		}
		return next;
	}
	
	public static int sumOfSquares(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num%10;
			sum += rem*rem;
			num/=10;
		}
		return sum;
	}

}
