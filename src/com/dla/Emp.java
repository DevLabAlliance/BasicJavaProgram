package com.dla;

/**
 * @author Devlabs Alliance
 *
 */

/*
 * this is an example of aggregation when a class called another class i.e. HAS-
 * A relationship is developed between them
 */

public class Emp {

	int id;
	String name;
	Address address; // calling another class

	Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {

		Address address1 = new Address("Knp", "UP", "India"); // assigning Address class variables values
		Address address2 = new Address("ftp", "UP", "India");

		Emp e = new Emp(111, "varun", address1); // assigning Emp class variables values
		Emp e1 = new Emp(112, "arun", address2);

		e.display(); // displaying result
		e1.display();

	}

}
