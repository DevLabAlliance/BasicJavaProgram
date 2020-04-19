package com.dla;

import java.util.Scanner; //to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class LeapYear {

	/*
	 * program to find leap year if the year is divisible is by 4 and is not a
	 * century year then it is leap year if the year is divisible is by 4 and is a
	 * century year then it must be divisible by 400 to be a leap year
	 */
	public static void main(String[] args) {

		System.out.println("Enter the year");

		Scanner s = new Scanner(System.in);
		int dla = s.nextInt(); // to take input
		s.close();
		boolean result = true; // to store result
		if (dla % 4 == 0) {
			if (dla % 100 == 0) {
				if (dla % 400 == 0)
					result = true;
				else
					result = false;
			} else
				result = true;
		}
		if (result) // display result
		{
			System.out.println("year is leap");
		} else
			System.out.println("year in not leap");
	}
}
