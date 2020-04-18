package com.dla;

import java.util.*;

public class OccurenceOfChar { 
	
	// program to know the occurence of each character in String
	
public static void main(String[] args){
		
	    Scanner s = new Scanner(System.in);
		String name = s.nextLine();                     // taking user from input
		occur(name);                                    // calling the method
		s.close();
		
	}
  public static void occur(String str) {
	  
	  char omar[]=str.toCharArray();                           // converting String to Array of Character
	  int flag=0;                                               // to store the count of character
	  for(int i=0;i<str.length();i++) {
		  flag=0;
		  for(int j=0;j<str.length();j++) {
			  
			  if(j<i && omar[i]==omar[j])                  // to avoid counting of character twice
			  {
				  break;
			  }
			    if( omar[i] == omar[j])                       // if two character are same then count them
			    	flag++;
			   if(j==str.length()-1)                           // printing the result
				   System.out.println("Character "+omar[i]+" appears "+flag+"times");      
		  }
		  
	  }
  }

}
