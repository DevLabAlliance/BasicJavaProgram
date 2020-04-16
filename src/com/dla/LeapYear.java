package com.dla;

import java.util.Scanner;     //to use Scanner class

public class LeapYear {
	
	// program to find leap year
	
	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();               // to take input
		boolean result = true;               // to store result
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) 
					result = true;
					else 
						result =false;
				}
				else result =	true;
			}
			if(result)                                             // display result
			{
				System.out.println("year is leap");
			}
			else
				System.out.println("year in not leap");
		}
	}


