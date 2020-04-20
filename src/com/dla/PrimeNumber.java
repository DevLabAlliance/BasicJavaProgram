package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class PrimeNumber {

	// program to check if the number is prime or not

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		check(dla);
	}

	public static void check(int dla) {

		int flag = 0; // to mark if number is found to be prime
		for (int i = 2; i <= (dla / 2); i++) { // checking by dividing every number less than of that number

			if (dla % i == 0) {
				flag++;
				break; // if number is prime then break the loop
			}
		}
		if (flag == 0)
			System.out.println(dla + " is a prime number");
		else
			System.out.println(dla + " is a not a prime number");
	}
}
