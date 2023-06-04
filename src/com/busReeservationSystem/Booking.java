package com.busReeservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	private String passengername;
	private int busNo;
	private Date date;

	Booking() {
		System.out.println("Enter passanger name");
		Scanner scanner = new Scanner(System.in);
		passengername = scanner.next();
		System.out.println("Enter bus number");
		busNo = scanner.nextInt();
		System.out.println("Enter travel data mentioned format -> dd-MM-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {

		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusno() == busNo)
				capacity = bus.getSeatCapacity();
		}

		int booked = 0;
		for (Booking b : bookings) {
			if (b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}

		return booked < capacity ? true : false;
	}

}
