package arrays.twodimensional;

import java.util.Arrays;
import java.util.HashSet;

public class RowToColZero {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 2, 0, 4}};
        System.out.println(Arrays.deepToString(solve(A)));
    }

    public static int[][] solve(int[][] A) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (A[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (rows.contains(i) || cols.contains((j))) {
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }
}
