package com.dla;

import java.util.*;

/**
 * @author Devlabs Allianc
 *
 */
public class SquareRoot {

	// program to find square root of a number

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		System.out.println(Math.sqrt(dla)); // using pre-defined method

	}

}
