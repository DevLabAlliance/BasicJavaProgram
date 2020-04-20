package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
public class SecondHighestNumber {

	// program to second highest number in array

	public static void main(String[] args) {

		int DLA[] = { 1, 2, 45, 67, 6, 8 };
		checkNumber(DLA); // calling method
	}

	public static void checkNumber(int DLA[]) {

		int first_highest = DLA[0];
		int second_highest = DLA[0];

		for (int i = 0; i < DLA.length; i++) { // iterating every number in the array

			if (DLA[i] > first_highest) { // if any number found greater than previous number
				second_highest = first_highest; // changing the variables
				first_highest = DLA[i];

			}
		}
		System.out.println("Second highest number in the array is " + second_highest); // displaying result
	}
}
