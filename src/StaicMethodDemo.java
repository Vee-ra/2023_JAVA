/*
 * Methods - to carry out a specific tasks
 * method i/p - parameters/arguments 
 **/

public class StaicMethodDemo {

	static int boxVolume(int height, int breadth, int length) { // method with arguments
		int vol = height * breadth * length;
		return vol;
	}

	static void printLine() {
		System.out.println("------------------------------"); // method without arguments
	}

	public static void main(String[] args) {

		int volume = boxVolume(10, 20, 30);
		System.out.println(volume);
		
		printLine();

	}

}
