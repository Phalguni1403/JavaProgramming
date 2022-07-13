package com.as.arraylist;

import java.util.ArrayList;

public class TrimArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		// Default size of Arraylist was 10 before Java8 but after it is 0.
		System.out.println("Size of Arraylist: " + list1.size());
		list1.add("Yash");
		list1.add("Singhal");
		list1.add("Morena");
		

		System.out.println("Arralist 1 -> " + list1);
		
		list1.trimToSize();
		// it trims dowm to the no of elements in the arralist
		System.out.println("Size of Arraylist: " + list1.size());

	}

}