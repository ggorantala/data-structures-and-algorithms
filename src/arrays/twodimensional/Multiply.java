package arrays.twodimensional;

import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 2;
        System.out.println(Arrays.toString(solve(A, B)));
    }

    public static int[][] solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] *= B;
            }
        }
        return A;
    }
}
