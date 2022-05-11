package string;

import java.util.Arrays;

public class LeftMostNonRepeatingChar {
  public static void main(String[] args) {
    System.out.println(leftMostNonRepeatingChar("hello programmer"));
    System.out.println(optimizedApproach("kkhello programmer"));
  }

  public static char leftMostNonRepeatingChar(String s) {
    int[] memo = new int[2 << 7];

    for (char ch : s.toCharArray()) {
      memo[ch]++;
    }

    for (char ch : s.toCharArray()) {
      if (memo[ch] == 1) {
        return ch;
      }
    }
    return ' ';
  }

  public static int optimizedApproach(String s) {
    int[] memo = new int[2 << 7];
    Arrays.fill(memo, -1);

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (memo[ch] == -1) {
        memo[ch] = i;
      } else {
        memo[ch] = -2;
      }
    }

    int res = Integer.MAX_VALUE;
    for (int j : memo) {
      if (j >= 0) {
        res = Math.min(res, j);
      }
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }
}
