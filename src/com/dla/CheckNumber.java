package com.dla;

import java.util.*; // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class CheckNumber {

	// program to check whether it is negative, zero, or positive

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		check(dla); // calling method

	}

	public static void check(int dla) {

		if (dla > 0) // checking the number for different conditions and displaying result
			System.out.println("Numner is positive");
		else if (dla == 0)
			System.out.println("Number is zero");
		else
			System.out.println("Number is negative");
	}
}