package com.OOP;

public class MethodOverloadingDemo2 {

	static int avg(int a, int b) {
		return (a + b) / 2;
	}
	
	static double avg(double a, double b) {
		return (a + b) / 2;
	}

	static double avg(double a, double b, double c) {

		return (a + b) / 3;
	}

	public static void main(String[] args) {

		System.out.println(MethodOverloadingDemo2.avg(2, 5));

		System.out.println(MethodOverloadingDemo2.avg(10.5, 20.5, 30.5));
		
		System.out.println(MethodOverloadingDemo2.avg(3, 3));

	}

}
