package com.dla;

import java.util.*;  // for using Scanner class

public class Vowel {
  
	//find total number of vowel in string
	
	public static void main(String[] args) {
		
		int count=0;     // variable to count vowel
		
		System.out.println("Enter a string");  // telling user to give input
        Scanner s = new Scanner(System.in);  // Scanner class
        String word = s.nextLine();     // taking input from user
        word=word.toLowerCase();
        
        for(int i=0; i<word.length();i++)   // using loop to check every character in the  string
        {
        	if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
        	count++;
        }
        System.out.println(count);  // displaying result
	}
	

}
