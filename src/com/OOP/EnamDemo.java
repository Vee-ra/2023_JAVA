package com.OOP;

//used to represent a fixed set of constants
//able to create our own data type like classes
//known as enumerated data type

enum Level {
	BEGINNER("B"), INTERMEDIATE("I"), ADVANCED("A");

	private String Abreviation;

	private Level(String abreviation) {
		Abreviation = abreviation;
	}

	public String getAbreviation() {
		return Abreviation;
	}

	public void setAbreviation(String abreviation) {
		Abreviation = abreviation;
	}

}

enum Size {
	SMALL, MEDIUM, LARGE
}

enum DaysOfWeek {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnamDemo {

	public static void main(String[] args) {
		
		Level l1 = Level.BEGINNER; //using constant directly
		System.out.println(l1);

		System.out.println(l1.getAbreviation());
		System.out.println(l1.ordinal());

		String sizeString = "MEDIUM"; // Using valueOf method
		Size size = Size.valueOf(sizeString);
		System.out.println(size);

		DaysOfWeek firstDay = DaysOfWeek.MONDAY;
		DaysOfWeek secondDay = DaysOfWeek.TUESDAY;

		int comparisionResult = firstDay.compareTo(secondDay); // Using compareTo method

		if (comparisionResult < 0) {
			System.out.println(firstDay + " comes before " + secondDay);
		} else if (comparisionResult > 0) {
			System.out.println(firstDay + " comes after " + secondDay);
		} else {
			System.out.println(firstDay + " and " + secondDay + " are same");
		}

	}

}
