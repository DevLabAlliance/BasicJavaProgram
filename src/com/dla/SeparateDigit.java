package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class SeparateDigit {

	// program to separate each digit in the number 
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		
		// calling method
		separate(dla);
	}
	
	public static void separate(int dla) {
		
		// to count the number of digits in the number
		int count=0;
		
		// to store each number
		int store[] = new int[10];
		
		// separating each digit of the number an storing in the array
		for(int i =0 ; dla>0;i++) {
			store[i] = dla%10;
			dla = dla/10;
			count++;
		}
		
		// printing the digit
		for(int i=count-1; i>=0;i--) {
			System.out.print(store[i]+" ");
		}
	}
}
