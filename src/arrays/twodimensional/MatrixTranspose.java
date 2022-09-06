package arrays.twodimensional;

import java.util.Arrays;

public class MatrixTranspose {
  public static void main(String[] args) {
    int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    solve(A);
    System.out.println(Arrays.deepToString(A));
  }

  private static void solve(int[][] A) {
    int N = A.length;

    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (i != j) {
          swapElements(A, i, j);
        }
      }
    }
  }

  private static void swapElements(int[][] a, int i, int j) {
    int temp = a[i][j];
    a[i][j] = a[j][i];
    a[j][i] = temp;
  }
}
