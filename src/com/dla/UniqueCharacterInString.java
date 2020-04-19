package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class UniqueCharacterInString {

	// program to check if string contains all the unique character
	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String dla = s.nextLine();
		uniqueChecker(dla);
		s.close();
	}

	public static void uniqueChecker(String str) {

		char dla[] = str.toCharArray();
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			flag = 0;
			for (int j = i + 1; j < str.length(); j++) {

				if (dla[i] == dla[j]) {
					flag++;

				}

			}
			if (flag > 0) {
				System.out.println("String does not conatin all unique character ");
				break;
			}
		}
		if (flag == 0) {
			System.out.println("String conatin all unique character");

		}
	}

}
