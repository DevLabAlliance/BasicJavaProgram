package com.dla;

import java.util.*;     // to use Scanner class

public class Pattern {

	// program to print pattern
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number to print pattern");
		int n=0;               // taking input from user
		
		Scanner s = new Scanner(System.in);
	    n = s.nextInt();
		
		for(int i=1;i<=n;i++) {           // using two loop to form 2d array  
			for(int j = 1;j<=i;j++) {
				System.out.print(j);     // to print number
			}
		System.out.println();	  // to jump in next line
		}
	}
	
}
