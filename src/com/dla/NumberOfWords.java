package com.dla;

import java.util.*; // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class NumberOfWords {

	// to count the number of words in the string

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String dla = s.nextLine();
		countWords(dla); // calling method
		s.close();

	}

	public static void countWords(String str) {

		int count = 1; // initializing as 1 because minimum word will be 1

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') // checking for space in string as words are separated by space
			{
				count++; // to count the words
			}
		}
		System.out.println("Number of words in String is " + count);
	}
}
