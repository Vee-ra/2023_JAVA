import java.util.Scanner;

public class SwitchStatement { // if else, switch statements are conditional statements bcoz its select =s
								// depends on selection

	public static void main(String[] args) {

		int num1;
		int num2;

		System.out.println("enter number 1");
		Scanner scnum1 = new Scanner(System.in);
		num1 = scnum1.nextInt();
		System.out.println("enter number 2");
		Scanner scnum2 = new Scanner(System.in);
		num2 = scnum2.nextInt();

		System.out.println("enter the operator + - / %");
		Scanner scchar = new Scanner(System.in);
		char operator = scchar.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println(num1 + num2 + "=" + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 - num2 + "=" + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 * num2 + "=" + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 / num2 + "=" + (num1 / num2));
			break;
		case '%':
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			break;

		default:
			System.out.println("you have entered the wrong character");

		}

	}

}
