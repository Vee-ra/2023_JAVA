package com.OOP;

/*
 * Access specifiers:-
 * default - we can access data and methods inside the package
 * private - we can access data inside the particular 'class' only
 * public - - all from same package/ class and also from other packages
 * protected - all from same package/ class and also from other packages(we have to import pkg2 into pkg1)
 * */

public class Stack {
	int s[] = new int[10];
	int tos; // array index

	Stack() {
		tos = -1; // assigning stack index to -1 level
	}

	void push(int value) {

		if (tos == 9) {
			System.out.println("Stack is Overflow");
		} else {
			// tos = tos +1;
			// s[tos]=8;
			s[++tos] = value;
		}
	}

	int pop() {
		if (tos >= 0) {
			return s[tos--];
		} else {
			System.out.println("Stack is underflow");
			return -1;
		}
	}

}