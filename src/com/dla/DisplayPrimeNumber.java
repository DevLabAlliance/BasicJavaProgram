package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class DisplayPrimeNumber {

	// program to print all the prime number between 1 and the entered number

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		
		// to avoid memory leak from Scanner class
		s.close();
		
		// calling method
		displayPrime(dla); 
	}

	public static void displayPrime(int dla) {

		for (int i = 1; i <= dla; i++) {
			int flag = 0;
			for (int j = 1; j <= i; j++) {
				
				// checking how many number are divisible by present number
				if (i % j == 0) 
					flag++;
			}
			// as prime number is divisible by itself and 1 so flag will be 2 for prime number
		
			if (flag == 2) 
				System.out.print(i + " ");
		}
	}
}
