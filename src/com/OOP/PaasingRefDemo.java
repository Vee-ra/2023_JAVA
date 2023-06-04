package com.OOP;

/*
 * call by value - main/increment method both are different and stack m/y allocation.
 * call by ref - we can pass bl object to b2 it will pass reference of b1 to b2 bcoz here we're using dynamic(heap size) m/y allocation
 * ..ctnd.,it is passing b1 reference only to b2
 * //returning  objects
 * */
class Box {

	int length; // instance variables
	int breadth;
	int height;

	Box(int length, int breadth, int height) { // Constructor
		this.length = length; // this pointer
		this.breadth = breadth;
		this.height = height;
	}

	boolean isEqual(Box b) {
		b.length++;
		if (length == b.length && breadth == b.breadth && height == b.height)
			return true;

		return false;
	}

	Box doubleBox() { //returning  objects
		Box temp = new Box(2 * length, 2 * breadth, 2 * height);
		return temp;
	}
}

public class PaasingRefDemo {

	static int increment(int a) {
		return a++;
	}

	public static void main(String[] args) {
		int a = 10;
		increment(a);
		System.out.println(a);

		Box b1 = new Box(2, 3, 4);
		Box b2 = new Box(2, 3, 4); // copy constructor
//			System.out.println(b1.isEqual(b2));
//			System.out.println(b1.length);

		Box b3 = b1.doubleBox(); //returning  objects
		System.out.println(b3.height);
	}

}
