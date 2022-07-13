package com.as.test;

class ExceptionHandling {
	public static void main(String[] args) {
		try {
			try {

				int b = 43 / 2;
				System.out.println(b);
			} catch (Exception e) {
				System.out.println("first block");
			}
			try {
				int a = 23 / 0;
				System.out.println(a);
			} catch (Exception e) {
				System.out.println("second ");
			}
			try {
				System.out.println("try block");
			} catch (Exception e) {
				System.out.println("third block");
			}
		} catch (Exception e) {
			System.out.println("main catch block");
		}
	}
}