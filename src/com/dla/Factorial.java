package com.dla;

import java.util.*; //to use Scanner class

/**
 * @author DevLabs Alliance
 *
 */
public class Factorial {

	/*
	 * program to find factorial of any number factorial of any number 'n' is given
	 * by n!
	 * 
	 */

	public static void main(String[] args) {
		int n; // to store input entered by user
		int dla = 1; // to store result
		System.out.println("Enter a number"); // telling user to do input
		Scanner s = new Scanner(System.in);
		n = s.nextInt(); // taking input
		s.close();
		for (int i = 1; i <= n; i++) // using loop to multiply number
		{
			dla *= i; // storing product of each iteration in result
		}
		System.out.println("Factorial of " + n + " is " + dla); // displaying result
	}

}
