package com.OOP;

/* Tells what to do not how to do
 * Methods are abstract and public by default
 * Concrete methods can be define in interface from from JAVA 1.8 using 'default' keyword.
 * Variables are final,static and public by default.
 * Interface can not be instantiated - no constructors as well
 * A class can implement interface/interfaces.
 * Class implementing interface should define all abstract methods inside interface. 
 * Supports multiple inheritance.
 * An interface can extend another interface/interfaces.
 * 
 * If we have only one abstract method inside interface it is called as 'SAM' - Single Abstraction Method also called as Functional interface.
 * Functional interface - JAVA 8 -> default methods may be many but abstract should be only one inside functional interface
 * */

interface Ridable { // interface name always end with 'able' in suffix

	int MAX_SPEED = 90; // public,Final,Static variables in default and these are no instance variables

	// public void ride(); -> Theses methods are abstract and public by default no need to add public in prefix
	void ride(); //abstract method

	default void display() { // we can define concrete methods inside interface using 'default' keyword from
								// JAVA 1.8
		System.out.println("Hello from Ridable");
	}
}

abstract class Scooty implements Ridable {
	// To avoid defining method inside a interface implementation we have to make this as a abstract class.
}

class Car implements Ridable {
	public void ride() {
		System.out.println("Your'e riding a car");
	}
//		public void display() { // Method Overriding also possible in interface
//			System.out.println("Hello from Car");
//		}
}

class Bike implements Ridable {
	public void ride() {
		System.out.println("Your'e riding a car");
	}
}

class Mechanic {
	void checking(Ridable r) {
		System.out.println("Checking");
		r.ride();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {

		// Ridable r = new Ridable() -> not able to create objects for interface.
		// for that we have to use lambda expression or Anonymous class

		Ridable r1 = new Car();
		Ridable r2 = new Bike();
		// Ridable r3 = new Mechanic(); -> not able becoz Mechanic doesn't implements
		// Interface Ridable
		
		Ridable r3 = new Ridable() {
			
			@Override
			public void ride() {
				System.out.println("You're riding a vintage car");
			}
		};
		r3.ride();
		 
		//lambda expression - only usable in functional interface and also a only one abstract method will be there
		Ridable r4 = () -> System.out.println("You're driving a Convertible car");
		r4.ride();
		
		Mechanic m = new Mechanic();

		Car c = new Car();
		Bike b = new Bike();

		m.checking(b);
		m.checking(c);
		c.display();

	}

}
