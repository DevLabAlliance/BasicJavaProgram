package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 */
public class UpperToLowerWithoutMethod {

	public static void main(String[] args) {

		// program to convert uppercase to lowercase without in built method

		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String dla = s.nextLine();
		convert(dla); // calling method
		s.close(); // closing scanner close to avoid memory leak
	}

	public static void convert(String str) {

		char dla[] = str.toCharArray(); // converting string to array of character

		for (int i = 0; i < str.length(); i++) {

			if (dla[i] >= 'A' && dla[i] <= 'Z') { // checking for upper case character

				dla[i] = (char) ((int) dla[i] + 32); // as difference between lower and upper is 32 and type casting dla
														// into int then add 32 and then type cast overall to char
			}
		}
		for (int i = 0; i < str.length(); i++)
			System.out.print(dla[i]);
	}
}
