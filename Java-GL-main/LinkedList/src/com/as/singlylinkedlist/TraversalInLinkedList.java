package com.as.singlylinkedlist;

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class TraversalInLinkedList {

	Node head;

	// insertion at front
	public void addAtFront(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			newNode.next = null;
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	// insertion at last
	public void addAtLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			head.next = null;
			return;
		}

		newNode.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = newNode;
	}

	// insertion at specific point
	public void addAtSpecificPoint(Node prevNode, int data) {

		if (prevNode == null) {
			System.out.println("Previous node cannot be null.");
			return;
		}
		Node newNode = new Node(data);

		newNode.next = prevNode.next;

		prevNode.next = newNode;

	}

	// print the linkedlist
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		TraversalInLinkedList llist = new TraversalInLinkedList();

//		llist.head = new Node(1);
//		Node second = new Node(2);
//		Node third = new Node(3);
//
//		llist.head.next = second;
//		second.next = third;

		llist.addAtFront(3);
		llist.addAtFront(2);
		llist.addAtFront(1);
		llist.addAtLast(33);
		llist.addAtLast(34);

		llist.addAtSpecificPoint(llist.head, 99);
		llist.printList();

	}

}
