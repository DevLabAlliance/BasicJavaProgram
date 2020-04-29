package com.dla;

/**
 * @author Devlabs Alliance
 *
 */

/*
 * program to find if any sub-array exists such that its sum is equal to zero
 * like in the array in the program from index 1 to index 3 the sum of element
 * is zero
 */public class SubArraySumZero {

	public static void main(String[] args) {

		int dla[] = { 2, 4, 6, -10, 3, 4 };
		check(dla);

	}

	/**
	 * @param dla is the input array
	 */
	public static void check(int dla[]) {
		int i = 0, j = 0;

		// to check whether the sub array is found or not
		boolean result = false;

		for (i = 0; i < dla.length; i++) {
			int sum = 0; // to store sum
			for (j = i; j < dla.length; j++) {
				sum += dla[j];

				// if sum is equal to zero, we have found the sub array; break the loop
				if (sum == 0) {
					result = true;
					break;
				}

			}
			// for breaking outer loop if sum is zero
			if (result == true) {
				break;
			}
		}

		// displaying the result
		if (result) {
			System.out.printf("Form index %d to index %d there exists a sub array", i, j);
		} else {
			System.out.println("No sub array exists");
		}
	}
}
