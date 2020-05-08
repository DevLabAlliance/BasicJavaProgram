package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class PascalTriangle {

	// to find the factorial of any number
	public static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	// to display the pattern 
	public static void display(int dla) {

		int space = dla;
		for (int n = 0; n < dla; n++) {   // for iterating in row

			for (int j = space; j != 0; j--) { // to leave spaces in the line
				System.out.print(" ");
			}

			for (int r = 0; r <= n; r++) { // iterating in column and printing  factorial
				System.out.print((factorial(n) / (factorial(n - r) * factorial(r))) + " ");
			}
			System.out.println();
			space--; // decrease number of space each time
		}
	}

	public static void main(String[] args) {

		// program to display pascal triangle as in every row the result in equal ncr;
		// n stands for row and c for combination and r for column

		System.out.print("Enter number of rows: ");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
        s.close();
		display(dla);
	}

}
