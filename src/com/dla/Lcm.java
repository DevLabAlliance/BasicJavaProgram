package com.dla;

import java.util.*;

public class Lcm {

	public static void main(String[] args) {
           // program to find the LCM		
		System.out.println("Enter two number");
		
		Scanner s = new Scanner(System.in);
		int first_number = s.nextInt();                       // taking input from user
		int second_number = s.nextInt();
		
		int LCM = (first_number > second_number) ? first_number : second_number;          // Checking for greater number
		
		while( LCM % first_number != 0 || LCM % second_number != 0 ) {                      // comdition
		                ++LCM;	
	   }	
	System.out.println(LCM);
}
}