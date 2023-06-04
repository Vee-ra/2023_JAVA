
public class NestedLoopsPractice {

	public static void Pyramid(int n) {

		// Outer loop to control rows
		for (int i = 0; i < n; i++) {
			// Inner loop to print spaces
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				// System.out.print("* "); //* in pyramid
				System.out.print(i + " "); // 0 11 22 3333 44444 in pyramid
				// System.out.print(j + " " ); //0 01 012 0123 01234 in pyramid
			}
			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		int n = 5;
		Pyramid(n);

		// example -1 1,2,3,4,5
		for (int i =1; i<=n;i++) {
			for(int j =1; j<=i; j++) {
				//System.out.print("*");
				//System.out.print(i); //1 22 333 4444 55555
				System.out.print(j); //1 12 123 1234 12345
			} 
			System.out.println(" "); //for next line without gap
			//System.out.println("\n"); //for next line with gap
		}

	}

}
