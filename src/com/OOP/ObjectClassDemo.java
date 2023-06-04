package com.OOP;

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = "JAVA";
		String s3 = new String("JAVA");
		String s4 = new String("JAVA");
		
		System.out.println(s1==s2); //constants stored in pool m/y
		System.out.println(s1==s3); 
		
		System.out.println(s3.equals(s4) ); //new different m/y location
	}

}
