/*
 * Constructor - Name same as class name
 * Immediately called when object created
 * used for initializing values
 * no return type
 * 
 * garbage collection - JVM will call this intermittently to remove garbages in the class
 * used to remove unwanted m/y's in the class
 * 
 * finalize used to close files what we opened for processing data's : always access using protected access specifiers
 * 
 * Anonymous object also removed using garbage collector
 * 
 * dereferencing used to maintain to remove unwanted m/y spaces
 * 
 * */
public class Box {

	int length; // instance variables
	int breadth;
	int height;
	static int boxCount; // will call immediately when class is loaded

	Box(int length, int breadth, int height) { // Constructor
		this.length = length; // this pointer
		this.breadth = breadth;
		this.height = height;
		boxCount++;
	}

	Box() { // Constructor overloading with no arguments initialized
		length = breadth = height = -1;
//		length = -1;
//		breadth = -1;
//		height = -1;
		boxCount++;
	}

	Box(int l) { // for cube
		length = breadth = height = l; // it's l
		boxCount++;
	}

	Box(Box b) { // Copy constructor
		length = b.length;
		breadth = b.breadth;
		height = b.height;
		boxCount++;
	}

	int volume() { // return type method
		return length * breadth * height;
	}

	void setDim(int length, int breadth, int height) { // method to change dimensions
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	boolean isEqual(Box b) {
		if (length == b.length && breadth == b.breadth && height == b.height)
			return true;

		return false;
	}

	void printLine() { // To print one line
		System.out.println("=====================");
	}

//	static { // example static block
//		System.out.println("customized staic block after main staic method");
//		boxCount = 0;
//	}

	static void displayBoxCount() {
		System.out.println("Box count " + boxCount);
	}

//	void protected finalize() {  //finalize
//		
//	}

	public static void main(String[] args) {

		System.out.println("main starts here");

		Box blackBox;
		System.out.println("Before creating box object");
		blackBox = new Box(2, 4, 6);
		System.out.println("After creating box object");

		System.out.println("blackBox vol is " + blackBox.volume());
		blackBox.printLine();

		Box whiteBox = new Box(3, 6, 9);
		System.out.println("whiteBox vol is " + whiteBox.volume());
		whiteBox.printLine();

		whiteBox.setDim(12, 12, 12);
		System.out.println("After changing whiteBox vol is " + whiteBox.volume());
		whiteBox.printLine();
		/*
		 * passing object to new object means we're copying/initializing old object data
		 * to new object
		 */
		Box passobjmethod = new Box(2, 4, 6);
		System.out.println("blackbox == passing object b " + blackBox.isEqual(passobjmethod));
		passobjmethod.printLine();

		// Copy constructor
		Box copyconsttest = new Box(5, 5, 5);
		Box copyconst = new Box(copyconsttest);
		System.out.println(copyconst.volume());
		; // Object created to test copy constructor
		System.out.println(copyconsttest.volume());
		; // copied copyconsttest data to copyconst
		copyconst.printLine();

		blackBox = whiteBox; // dereference

		new Box(3, 2, 4); // Anonymous Object

		Box const1 = new Box(); // constructor overloading with no data passing
		System.out.println("const1 " + const1.volume());
		const1.printLine();

		Box cont2 = new Box(12);
		System.out.println(cont2.breadth); // constructor overloading with only one data for cube
		cont2.printLine();

		System.out.println(Math.abs(-12));
		System.out.println(Math.abs(4.5));
		System.out.println(Math.abs(45));

		// System.out.println("Box count " + boxCount); --customized static block
		
		Box.displayBoxCount(); //static method

	}

}
