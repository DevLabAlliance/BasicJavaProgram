package com.dla;

import java.util.Scanner;

/**
 * @author Devlabs Alliance
 *
 */
public class FactorOfNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to get the factors");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		
		// calling method
		getFactor(dla);
	}
	
	public static void getFactor(int dla) {
		
		for(int i=1;i<=dla;i++) {
			
			// if number is divisible then it is a factor
			if (dla%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
