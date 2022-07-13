package com.as.arraylist;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		System.out.println("Before Cloning:");
		list1.add("Yash");
		list1.add("Singhal");
		list1.add("Morena");

		System.out.println("Arralist 1 -> " + list1);

		ArrayList<String> list2 = new ArrayList<>();
		System.out.println("After Cloning:");
		list2 = (ArrayList<String>) list1.clone();

		System.out.println("Arralist 2 -> " + list2);

	}

}