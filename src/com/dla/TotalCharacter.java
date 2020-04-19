package com.dla;

import java.util.*;   // to use Scanner class

/**
 * @author Devlabs Alliance
 *
 */
public class TotalCharacter {
	
	// program to find the number of character in a string
	
	public static void main(String[] args) {
		System.out.println("Enter the string");
		int count =0;                               // to store the count of character
		Scanner s = new Scanner(System.in);     
	    String dla = s.nextLine();              // taking input from user
         s.close();
	    dla = dla.toLowerCase();
	    for(int i=0;i<dla.length();i++) {                  // for iteration in every character in string
 	    	if(dla.charAt(i)>='a' && dla.charAt(i)<='z')    // if character lies between then it counts it
	    		count++;                                        // increase count if character found
	    }
	   System.out.println(count); 		   //display result
	    
}
}

