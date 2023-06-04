
public class ForEachDemo {

	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 1, 2, 3, 4, 5 };
		for (int x : a) {
			sum += x;
			// System.out.println(x);
		}
		System.out.println(sum);
	}

}
