
public class Box1 {

	int length; /*variables inside class are called Instance variables*/
	int breadth;
	int height;

	int volume() {
		return length * breadth * height;
	}

	public static void main(String a[]) {

		Box1 blackBox1 = new Box1();

		blackBox1.breadth = 1;
		blackBox1.height = 2;
		blackBox1.length = 3;
		int blackBox1Volume = blackBox1.volume(); //if we use object reference to call methods its means we're invoking methods
		System.out.println(blackBox1Volume);

		Box1 whiteBox1 = new Box1();

		whiteBox1.length = 4;
		whiteBox1.breadth = 5;
		whiteBox1.height = 6;
		int whiteBox1Volume = whiteBox1.volume();
		System.out.println(whiteBox1Volume);

	}
}
