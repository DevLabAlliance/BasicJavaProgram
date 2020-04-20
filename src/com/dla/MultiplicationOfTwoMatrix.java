package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
public class MultiplicationOfTwoMatrix {

	// program to multiply two matrix

	public static void main(String[] args) {

		int dla[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int dla1[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		multiply(dla, dla1); // calling method
	}

	public static void multiply(int dla[][], int dla1[][]) {

		int c[][] = new int[3][3]; // creating a array of same size
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) { // multiplying each element of each row by column of another and adding
												// them
					c[i][j] = dla[i][k] * dla1[k][j];
				}
				System.out.print(c[i][j] + " "); // displaying result
			}
			System.out.println(); // to print in next line
		}
	}
}
