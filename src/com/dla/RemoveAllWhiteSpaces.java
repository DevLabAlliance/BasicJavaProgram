package com.dla;

import java.util.*;

public class RemoveAllWhiteSpaces {
	  
	//program to remove all the space character in the String
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();        // to take input from user
		remove(str);
		s.close();
	}
  
	public static void remove(String str) {
		
		char omar[] = str.toCharArray();            // Converting String to char Array
		
		for(int i=0;i<str.length();i++) {
		    if(omar[i]==' ') {                         // Checking for space in string
		    	for(int j=i+1;j<str.length();j++) {             
		    		omar[j-1]=omar[j];                      // shifting all the character backwards
		    	}
		    }
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(omar[i]);             // display the result
		}
		
	}
}
