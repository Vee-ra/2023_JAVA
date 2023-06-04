package com.OOP;

import java.util.MissingFormatArgumentException;

public class Student {

	String name;
	int rollNo;
	int[] marks;

	public Student(String name, int rollNo, int[] marks) {
		// super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public Student(String name, int rollNo, int mark1, int mark2, int mark3) { // Constructor overloading
		this.name = name;
		this.rollNo = rollNo;
		this.marks = new int[] { mark1, mark2, mark3 };
	}

	public int getTotalMarks() {
		int total = 0;
		for (int x : marks) {
			total += x;
		}

		return total;

	}

	public static void main(String[] args) {

		Student stu1 = new Student("veera", 3, new int[] { 1, 2, 3 });
		int s1m = stu1.getTotalMarks();
		System.err.println(s1m);

		Student stu2 = new Student("veera", 3, new int[] { 4, 5, 3 });
		int s2m = stu2.getTotalMarks();
		System.err.println(s2m);

		Student stu3 = new Student("Ravee", 123, 12, 32, 43);
		int s3m = stu3.getTotalMarks();
		System.out.println(s3m);

	}

}
