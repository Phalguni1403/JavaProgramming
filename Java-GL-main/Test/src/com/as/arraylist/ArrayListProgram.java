package com.as.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import com.as.test.Students;

public class ArrayListProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentId = sc.nextInt();
		sc.nextLine();
		String studentFName = sc.nextLine();
		String studentLName = sc.nextLine();
		ArrayList<Students> al = new ArrayList<Students>();

		al.add(new Students(studentId, studentFName, studentLName));
		
		for(Students a: al) {
			System.out.println(a);
		}

	}

}
