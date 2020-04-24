package com.dla;

/**
 * @author Devlabs alliance
 *
 */
public class Inheritance {

	public static void main(String[] args) {

		BabyDog d = new BabyDog(); // instance of BabyDog class

		d.bark();
		d.eat();
	}
}

//Parent class
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

//child class
class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

// Grand-child class
class BabyDog extends Dog {

	// overriding method
	@Override
	void bark() {
		System.out.println("babydog...");
	}
}