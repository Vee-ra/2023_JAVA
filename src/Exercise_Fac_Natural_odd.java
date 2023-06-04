
/* find sum of n natural numbers
 * To find Factorial numbers
 * */

public class Exercise_Fac_Natural_odd {

	public static int missingNumber(int[] nums) {

		int n = nums.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
		}
		int answer = n * (n + 1) / 2 - sum;
		System.out.println(answer);
		System.out.println(sum);
		return answer;

	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		missingNumber(nums);

		// N natural numbers 1 to n (0 is not a natural num)
//		int n = 5;
//		int sum = 0;
//		for (int i = 1; i <=n; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);

		// Factorial num - product of positive descending integers
//		int n = 5;
//		int num = 1;
//		for (int i = 1; i <= n; i++) {
//			num *= i;
//		}
//		System.out.println(num);

		// find first n odd numbers
//		int n = 10;
//		int i = 1; // start with first odd num
//		int count = 0; // keep track of how many odd nos printed
//		while (count < n) {
//			if (i % 2 != 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//			i++;
//		}

	}

}
