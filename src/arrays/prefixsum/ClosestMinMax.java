package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestMinMax {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(343, 291, 963, 165, 152));
    System.out.println(solve(A));
  }

  public static int solve(ArrayList<Integer> A) {
    int N = A.size();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < N; i++) {
      min = Math.min(min, A.get(i));
      max = Math.max(max, A.get(i));
    }

    System.out.println(min + " " + max);
    int minId = -1;
    int maxId = -1;
    int ans = N;

    for (int i = N - 1; i >= 0; i--) {
      if (A.get(i) == min) {
        minId = i;
        if (maxId != -1) {
          ans = Math.min(ans, maxId - minId + 1);
        }
      }

      if (A.get(i) == max) {
        maxId = i;
        if (minId != -1) {
          ans = Math.min(ans, minId - maxId + 1);
        }
      }
    }

    return ans;
  }
}
