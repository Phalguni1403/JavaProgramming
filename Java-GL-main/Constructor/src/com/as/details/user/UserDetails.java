package com.as.details.user;

import java.util.*;

public class UserDetails {

	int userId;
	String userFName;
	String userLName;
	String userCity;

	public UserDetails(int userId, String firstName, String lastName, String city) {
		this.userId = userId;
		this.userFName = firstName;
		this.userLName = lastName;
		this.userCity = city;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userId = sc.nextInt();
		sc.nextLine();
		String userFName = sc.nextLine();
		String userLName = sc.nextLine();
		String userCity = sc.nextLine();
		sc.close();

		UserDetails inp = new UserDetails(userId, userFName, userLName, userCity);

		System.out.println("UserID is: " + inp.userId);
		System.out.println("User First Name: " + inp.userFName);
		System.out.println("User Last Name: " + inp.userLName);
		System.out.println("User City: " + inp.userCity);
	}

}
