package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 * <p>
 * Find the minimum time in seconds to make all elements of the array equal.
 * <p>
 * A = [2, 4, 1, 3, 2]
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeEquality {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 1, 3, 2));
    System.out.println(solve(A));
  }

  public static int solve(ArrayList<Integer> A) {
    int max = A.get(0);
    for (int i : A) {
      if (i > max) {
        max = i;
      }
    }

    int result = 0;

    for (Integer integer : A) {
      result += max - integer;
    }

    return result;
  }
}
