package com.OOP;

/*
 * Factorial using recursion
 * Fibonacci using recursion
 * */

public class RecrsionDemo {
	/*
	 * fact = n*(n-1) 0! not possible 0 == 1
	 */
	static int fact(int n) {
		if (n <= 0) // (n==0) <- both are same here
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		
		int fct = 1; //for for loop explanation

		System.out.println("from above recursion method " + fact(n));

		for (int i = 1; i <= n; i++) {
			fct *= i;
		}
		System.out.println("fact of 5 is " + fct);
	}

}
