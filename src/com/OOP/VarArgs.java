package com.OOP;

/*
 * Variable length Arguments
 * here we can multiple integers,char,boolean it will catch this in arrays
 * Usually it is used in web application - to pass default data's
 * */

//static int minValue(we can pass multiple parameters like char c, string s,boolean b, int... vals -> but varargs should bee in last only)

public class VarArgs {

	static int minValue(int... vals) { // SE 5.0 onwards we can use varargs

		// int min = vals[0]; -> this is also correct
		int min = Integer.MAX_VALUE; // generally we use this type

		for (int k : vals) {
			if (k < min) {
				min = k;
			}
		}
		return min;
	}

	static double minValue(double... dvals) {
		// int s = dvals[0];
		double min = Double.MIN_VALUE;

		for (double l : dvals) {
			if (l < min) {
				min = l;
			}
		}
		return min;
	}

	public static void main(String[] args) {

		int m = minValue(12, 23, 56, -2, 0);
		System.out.println(m);

		int n = minValue(-3, -3);
		System.out.println(n);

		int empty = minValue();
		System.out.println(empty); // Integer.MAX_VALUE -> it'll print max size of integer value

		double doub1 = minValue(2.0, 3.0, 6.5, 0.0);
		System.out.println(doub1);

		double doub2 = minValue();
		System.out.println(doub2);
	}

}
