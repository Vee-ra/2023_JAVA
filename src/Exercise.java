
public class Exercise {

	public static void main(String[] args) {
		// given number is odd or even
		int a = 10;
		System.out.println(a % 2 != 0 ? "odd" : "even");

		// find the nearest perfect square number greater than n, for given n. hint: you
		// can use sqrt and floor functions
		int n = 25;
		int root = (int) Math.floor(Math.sqrt(n));
		int nextSquare = (root + 1) * (root + 1);
		System.out.println(nextSquare);

		// print all numbers less than 100 except number divisible by both 4 and 6. use
		// continue in your program
		for (int i = 0; i < 100; i++) {
			if (i % 4 == 0 && i % 6 == 0) {
				continue;
			}
			System.out.println(i);
		}
		// To print only the numbers that are divisible by both 4 and 6 in numbers from 0 to 100(i.e., 0, 12,
		// 24, 36, 48, 60, 72, 84, 96)
		for (int i = 0; i < 100; i++) {
			if (i % 4 == 0 && i % 6 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}

	}
}
