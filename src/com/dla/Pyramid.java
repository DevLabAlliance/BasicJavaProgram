package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 * 
 */

/*program to display pyramid pattern like 
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5 
*/
public class Pyramid {

	// method to display pyramid
	public static void display(int n) {
		int space = n; // to leave space
		for (int i = 1; i <= n; i++) {
			for (int k = space; k != 0; k--) { // to print spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {// to print number a
				System.out.print(i + " ");
			}
			System.out.println();
			space--; // decrease space every time for printing more number
		}
	}

	public static void main(String[] args) {

		System.out.print("Input number of rows : ");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close(); // to avoid memory leak

		// calling method
		display(dla);
	}
}
