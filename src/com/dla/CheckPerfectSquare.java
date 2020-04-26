package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */
public class CheckPerfectSquare {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		s.close();
		
		// calling method
		check(dla);
	}
	
	public static void check(int dla) {
		
		//Math.sqrt()is a pre-defined method to find the square root of any number
		
        double x = Math.sqrt(dla);
		
        // Mat.floor gives the greatest integer value in the number like 98.9 gives 98
        
        // for checking if the number is perfect square or not 
		if(x-Math.floor(x)==0) 
			
			System.out.println("Number is perfect square");
		
		else
			System.out.println("Number is not perfect square");
	}

}
