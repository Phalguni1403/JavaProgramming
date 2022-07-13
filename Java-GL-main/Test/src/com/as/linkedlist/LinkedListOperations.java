package com.as.linkedlist;

import java.util.LinkedList;

public class LinkedListOperations {

	public static void main(String[] args) {
		// Create a linked list
		LinkedList<String> list1 = new LinkedList<String>();

		// Adding items in the list
		list1.add("Yash");
		list1.add("Singhal");
		list1.add("Morena");

		// print the items in the list
		System.out.println("First linkedlist: " + list1);

		// add item in the first of the list
		list1.addFirst("First Item");

		// add item in the last of the list
		list1.addLast("Last Item");

		// print the items in the list
		System.out.println(list1);

		// Create another linked list
		LinkedList<String> list2 = new LinkedList<String>();
		// clone the first list1 to list2
		list2 = (LinkedList<String>) list1.clone();

		// Print Linkedlist 2
		System.out.println("Second linkedlist: " + list2);

		// clear all the items from list1
		list1.clear();

		// print the items in the list
		System.out.println("First linkedlist: " + list1);

		// check if the value is present in the linkedlist or not
		if (list2.contains("Singhal")) {
			System.out.println("LinkedList contains the given value");
		} else {
			System.out.println("LinkedList does not contains the given value");
		}

		// get the value from the linkedlist
		System.out.println(list2.get(1));

		// get the first value from the linkedlist
		System.out.println(list2.getFirst());

		// get the last value from the linkedlist
		System.out.println(list2.getLast());

		// check the index of the item
		System.out.println("index of Yash in the list is: " + list2.indexOf("Yash"));

		// check the size of the linked list
		System.out.println("Size of the linked list is: " + list2.size());

		// replace the value at the given position in linkedlist
		list2.set(3, "Jaipur");

		// Print Linkedlist 2
		System.out.println("linked list after replacing the value at index 3" + list2);

	}

}
