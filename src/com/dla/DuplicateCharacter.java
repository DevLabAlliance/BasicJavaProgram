package com.dla;

import java.util.Scanner;                 // to use Scanner class

public class DuplicateCharacter {
	
	// to find duplicate character in the given string
	
	public static void main(String[] args) {
		
		int flag=0;
		
		System.out.println("Enter the string");
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();                               //taking string as input from user
		  name = name.toLowerCase();                              // converting all character to lower case to compare
		for(int i=0;i<name.length();i++) {                        //using loop to iterate every character in string
			for(int j =i+1;j<name.length();j++) {
				
				if(name.charAt(i)==name.charAt(j)) {              // checking character 
					flag++;
		         // System.out.println("Duplicate character found at index "+i+" "+j);    // displaying result
		         System.out.println("Dupliacte character is "+name.charAt(i));
		         
			}
		  }	
		}
		if(flag==0)
			System.out.println("No duplicate Character found");
	}

}
