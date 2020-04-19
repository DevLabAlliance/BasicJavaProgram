package com.dla;

import java.util.Scanner; // to use Scanner class

/**
 * @author DevLabs Alliance
 *
 */

public class DuplicateCharacter {

	/*
	 * to find duplicate character in the given string if two character have same
	 * ASCII code they are equal
	 */

	public static void main(String[] args) {

		int flag = 0;

		System.out.println("Enter the string");

		Scanner s = new Scanner(System.in);
		String dla = s.nextLine(); // taking string as input from user
		s.close();
		dla = dla.toLowerCase(); // converting all character to lower case to compare
		for (int i = 0; i < dla.length(); i++) { // using loop to iterate every character in string
			for (int j = i + 1; j < dla.length(); j++) {

				if (dla.charAt(i) == dla.charAt(j)) { // checking character
					flag++; // to mark if duplicate character is found in the string
					System.out.println("Dupliacte character is " + dla.charAt(i)); // displaying duplicate character

				}
			}
		}
		if (flag == 0)
			System.out.println("No duplicate Character found");
	}

}
