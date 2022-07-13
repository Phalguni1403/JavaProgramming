package com.as.arraylist;

import java.util.ArrayList;

public class ReplaceValueArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Yash");
		list1.add("Singhal");
		list1.add("Morena");

		System.out.println("Arralist 1 -> " + list1);

		
		System.out.println("Replace the value at index 1: ");

		list1.set(1, "Tomar");
		
		System.out.println("Arralist 1 -> " + list1);

	}

}