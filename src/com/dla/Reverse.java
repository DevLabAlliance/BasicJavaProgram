package com.dla;

import java.util.*; // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class Reverse {

	// program to reverse a String
	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String dla = s.nextLine(); // taking input from the user
		reverse(dla); // calling the method
		s.close(); // closing scanner close to avoid memory leak

	}

	public static void reverse(String str) {

		char c[] = str.toCharArray(); // converting String to Array of character
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(c[i]); // printing the string in reverse order
		}
	}
}
