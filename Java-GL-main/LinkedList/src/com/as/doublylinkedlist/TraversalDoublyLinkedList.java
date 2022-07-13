package com.as.doublylinkedlist;

class Node {
	Node next;
	Node prev;
	int data;

	Node(int data) {
		this.data = data;
		prev = null;
		next = null;
	}
}

public class TraversalDoublyLinkedList {
	Node head;
	
	// insertion at front in doubly linkedlist
	public void addFront(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	// insertion at last
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node last = head;
		
		while(last.next != null) {
			last = last.next;
		}
		
		newNode.prev = last;
		last.next = newNode;
		newNode.next = null;
	}

	// print the doubly linkedlist
	public void printList() {
		Node node = head;
		Node last = null;

		System.out.println("Print in forward direction -----------------");
		
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		
		System.out.println();
		System.out.println("Print in reverse direction -----------------");
		
		while(last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
		
		
	}

	public static void main(String[] args) {

		TraversalDoublyLinkedList llist = new TraversalDoublyLinkedList();

//		llist.head = new Node(1);
//		Node second = new Node(2);
//		Node third = new Node(3);
//
//		llist.head.next = second;
//		second.prev = llist.head;
//		second.next = third;
//		third.prev = second;
		
		llist.addFront(3);
		llist.addFront(2);
		llist.addFront(1);
		
		llist.addLast(4);
		llist.addLast(5);
		llist.addLast(6);

		llist.printList();
	}

}
