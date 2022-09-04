package arrays.prefixsum;

import java.util.Arrays;

public class Subsequence {
  public static void main(String[] args) {
    System.out.println(solve("ABBAAG"));
    System.out.println(solve("GBA"));
  }

  public static int solve(String A) {
    int N = A.length();
    int[] cnt = new int[N];
    int result = 0;

    Arrays.fill(cnt, 0);
    if (A.charAt(N - 1) == 'G') {
      cnt[N - 1] = 1;
    }
    for (int i = N - 2; i >= 0; i--) {
      if (A.charAt(i) == 'G') {
        cnt[i] = 1 + cnt[i + 1];
      } else {
        cnt[i] = cnt[i + 1];
      }
    }

    for (int i = 0; i < N - 1; i++) {
      if (A.charAt(i) == 'A') {
        result += cnt[i];
      }
    }
    return result;
  }
}
