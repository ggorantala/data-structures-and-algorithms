package arrays.twodimensional;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        System.out.println(Arrays.toString(solve(A)));
    }

    public static int[] solve(int[][] A) {
        int[] result = new int[A.length];
        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                result[i] += A[i][j];
            }
        }
        return result;
    }
}
