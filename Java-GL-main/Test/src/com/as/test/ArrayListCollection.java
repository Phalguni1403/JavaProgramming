package com.as.test;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> NameList = new ArrayList<String>();
		NameList.add("Reema");
		NameList.add("Angural");
		NameList.add("Jammu");
		NameList.add("Vijaypur");

		System.out.println("The elements of ArraytList are : " + NameList);

		NameList.add(3, "JavaDeveloper");

		System.out.println(NameList.get(3));
		System.out.println(NameList.size());
		System.out.println(NameList.indexOf("Reema"));
		System.out.println(NameList.remove(3));
		System.out.println(NameList);
		System.out.println(NameList.toString());
		System.out.println(NameList.contains("Reema"));
		System.out.println(NameList.isEmpty());
		System.out.println(NameList.lastIndexOf("Angural"));

	}

}
