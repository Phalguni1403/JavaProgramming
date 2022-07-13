package com.as.arraylist;


import java.util.ArrayList;

public class IsArrayListEmpty {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();

		/*
		 * list1.add("Yash"); list1.add("Singhal"); list1.add("Morena");
		 */

		System.out.println("Arralist 1 -> " + list1);

		if (list1.isEmpty()) {
			System.out.println("Arraylist is Empty");
		}else {
			System.out.println("Arraylist is not Empty");
		}
		

	}

}