package com.OOP;

class A {
	public void display() {
		System.out.println("From class A");
	}
}

class B {
	public void display() {
		System.out.println("From class B");
	}
}

class C extends B,A { //we're not able to inherit more than one class in java, multiple inheritance achieved by interface.

}

public class Miltiple_Inheritance {

	public static void main(String[] args) {

		C s = new C();
		s.display();

	}

}
