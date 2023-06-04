
/* loops - used to repeat the st of instructions again and again
 * for loop / while loop / do while loop
 * */

public class LoopsDemo {

	public static void main(String[] args) {

		String newline = System.lineSeparator(); // for new/next line we're using line separator property

		int i; // initialization
		int n = 5; // condition
		for (i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println(newline + "initialization  i is increased,condition failed, inc by one " + i);
		System.out.println(n);

		// While loop - Entry controlled loop
//		int w = 1; //initialization	
//		int m = 5; //condition
//		while (w<=m) {
//			System.out.println(w);
//			 w++;
//		}
//		System.out.println(newline + m);
//		System.out.println("*");

		// Do while loop - exit controlled loop
//		int z = 1;
//		int x = 5;
//		do {
//			System.out.println(z); // if we print iterator i it will print next line only instead of i we put * it'll print horizontally.
//			z++;
//		} while(z<=x);

	}

}
