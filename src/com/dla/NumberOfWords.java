package com.dla;

import java.util.*;

public class NumberOfWords {
	
	//calculate number of words
	
   public static void main(String[] args) {
	   
	   System.out.println("Enter the string");
	   Scanner s = new Scanner(System.in);
	   String str =  s.nextLine();
	   countwords(str);                        // calling method
	   s.close();
	   
	}
   
   public static void countwords(String str){
	 
	   int count=1;
	  	 
	   for(int i=0;i<str.length();i++) {
		   
		   if(str.charAt(i)==' ')                       // checking for space in string
		   {
			   count++;                                  // to count the words
		   }
	   }
	   System.out.println("Number of words in String is "+count);
   }
}
