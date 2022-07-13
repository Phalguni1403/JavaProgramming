package com.as.details.order;

import java.util.*;

public class OrderDetails {

	int oId;
	String oName;
	String ODesc;
	float oPrice;

	public OrderDetails(int oId, String oName, String oDesc, float oPrice) {
		this.oId = oId;
		this.oName = oName;
		ODesc = oDesc;
		this.oPrice = oPrice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String description = sc.nextLine();
		float price = sc.nextFloat();
		OrderDetails obj = new OrderDetails(id, name, description, price);

		System.out.println("Order ID is: " + obj.oId);
		System.out.println("Order Name is: " + obj.oName);
		System.out.println("Order description is: " + obj.ODesc);
		System.out.println("Order price is: " + obj.oPrice);

		sc.close();

	}

}
