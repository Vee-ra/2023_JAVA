package com.OOP;

/*
 * we can pass args or files to program
 * this is mainly used for file processing means daily one by one we can able change the file
 * */

public class CommandLineArgDemo {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			// System.out.println(i);
			System.out.println(args[i]);
		}
	}
}
