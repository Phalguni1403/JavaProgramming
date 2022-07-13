package com.as.details.product;

import java.util.*;

public class ProductDetails {

	int pId;
	String pName;
	String pDescription;
	float pPrice;

	public ProductDetails(int pId, String pName, String pDescription, float pPrice) {
		this.pId = pId;
		this.pName = pName;
		this.pDescription = pDescription;
		this.pPrice = pPrice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		String description = sc.nextLine();
		float price = sc.nextFloat();

		sc.close();

		ProductDetails obj = new ProductDetails(id, name, description, price);

		System.out.println("Product ID is: " + obj.pId);
		System.out.println("Product Name is: " + obj.pName);
		System.out.println("Product Description Name is: " + obj.pDescription);
		System.out.println("Product price is: " + obj.pPrice);
	}

}
