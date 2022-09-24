package arrays.twodimensional;

import java.util.Arrays;

public class AntiDiagonals {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(diagonal(A)));
    }

    public static int[][] diagonal(int[][] A) {
        int N = A.length;
        int[][] result = new int[2 * N - 1][N];
        int m = 0;

        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = k;
            while (i < N && j >= 0) {
                result[m][i] = A[i][j];
                i++;
                j--;
            }
            m++;

        }

        for (int k = 1; k < N; k++) {
            int n = 0;
            int i = k;
            int j = N - 1;
            while (i < N && j >= 0) {
                result[m][n++] = A[i][j];
                i++;
                j--;
            }
            m++;
        }

        return result;
    }
}
