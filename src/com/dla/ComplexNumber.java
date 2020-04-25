package com.dla;

/**
 * @author Devlabs Alliance
 *
 */
public class ComplexNumber {

	double real;
	double img;

	// constructor to initialize the object at the time of creation
	ComplexNumber(double real, double img) {

		this.real = real;
		this.img = img;
	}

	// program to add two complex number and display their result
	
	public static void sum(ComplexNumber c1 , ComplexNumber c2) {
		
		//auxiliary object to restore result 
		ComplexNumber c = new ComplexNumber(0,0);
		
		// adding real part and imaginary part separately
        c.real= c1.real+c2.real;     
		c.img = c1.img+c2.img;
		
		System.out.println("Sum is "+c.real+" +i"+c.img);
				
		}

	public static void main(String[] args) {

		System.out.println("Enter the complex");
         ComplexNumber c1 = new ComplexNumber(9.2,3.4);
         ComplexNumber c2 = new ComplexNumber(2.3,4.7);
         
         // calling method
         sum(c1,c2);
         
	}

}
