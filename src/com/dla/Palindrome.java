package com.dla;

import java.util.Scanner;

public class Palindrome {

	//program to check palindrome
	
	public static void main(String[] args) {
		
		System.out.println("enter the string");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        palindromecheck(str);                              // calling the method
        s.close();
	}

	
	public static void palindromecheck(String str){
		
		int flag=0;
		for(int i=0, j=str.length()-1;i<=j;i++,j--) {
			
			if(str.charAt(i)!=str.charAt(j)) {             // checking if character are not same
				flag++;
				break;
			}
		}
		if(flag==0) {
			System.out.println("String is palindrome");}
			else
				System.out.println("String is not palindrome");
		}
	
}
