
public class First { // JAVA is case sensitive

	public static void main(String[] args) {
		System.out.println("Hello world - 2023");

		// Variable and Data types - variables are named m/y allocation.

		// Variable declaration = Data type + Variable name

		int ticketPrice = 900; // variable initialization
		System.out.println("ticketPrice");

		// 1byte = 8bit
		byte carPrice = 123; // 1byte = -128 to 127
		// byte ncarPrice = (byte) 1235;
		System.out.println(carPrice);
		// System.out.println(ncarPrice);
		// short trainTicket = (short) 123456; //2bytes = -32768 to 32767
		short busTicket = 12345;
		// System.out.println(trainTicket);
		System.out.println(busTicket);
		int farePrice = 900; // 4bytes = -2^31 to 2^31-1
		System.out.println(farePrice);
		long multiAxilebus = 1234567890; // 8bytes = -2^63 to 2^63-1
		System.out.println(multiAxilebus);
		float boatPrice = 1234567.1234567f; // 4bytes upto 7decimal digits
		System.out.println("boatPrice " + boatPrice);
		double shipPrice = 1234567.45; // 8bytes upto 15decimal digits
		System.out.println("shipPrice " + shipPrice);
		boolean true_$4False = true; // 1byte we can use only $_ symbol while assinging varaible and can use numbers
										// but in MIDDLE of the variable
		System.out.println(true_$4False);
		char singleChar = 'V'; // 2buye single character
		System.out.println(singleChar);

		// single line comment

		/* multi line comment */

		// literals = right side value of an variable

		// escape sequences
		System.out.println("escape \n sequence"); // next line
		System.out.println("\"Hello world\""); // To print with double quotations
		System.out.println("next \t tab");

		// Type casting
		byte b = 123;
		int a = b; // implicit type conversion

		int l = 1234567; // explicit type conversion
		byte s = (byte) l;

	}

}
