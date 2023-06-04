import java.util.*;

public class Inputdemo {

	public static void main(String[] args) {

		// Getting user inputs using inbuild Scanner class and its scanner objects

		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scanner.nextLine();

		System.out.println("What is your rating?");
		int num = scanner.nextInt();
		scanner.nextLine(); // after getting integer i/p from user we press enter so it woon't allow us to
							// type email(string) to avoid that we use one next line.

		System.out.println("What is your email?");
		String email = scanner.nextLine();

		System.out.println("enter boolean");
		scanner.nextBoolean();

		System.out.println("enter double or flaot");
		scanner.nextDouble();
		scanner.nextLine(); // after getting double i/p from user we press enter so it woon't allow us to
							// type email(string) to avoid that we use one next line.

		System.out.println("enter any char");
		scanner.nextLine().chars();// we have to use i/p stream chars to get character using scanner dont have
									// inbuild .nectchar

	}

}
