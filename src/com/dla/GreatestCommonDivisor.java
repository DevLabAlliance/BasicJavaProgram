package com.dla;

import java.util.*;

/**
 * @author Devlabs Aliiance
 *
 */
public class GreatestCommonDivisor {

	// program to find the greatest common divisor of two number
	// GCD is the number from which both number are divisible

	public static void main(String[] args) {

		System.out.println("Enter the first number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		System.out.println("Enter the second number");
		int dla1 = s.nextInt();
		s.close();
		gcd(dla, dla1); // calling method
	}

	public static void gcd(int dla, int dla1) {
		int result = 0;
		for (int i = 1; i <= dla && i <= dla1; i++) { // if i is divisble both by both number then it is their GCD

			if (dla % i == 0 && dla1 % i == 0)
				result = i; // modifying the result

			System.out.println("Greatest common divisor of " + dla + " and " + dla1 + " is " + result);
		}
	}
}
