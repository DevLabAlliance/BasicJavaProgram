package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class Lcm {

	public static void main(String[] args) {
		/*
		 * program to find the LCM
		 *
		 * LCm is number from which both the number are divisible
		 *
		 */
		System.out.println("Enter two number");

		Scanner s = new Scanner(System.in);
		int first_number = s.nextInt(); // taking input from user
		int second_number = s.nextInt();
		s.close();
		int LCM = (first_number > second_number) ? first_number : second_number; // Checking for greater number

		while (LCM % first_number != 0 || LCM % second_number != 0) { // condition if both number are not divisible then
																		// increment
			++LCM;
		}
		System.out.println(LCM);
	}
}