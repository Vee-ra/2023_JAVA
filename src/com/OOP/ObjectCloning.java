package com.OOP;

class Department implements Cloneable {
	int deptId;
	String name;

	public Department(int id, String name) {
		super();
		this.deptId = id;
		this.name = name;
	}

	void display() {
		System.out.println("IDd : " + deptId);
		System.out.println("Name : " + name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Studunt implements Cloneable {
	int id;
	String name;
	Department dept;

	public Studunt(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public Studunt(Studunt s1) {

	}

	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		dept.display();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { // Deep copy
		Studunt s = (Studunt) super.clone();
		s.dept = (Department) s.dept.clone();
		return s;
	}
}

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department dept = new Department(01, "Physics");
		Studunt s1 = new Studunt(1, "Veera", dept);
		// Studunt s2 = s1; Object reference
		Studunt s3 = (Studunt) s1.clone();

		dept.name = "Maths";

		//dept.display();
		s1.display();// Shallow copy
		s3.display(); // Deep copy

	}

}
