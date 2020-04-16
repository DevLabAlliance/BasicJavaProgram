package com.dla;

import java.util.*;

public class NumberOfDays {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the month number");
		int month[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
     
		System.out.println(a+" month has "+month[a-1]+" days");
		
	}

}
