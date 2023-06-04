
/******************Arithmetic operators*****************/ // + - */ % 
/******************compound assignment****************/ //+= -= %=
/******************increment/decrement****************/
/****************** Conditional Operator ***************/

public class Operators {

	public static void main(String[] args) {

		int a = 3;
		double b = 4;
		double c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);

		int v = 10;
		v += 20; // compound assignment
		System.out.println(v);

		double d = a / b;
		System.out.println(d);

		double e = c % d;
		System.out.println("e " + e); // mod will give reminder

		int f = a++;
		System.out.println("f " + f);
		System.out.println(a); // post increment

		int g = ++a;
		System.out.println("g " + g);

		int h = --a;
		System.out.println("h " + h);

		int i = a--;
		System.out.println("i " + i);

		// exercise
		int h1 = 15;
		h1 = h1++ + ++h1;
		System.out.println("h1 " + h1);
		// int k = 11++; // we can't do inc/dec on constants.

		// conditional operators ? :
		int max = 0;
		int ab = 12;
		int bc = 5;
		if (ab > bc)
			max = ab;
		if (ab < bc)
			max = bc;
		System.out.println(max);

		// using conditional operator
		System.out.println((bc > ab) ? ab : bc);
		System.out.println((ab < bc) ? bc : (ab > bc) ? ab : bc);

	}

}
