package com.dla;

import java.util.*;  //to use Scanner class

//program to find factorial of any number

public class Factorial {

	public static void main(String[] args) {
		int n;                            //to store input entered by user
		int result=1;                  // to store result
      System.out.println("Enter a number");     // telling user to do input
      Scanner s = new Scanner(System.in);
      n= s.nextInt();                    // taking input
      
      for(int i=1;i<=n;i++)               // using loop to multiply number 
      {
    	  result *= i;                             // storing product of each iteration in result
      }
      System.out.println("Factorial of "+n+" is "+ result);    //displaying result
	}

}
	