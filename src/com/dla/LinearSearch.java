package com.dla;

/**
 * @author Devlabs Alliance
 *
 */

public class LinearSearch {

	// program to find a number in the array using linear search

	public static void main(String[] args) {

		int dla[] = { 34, 89, 52, 36, 52, 34, 87, 96 };

		// calling method
		search(dla, 87);
	}

	public static void search(int dla[], int key) {

		for (int i = 0; i < dla.length; i++) {
			if (key == dla[i]) { // checking the key with every element in the array

				System.out.printf("key found at  %dth place", i + 1);
				break; // if key is found then break the loop
			}
		}
	}
}