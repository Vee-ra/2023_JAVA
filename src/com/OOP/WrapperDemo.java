package com.OOP;

public class WrapperDemo {

	public static void main(String[] args) {

		int a = 10, b = 20; // Primitive data types

		Integer i1 = Integer.valueOf(b); // Integer = wrapper class //Boxing,wrapping

		int j = i1.intValue(); // Unboxing

		Integer i2 = 30; // we can directly put num it'll covert to Integer.valueOf(30); //auto boxing

		int k = i2; // auto Unboxing

		String s = "123";

		int c = Integer.parseInt(s); // parseInt - static method inside Integer wrapper class
		
		System.out.println(c);
	}

}
