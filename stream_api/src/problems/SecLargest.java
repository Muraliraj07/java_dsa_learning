package problems;

import java.util.Arrays;
import java.util.Collections;

public class SecLargest {

	public static void main(String[] args) {
		int[] nums = {10, 20, 4, 45, 99, 99};
		secLarg(nums);
	}

	public static void secLarg(int[] nums) {
		int secLarg = Arrays.stream(nums)
				.boxed()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(-1);
		System.out.println(secLarg);
	}
}
