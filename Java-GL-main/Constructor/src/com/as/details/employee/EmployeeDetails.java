package com.as.details.employee;

import java.util.*;

public class EmployeeDetails {
	int empId;
	String empFName;
	String empLName;
	String empCity;
	String empState;

	public EmployeeDetails(int empId, String empFName, String empLName, String empCity, String empState) {
		super();
		this.empId = empId;
		this.empFName = empFName;
		this.empLName = empLName;
		this.empCity = empCity;
		this.empState = empState;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.nextLine();
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		String city = sc.nextLine();
		String state = sc.nextLine();
		sc.close();

		EmployeeDetails obj = new EmployeeDetails(id, firstName, lastName, city, state);

		System.out.println("Employee ID is: " + obj.empId);
		System.out.println("Employee First Name is: " + obj.empFName);
		System.out.println("Employee Last Name is: " + obj.empLName);
		System.out.println("Employee city is: " + obj.empCity);
		System.out.println("Employee state is: " + obj.empState);

	}

}
