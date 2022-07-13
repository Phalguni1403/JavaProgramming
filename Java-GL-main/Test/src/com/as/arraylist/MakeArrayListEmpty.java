package com.as.arraylist;

import java.util.ArrayList;

public class MakeArrayListEmpty {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Yash");
		list1.add("Singhal");
		list1.add("Morena");

		System.out.println("Arralist 1 -> " + list1);

		list1.clear();
		System.out.println("Empty the Arralist: ");

		System.out.println(list1);

	}

}