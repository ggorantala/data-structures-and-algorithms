package arrays.twodimensional;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solve(A);
    }

    public static void solve(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        for (int i = A[0].length, k = 0; i >= 0; i--, k++) {
            for (int j = 0, l = 0; j < A.length; j++, l++) {
                B[k][l] = A[i][j];
            }
        }

        System.out.println(Arrays.deepToString(B));
    }
}
