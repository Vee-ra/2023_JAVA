package com.OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		int a = 10, b = 0;
		int c = 0;

		try {
			int arr[] = null;
			int i = arr[1];
			c = a / b;
		} catch (NullPointerException | ArithmeticException e) { // from JAV 1.7 we can nested exceptions
			System.out.println("Error has Occured");
		}
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic exception occured");
//		}
//		catch (NullPointerException e) {
//			System.out.println("Nullpointer exception occured");
//		}
		catch (Exception e) {
			System.out.println("Error Occured");
		} finally {
			System.out.println("No mater what this gets printed");
			System.out.println("Used to close resources");
		}
		System.out.println(c);
		System.out.println("End of Pgm");

//		try (Scanner scanner = new Scanner(System.in)) { //finally replacing here try with resources technique
//			int k = scanner.nextInt();
//		}

		File file = new File("abc.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

		// Custom Exception
		double bal = 200, withdraw = 700;

		try {
			if (bal < withdraw) {
				throw new InsufficeintFundException(withdraw - bal);
			}
		} catch (InsufficeintFundException e) {
			System.out.println("Not Enough money in the account");
		}

	}
}
