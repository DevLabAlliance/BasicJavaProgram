package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class Palindrome {

	/*
	 * program to check palindrome a string is palindrome when it is read either
	 * from forward or backward it remains same
	 */
	public static void main(String[] args) {

		System.out.println("enter the string");
		Scanner s = new Scanner(System.in);
		String dla = s.nextLine();
		palindromecheck(dla); // calling the method
		s.close();
	}

	public static void palindromecheck(String str) {

		int flag = 0;
		for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {

			if (str.charAt(i) != str.charAt(j)) { // checking if character are not same
				flag++; // marks if character doesn't match
				break; // breaking the loop if character doesn't match
			}
		}
		if (flag == 0) {
			System.out.println("String is palindrome");
		} else
			System.out.println("String is not palindrome");
	}

}
