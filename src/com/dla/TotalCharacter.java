package com.dla;

import java.util.*;   // to use Scanner class

public class TotalCharacter {
	
	// to find number of character in string
	
	public static void main(String[] args) {
		System.out.println("Enter the string");
		int count =0;                               // to store the count of character
		Scanner s = new Scanner(System.in);     
	    String object = s.nextLine();              // taking input from user
         
	    object = object.toLowerCase();
	    for(int i=0;i<object.length();i++) {                  // for iteration in every character in string
 	    	if(object.charAt(i)>='a' && object.charAt(i)<='z')
	    		count++;                                        // increase count if character found
	    }
	   System.out.println(count); 		   //display result
	    
}
}

