package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
public class ReverseArray {

	public static void main(String[] args) {

		// program to print array in reverse order

		int dla[] = { 1, 4, 7, 9, 0 };
		reverse(dla);// calling method

	}

	public static void reverse(int dla[]) {

		for (int i = dla.length - 1; i >= 0; i--) { // iterating array in reverse order and printing the elements
			System.out.print(dla[i] + " ");
		}
	}
}