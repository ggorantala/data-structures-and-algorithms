package math;

import java.util.Arrays;

public class TrailingZeros {
  public static void main(String[] args) {
    System.out.println(zeros(6));
    System.out.println(zeros(12));
  }

  public static int zeros(int n) {
    int count = 0;
    long number = fact(n);

    while (number > 0) {
      long val = number % 10;
      if (val == 0) {
        count++;
      } else {
        break;
      }
      number /= 10;
    }
    return count;
  }

  public static long fact(int n) {
    long number = 1;

    for (int i = 1; i <= n; i++) {
      number *= i;
    }
    return number;
  }
}
