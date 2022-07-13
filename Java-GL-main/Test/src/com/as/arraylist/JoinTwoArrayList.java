package com.as.arraylist;

import java.util.*;

public class JoinTwoArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Yash");
		list1.add("Singhal");
		list1.add("Morena");

		System.out.println("Arralist 1 -> " + list1);

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("Shubham");
		list2.add("Naruka");
		list2.add("Jaipur");

		System.out.println("Arralist 2 -> " + list2);

		list1.addAll(list2);
		System.out.println("--------------------------------");
		System.out.println(list1);

	}

}
