package com.dla;

/**
 * @author Devlabs Alliance
 *
 */

/* program to create and display the linked list */

public class SinglyLinkedList {

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {

		// creation of new Node
		Node newNode = new Node(data);

		if (head == null) {

			// if list is empty, both head and tail point to new node
			head = newNode;
			tail = newNode;
		}

		else {

			// new node will created and tail next will point to this
			tail.next = newNode;

			// last node will became the tail
			tail = newNode;

		}
	}

	public void display() {

		// point to head
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		// print while it reaces the last node
		while (current != null) {
			System.out.println(current.data + " ");

			// pointing to next node
			current = current.next;
		}
	}

	/**
	 * @param key is the data from the list we want to delete
	 */
	public void delete(int key) {

		Node current = head;
		Node temp = head;

		if (head.data == key) {
			head = current.next;
		}

		while (current.data != key) {
			temp = current;
			current = current.next;
		}

		temp.next = current.next;
		current.next = null;

	}

	/**
	 * @param key is the data we want to add
	 */

	/* method to add node at the end of the list */
	public void addAtEnd(int key) {

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		Node newnode = new Node(key);
		current.next = newnode;
		tail = newnode;
	}

	/**
	 * @param key is the data we want to add
	 */

	/* method to add node at the start of the list */
	public void addAtStart(int key) {

		Node newnode = new Node(key);
		if (head == null) {
			System.out.println("lsit is empty");
			head = newnode;
			tail = newnode;
		}

		else {
			newnode.next = head;
			head = newnode;
		}
	}

	public static void main(String[] args) {

		// object of list
		SinglyLinkedList dlalist = new SinglyLinkedList();

		// adding node to list
		dlalist.addNode(1);
		dlalist.addNode(5);
		dlalist.addNode(7);
		dlalist.addNode(9);
		dlalist.addNode(11);

		dlalist.addAtStart(34);
		dlalist.addAtStart(4);

		dlalist.delete(7);
		dlalist.addAtEnd(67);
		dlalist.display();

	}
}

// class to create node
class Node {
	int data;
	Node next;

	// constructor
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}
