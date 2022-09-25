package arrays.twodimensional;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(solve(A)));
    }

    public static int[][] solve(int[][] A) {
        int N = A.length;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < row; col++) {
                int temp = A[row][col];
                A[row][col] = A[col][row];
                A[col][row] = temp;
            }
        }

        for (int row = 0; row < N; row++) {
            int start = 0;
            int end = N - 1;
            while (start < end) {
                int temp = A[row][start];
                A[row][start] = A[row][end];
                A[row][end] = temp;
                start++;
                end--;
            }
        }
        return A;
    }
}
