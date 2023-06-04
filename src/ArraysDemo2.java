import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6 };
		// System.out.println(a[3]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
		}

		// to get input from users to store in array

		int b[] = new int[6];
		System.out.println("enter 6 numbers");
		Scanner scanext = new Scanner(System.in);

		for (int i = 0; i < b.length; i++)
			b[i] = scanext.nextInt();
		for (int i = 0; i < b.length; i++)
			System.out.println(b[i]);
	}

}
