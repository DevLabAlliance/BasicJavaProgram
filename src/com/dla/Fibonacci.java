package com.dla;

import java.util.*; // to use Scanner class 

/**
 * @author Devlabs alliance
 *
 */
public class Fibonacci {
	/*
	 * 
	 * Program to print fibonacci series 0 1 1 2 3 5 8 13......
	 *
	 */
	public static void main(String[] args) {

		int first_number, second_number; // to store user input

		int dla = 0; // to display and store the series

		int n = 0; // to store number of terms

		System.out.println("Enter first number of series"); // telling user to input first number

		Scanner s = new Scanner(System.in);
		first_number = s.nextInt(); // taking input from user of first number

		System.out.println("Enter Second number of series"); // telling user to input second number

		second_number = s.nextInt(); // taking input from user of second number

		System.out.println("Enter number of terms");

		n = s.nextInt(); // taking input for number of terms
		
         s.close();
		System.out.print(first_number + " " + second_number + " "); // displaying first and second number of series

		for (int i = 0; i < n; i++) { // using loop for iteration
			dla = first_number + second_number;
			System.out.print(dla + " "); // displaying result
			first_number = second_number;
			second_number = dla;
		}

	}

}
