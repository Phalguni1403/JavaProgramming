package com.as.lambda.test;

interface addTest {
	public void add();
}

public class TestLambda {

	public static void main(String[] args) {

		addTest ob = new addTest() {

			@Override
			public void add() {
				System.out.println("Add");
			}
		};

		ob.add();

	}

}
