package com.dla;

import java.util.*; // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class SumAndAverage {

	// progarm to find the sum and average of 5 numbers

	public static void main(String[] args) {

		int sum = 0; // to store result
		int dla = 0; // to store input from user
		System.out.println("enter 5 number");
		Scanner s = new Scanner(System.in); // Scanner class

		for (int i = 0; i < 5; i++) {
			dla = s.nextInt(); // to take input from user
			sum += dla; // adding each number

		}
		s.close();
		int average = sum / 5; // to find average

		System.out.println("su1m is " + sum + " and average is " + average); // display result
	}

}
