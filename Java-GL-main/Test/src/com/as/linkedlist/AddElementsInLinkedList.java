package com.as.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AddElementsInLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		// Adding items in the list
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		int sum = 0;
		// adding the items

		for (int i = 0; i < list1.size(); i++) {
			sum = sum + list1.get(i);
		}

		System.out.println("Sum of all the elements in the linked list are: " + sum);

		// sublist of the linked list
		System.out.println(list1.subList(0, 2));

		System.out.println("using iterator -------------------------");

		// Iterator Example
		Iterator<Integer> it = list1.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("using list iterator -------------------------");

		// list Iterator example
		ListIterator<Integer> lit = list1.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("Iterate from the last in linkedlist ---------------------");

		// Iterate the linked list in reverse order
		for (int i = list1.size() - 1; i >= 0; i--) {
			System.out.println(list1.get(i));
		}

		// search the element
		int search = 3;
		boolean flag = true;
		for (int i = 0; i < list1.size(); i++) {
			if (search == list1.get(i)) {
				System.out.println("Found the element");
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Seached element not present");
		}

		// last occurrence (works only in string)
		String myStr = "Hello planet earth, you are a great planet.";
		System.out.println("last element: "+myStr.lastIndexOf("h"));

		// push into the linked list
		list1.push(12);

		// print the linked list
		System.out.println(list1);

		// pop from the linked list
		list1.pop();

		// print the linked list
		System.out.println(list1);

		// poll from the linked list
		list1.poll();

		// print the linked list
		System.out.println(list1);

		// poll from the linked list
		list1.pollFirst();

		// print the linked list
		System.out.println(list1);

		// poll from the linked list
		list1.pollLast();

		// print the linked list
		System.out.println(list1);

		// peek in the linked list
		list1.peek();

		// print the linked list
		System.out.println(list1);

		// peek in the linked list
		list1.peekFirst();

		// print the linked list
		System.out.println(list1);

		// peek in the linked list
		list1.peekLast();

		// print the linked list
		System.out.println(list1);

	}

}
