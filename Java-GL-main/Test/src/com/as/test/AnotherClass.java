package com.as.test;

import java.util.*;

class Person {
	String empName;
	double empSalary;
	int empJoinYear;
	String empNationalInsuranceNumber;

	public Person(String empName, double empSalary, int empJoinYear, String empNationalInsuranceNumber) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empJoinYear = empJoinYear;
		this.empNationalInsuranceNumber = empNationalInsuranceNumber;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpJoinYear() {
		return empJoinYear;
	}

	public String getEmpNationalInsuranceNumber() {
		return empNationalInsuranceNumber;
	}
}

class Employee extends Person {

	public Employee(String empname, double salary, int joinyear, String national_insurance_number) {
		super(empname, salary, joinyear, national_insurance_number);
	}
}

class AnotherClass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		double salary = sc.nextDouble();
		int year = sc.nextInt();
		sc.nextLine();
		String insuranceNumber = sc.nextLine();

		Employee ep = new Employee(name, salary, year, insuranceNumber);
		System.out.println("The name of the Employee is: " + ep.getEmpName());
		System.out.println("Salary of the employee is: " + ep.getEmpSalary());
		System.out.println("Joining Year of the Employee is: " + ep.getEmpJoinYear());
		System.out.println("Insurance number of the employee : " + ep.getEmpNationalInsuranceNumber());
		sc.close();
	}
}
