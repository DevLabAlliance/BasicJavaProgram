package com.dla;

import java.util.Scanner;     // to use Scanner class

public class Cube {
	
	//to find the cube of any given number
	
	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();         // to take input from user
		for(int i=1;i<=a;i++) {
		System.out.println("Cube of "+i+" is "+i*i*i);     //displaying result
		}
	}

}

