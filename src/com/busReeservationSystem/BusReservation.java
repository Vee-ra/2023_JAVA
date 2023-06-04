package com.busReeservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BusReservation {

	public static void main(String args[]) {

		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();

		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 45));
		buses.add(new Bus(3, false, 8));

		int userOption = 1;
		Scanner scanner = new Scanner(System.in);

		for (Bus b : buses) {
			b.displayBusInfo();
		}

		while (userOption == 1) {
			System.out.println("Enter 1 for booking 2 for exit");
			userOption = scanner.nextInt();
			if (userOption == 1) {
				Booking booking = new Booking();
				// System.out.println("Booking....");
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				} else
					System.out.println("Sorry, Bus is full. Try another bus or date");
			}
		}
	}

}
