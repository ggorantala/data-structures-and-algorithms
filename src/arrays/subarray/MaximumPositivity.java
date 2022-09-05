package arrays.subarray;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPositivity {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, 6, -1, 7, 8));
    ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    System.out.println(solve(A));
    System.out.println(solve(B));
  }

  public static ArrayList<Integer> solve(ArrayList<Integer> A) {
    int N = A.size();
    int[] memo = {-1, -1};

    int max = Integer.MIN_VALUE;
    for (int i = 0, j = 0; j < N; j++) {
      if (A.get(j) <= 0) {
        if (max < j - i + 1) {
          memo[0] = i;
          memo[1] = j - 1;
          max = Math.max(max, j - i + 1);
        }
        i = j;
      } else {
        if (j == N - 1 && memo[0] == -1 && memo[j] == -1) {
          memo[0] = 0;
          memo[1] = N - 1;
        }
        continue;
      }
    }

    System.out.println(Arrays.toString(memo));
    return new ArrayList<>();
  }
}
