package com.OOP;

class Cycle {
	 void drive() {
		System.out.println("I'm driving cycle");
	}
}

//class Tricylce {
//	public void drive() {
//		System.out.println("I'm driving Tricycle");
//	}
//}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		Cycle c = new Cycle();
		c.drive();
		
		Cycle c1 = new Cycle() {
			 void drive() {
				System.out.println("I'm driving Tricycle");
			}
		};
		c1.drive();

//		Tricylce t = new Tricylce();
//		t.drive();
	}

}
