package com.OOP;

import java.util.Scanner;

/*
 * (n-1) + (n-2) -> 0,1,1,2,3,5,8,13,21....
 * */
public class FibanocciRecursion {

	static int fibanocci(int n) {
		if (n <= 1)
			return n;
		else
			return (fibanocci(n - 1) + fibanocci(n - 2));
	}

	public static void main(String[] args) {

		System.out.println(fibanocci(10));

	}
}
