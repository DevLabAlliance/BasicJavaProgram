package com.dla;

import java.util.Scanner; // to use Scanner class

/**
 * @author DevLabs Alliance
 *
 */
public class Cube {

	// to find the cube of any given number
	// cube of any number is given by multiplying that number to itself thrice

	public static void main(String[] args) {

		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt(); // to take input from user
		s.close();
		for (int i = 1; i <= dla; i++) {
			System.out.println("Cube of " + i + " is " + i * i * i); // displaying result
		}
	}

}
