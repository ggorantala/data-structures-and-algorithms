package dp;

public class ClimbingChairs {
  public static void main(String[] args) {
    System.out.println(climbStair(2));
    System.out.println(climbStair(10));
    System.out.println(climbStair(15));
  }

  public static int climbStair(int n) {
    if (n == 1) {
      return 1;
    }

    int[] memo = {0, 1, 2};

    for (int i = 3; i <= n; i++) {
      int next = memo[1] + memo[2];

      memo[1] = memo[2];
      memo[2] = next;
    }

    return memo[2];
  }
}
