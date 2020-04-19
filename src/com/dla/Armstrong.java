package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class Armstrong {
	/**
	 * program to check whether a number is Armstrong or not armstrong number are
	 * those whose sum of cube of individual digit is equal to the number
	 * 
	 * 371 = 3^3 + 7^3 + 1^3
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int dla = s.nextInt();
		check(dla);
		s.close();
	}

	public static void check(int a) {

		int temp = a;
		int c = 0;
		int result = 0;
		while (a > 0) { // separating each digit of a number and cubing it

			c = a % 10;// gives the last digit of a number
			a = a / 10; // divide the number
			result = result + (c * c * c); // store the sum of cube each digit
		}

		if (temp == result)// displaying result
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");

	}
}
