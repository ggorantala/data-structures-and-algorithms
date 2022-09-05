package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FirstRepeat {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 3, 4, 3, 5, 6));
    System.out.println(solve(A));
  }

  private static int solve(ArrayList<Integer> A) {
    HashMap<Integer, Integer> memo = new HashMap<>();

    for (Integer integer : A) {
      memo.put(integer, memo.getOrDefault(integer, 0) + 1);
    }

    int el = -1;
    int cnt = 0;

    for (int i = 0; i < A.size(); i++) {
      Integer integer = A.get(i);
      if (memo.get(integer) == 2 && el == -1) {
        el = integer;
      }
      if (el == integer && cnt == 1) {

      }
      if (el == integer) cnt++;
    }
    return -1;
  }
}
