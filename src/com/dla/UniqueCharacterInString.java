package com.dla;

import java.util.Scanner;

public class UniqueCharacterInString {
	  
	// program to check if string contains all the unique character
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		uniquechecker(str);
		s.close();
	}

	public static void uniquechecker(String str) {
		
		char omar[] = str.toCharArray();
		int flag=0;
		for(int i=0;i<str.length();i++) {
			flag=0;
			for(int j=i+1;j<str.length();j++) {
				
				if(omar[i]==omar[j]) {
					flag++;
					
				}
				
			}
			if(flag>0) {
				System.out.println("String does not conatin all unique character "+omar[i]);
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("String conatin all unique character");
			
		}
	}
	
}
