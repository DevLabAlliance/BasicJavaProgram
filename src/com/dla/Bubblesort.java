package com.dla;

/**
 * @author Devlabs Aliiance
 * 
 */

/*
 * Bubblesort is a way to sort all the elements of an array by comparing each
 * elements with another
 * 
 */
public class Bubblesort {

	public static void main(String[] args) {

		int dla[] = { 9, 8, 7, 6, 5, 3 };

		// sorting the array
		sort(dla);

		// displaying array
		display(dla);

	}

	/*
	 * after end of every loop most largest move the last place so it is in its
	 * right place and we don't need to check at the place that's why in second loop
	 * we check elements till array length - i
	 */
	public static void sort(int dla[]) {
		int temp = 0;
		for (int i = 0; i < dla.length - 1; i++) { // as after dla.length -1 shifting all element will be sorted
			for (int j = 1; j < (dla.length - 1 - i); j++) { // as last element after every iteration is in its right
																// place so we don't need to check them

				if (dla[j - 1] > dla[j]) {
					/*
					 * swapping elements if found greater than previous element
					 */

					temp = dla[j - 1];

					dla[j - 1] = dla[j];

					dla[j] = temp;

				}
			}
		}
	}

	public static void display(int dla[]) {
		for (int i = 0; i < dla.length; i++) {
			System.out.print(dla[i] + " ");
		}
	}
}
