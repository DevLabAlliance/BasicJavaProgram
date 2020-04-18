package com.dla;

import java.util.*;

public class Armstrong {
    
	//program to check whether a number is Armstrong or not
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		check(a);
		s.close();
	}
	
  public static void check(int a) {
	  
	  int temp = a;
	  int c=0;
	  int result=0;
	  while(a>0) {
		
		  c = a%10;
		  a = a/10;
		  result = result +(c*c*c);
		 }
	  
	  if(temp==result)
		  System.out.println("Number is armstrong");
	  else
		  System.out.println("Number is not armstrong");
  }
}
