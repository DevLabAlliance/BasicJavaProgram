package com.dla;

import java.util.*;

/**
 * @author Devlabs Alliance
 *
 */

// program to make calculator using Switch case

public class Calculator {

	public static void main(String[] args) {
		System.out.print("---------MENU----------\n1 :- Addition\n2 :- Subtraction\n3 :- Multiplication\n4 :-Division");
		Scanner s = new Scanner(System.in);
		int dla = s.nextInt();
		while (dla != 5) {
			switch (dla) {
			case 1: {

				System.out.println("Enter two number to add");
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println("Result of addition is %d\n\n\n"+(a + b));
				System.out.println(
						"---------MENU----------\n1 :- Addition\n2 :- Subtraction\n3 :- Multiplication\n4 :-Division");
				dla = s.nextInt();
				break;
			}

			case 2: {

				System.out.println("Enter two number to subtract");
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println("Result of subtraction is %d\n\n\n"+(a - b));
				System.out.println(
						"---------MENU----------\n1 :- Addition\n2 :- Subtraction\n3 :- Multiplication\n4 :-Division");
				dla = s.nextInt();
				break;
			}
			case 3: {

				System.out.println("Enter two number to multiply");
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println("Result of multiplication is %d"+(a * b));
				System.out.println(
						"---------MENU----------\n1 :- Addition\n2 :- Subtraction\n3 :- Multiplication\n4 :-Division");
				dla = s.nextInt();
				break;
			}
			case 4: {

				System.out.println("Enter two number to divide");
				int a = s.nextInt();
				int b = s.nextInt();

				while (b == 0) {
					System.out.println("Division is not by 0");
					System.out.println("Enter the numbers again");
					a = s.nextInt();
					b = s.nextInt();
					
				}				
				if(b!=0)
				{
					System.out.printf("Result of divison is %d\n", a / b);
				System.out.println(
						"---------MENU----------\n1 :- Addition\n2 :- Subtraction\n3 :- Multiplication\n4 :-Division");
				dla = s.nextInt();
				break;
			  
			   }
			}
			
			case 5: {
				System.out.println("Exit");
				break;
			}
			default:
				System.out.println("Unexpected value: " + dla);
				System.out.println("Enter value between 1 and 5\n\n\n\n");
				System.out.println(
						"---------MENU----------\n1 :- Addition\n2 :- Subtraction\n3 :- Multiplication\n4 :-Division");
				dla = s.nextInt();
				break;
			}
		}
		s.close();
	}
}