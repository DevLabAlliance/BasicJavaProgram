package com.dla;

import java.util.*; // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class Pattern {

	/* program to print pattern like this 
	    1
	    12
	    123
	    1234
	    12345
	    upto n number of  digits
	 */
	 
	
	public static void main(String[] args) {

		System.out.println("Enter the number to print pattern");
		int dla = 0; // taking input from user

		Scanner s = new Scanner(System.in);
		dla = s.nextInt();
		s.close();
		for (int i = 1; i <= dla; i++) { // using two loop to form 2d array
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " "); // to print number
			}
			System.out.println(); // to print in next line
		}
	}

}
