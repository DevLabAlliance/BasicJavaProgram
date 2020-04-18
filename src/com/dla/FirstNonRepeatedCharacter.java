package com.dla;

import java.util.*;

public class FirstNonRepeatedCharacter {

	// program to print the non repeated character
	public static void main(String[] args) {
       		
		System.out.println("Enter the string");
		Scanner s = new Scanner (System.in);
		String name = s.nextLine();
		firstnon(name);                      // calling method
		s.close();		
		
		
	}

public static void firstnon(String str) {
	
	str = str.toLowerCase();                        // converting all character to lower case
	
	char c[] = str.toCharArray();                // converting String into Array of Character
	for(int i =0 ;i <str.length();i++) 
	{
		int flag=0;                                 
		for(int j=0; j<str.length();j++) 
		{
			if(i!=j && c[i]==c[j])
			{				
			flag++;                               // to store if character is repeated
			}
		}
		if(flag==0)                                                   // displaying result
		{
			System.out.println("First Non repeated character is "+c[i]+"index is "+i);
			break;                                                        // breaking the loop
		}
		
		
	}
}

}