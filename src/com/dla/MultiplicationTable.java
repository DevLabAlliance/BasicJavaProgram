package com.dla;

import java.util.*;                            // to  use Scanner class 
public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any number to print table");
		
		Scanner s = new Scanner(System.in);
		
		int t=s.nextInt();            // taking input from user
		
		table(t);                  // calling static method table
	}

public static void table(int a) {                          // method to print table
	int i=1;
	for(i=1;i<=10;i++) {
		System.out.println(a+" * "+i+" = "+a*i);
	}
}
}