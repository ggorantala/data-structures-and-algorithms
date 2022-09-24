package arrays.twodimensional;

public class MinorDiagnols {
    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        int[][] B = {{3, 2}, {2, 3}};
        System.out.println(solve(A));
        System.out.println(solve(B));
    }

    public static int solve(final int[][] A) {
        int N = A.length;
        int sum = 0;
        for (int i = N - 1, j = 0; i >= 0; i--) {
            sum += A[j][i];
            j++;
        }
        return sum;
    }
}
