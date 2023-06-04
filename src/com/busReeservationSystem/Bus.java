package com.busReeservationSystem;

public class Bus {
	private int busNo;
	private boolean ac;
	private int seatCapacity;

	public Bus(int busNo, boolean ac, int seatCapacity) {
		// super();
		this.setBusno(busNo);
		this.ac = ac;
		this.seatCapacity = seatCapacity;
	}

	public int getBusno() {
		return busNo;
	}

	public void setBusno(int busno) {
		this.busNo = busno;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public void displayBusInfo() {
		System.out.println("BusNo:-" + busNo + " AC:-" + ac + " SeatCapacity:-" + seatCapacity);
	}

//	boolean isAvailable() {
//		return true;
//	}

}
