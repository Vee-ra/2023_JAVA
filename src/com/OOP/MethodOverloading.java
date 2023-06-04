package com.OOP;

/*
 * Method overlaoding - method name same and passing parameters should be different.
 * */

public class MethodOverloading {

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static double max(double a, double b) {
		return a > b ? a : b;
	}

	static char max(char a, char b) {
		return a > b ? a : b;
	}

	public static void main(String[] args) {
		System.out.println(max(1, 2));
		System.out.println(max(2.3, 2.3)); 
		System.out.println(max(7.0, 1.2));
		System.out.println(max('c', 'v')); //depends on ASCII value

	}

}
