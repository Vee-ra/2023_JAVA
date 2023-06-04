
public class MatrixDiagnalSum {

	public static int diagnolSum(int[][] mat) {
		int sum = 0;
		int n = mat.length;

		int i = 0;
		int j = 0;

		while (i < n) { // Primary diagnol
			sum += sum + mat[i][j];
			i++;
			j++;
		}

		i = 0; // Secondary diagnol
		j = n - i;
		while (j >= 0) { // i<n also fine
			if (i != j);
			sum += sum + mat[i][j];
			i++;
			j--;
		}
		int answer = sum;
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		diagnolSum(mat);

	}

}
