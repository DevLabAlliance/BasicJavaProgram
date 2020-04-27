package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
public class BinarySearch {

	/*
	 * program to find a number in the array using binary search 
	 * In binary search, array must be sorted
	 * 
	 */

	public static void main(String[] args) {

		int dla[] = { 1, 24, 56, 78, 90, 101 };
       
		int result = search(dla,101,0,5);
       if(result==-1)
    	   System.out.println("key not found");
       else 
    	   System.out.println("key is found");
	}

	public static int search(int dla[], int key, int low, int high) {

		if (high >= low) {

			int mid = (low + high) / 2;
            
			// key is found at mid place
			if (dla[mid] == key)
				return mid;
             
			// key is lesser than mid element
			if (dla[mid] > key) {

				return search(dla, key, low, mid - 1);
			}

			// key is greater than mid element
			if (dla[mid] < key) {
				return search(dla, key, mid + 1, high);
			}
		}
		// if key is not found return -1
		return -1;
	}
}