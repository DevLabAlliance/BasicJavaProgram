package com.dla;

import java.util.*; // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class NumberOfDays {

	// program to get the number of days in any month by entering the month number

	public static void main(String[] args) {

		System.out.println("Enter the month number");
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // defining the number of days in the months
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		System.out.println(dla + " month has " + month[dla - 1] + " days"); // displaying the result

	}

}
