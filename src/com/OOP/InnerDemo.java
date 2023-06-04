package com.OOP;

class Outer {
	int x = 10;

	public void outerDisplay() {
		System.out.println("Outer Display");
	}

	static class Inner {
		int y = 10;

		public void innerDisplay() {
			System.out.println("Inner Display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {

		Outer o = new Outer();
		o.x = 23;
		o.outerDisplay();

		// Outer.Inner i = o.new Inner(); //inner class invoked using outer class object
		// i.innerDisplay();

		Outer.Inner i = new Outer.Inner(); // static inner class revoked using Outer(Class).Inner
		i.innerDisplay();
	}

}
