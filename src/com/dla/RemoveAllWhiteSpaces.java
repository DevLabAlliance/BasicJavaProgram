package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class RemoveAllWhiteSpaces {

	// program to remove all the space character in the String
	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); // to take input from user
		remove(str);
		s.close();
	}

	public static void remove(String str) {

		char dla[] = str.toCharArray(); // Converting String to char Array

		for (int i = 0; i < str.length(); i++) {
			if (dla[i] == ' ') { // Checking for space in string
				for (int j = i + 1; j < str.length(); j++) {
					dla[j - 1] = dla[j]; // shifting all the character backwards
				}
			}
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(dla[i]); // display the result
		}

	}
}
