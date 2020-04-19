package com.dla;

import java.util.*; // to  use Scanner class 

/**
 * @author Devlabs Alliance
 * 
 */
public class MultiplicationTable {

	// program to print the multiplication table of any number

	public static void main(String[] args) {

		System.out.println("Enter any number to print table");

		Scanner s = new Scanner(System.in);

		int dla = s.nextInt(); // taking input from user
		s.close();
		table(dla); // calling static method table
	}

	public static void table(int a) { // method to print table
		int i = 1;
		for (i = 1; i <= 10; i++) { // loop to iterate from 1 to 10
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}