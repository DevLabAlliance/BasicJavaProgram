package com.dla;

/**
 * @author Devlabs Alliance
 *
 */

/* program to create and display the linked list */

public class SinglyLinkedList {

	class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

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
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		// print while it reaces the last node
		while(current!=null) {
			System.out.println(current.data+" ");
			
			// pointing to next node
			current = current.next;
		}
	}

	public static void main(String[] args) {
		
		// object of list
		SinglyLinkedList dlalist = new SinglyLinkedList();
		
		// adding node to list
		dlalist.addNode(1);
		dlalist.addNode(9);
		dlalist.addNode(7);
		dlalist.addNode(5);
        
        // display the node element		
		dlalist.display();
	}
}
