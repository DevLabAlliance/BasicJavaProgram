package com.dla;

import java.util.*; // for using Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class Vowel {

	// program to find the total number of vowel in string

	public static void main(String[] args) {

		int count = 0; // variable to count vowel

		System.out.println("Enter a string"); // telling user to give input
		Scanner s = new Scanner(System.in); // Scanner class
		String dla = s.nextLine(); // taking input from user
		s.close();
		dla = dla.toLowerCase();

		for (int i = 0; i < dla.length(); i++) // using loop to check every character in the string
		{
			if (dla.charAt(i) == 'a' || dla.charAt(i) == 'e' || dla.charAt(i) == 'i' || dla.charAt(i) == 'o'
					|| dla.charAt(i) == 'u')
				count++;
		}
		System.out.println(count); // displaying result
	}

}
