package recursion;

public class IsMagic {
  public static void main(String[] args) {
    System.out.println(solve(1291));
  }

  public static int solve(int A) {
    if (A < 10) {
      return A;
    }

    while (A > 9) {
      A = loop(A);
    }

    return A == 1 ? 1 : 0;
  }

  private static int loop(int A) {
    int sum = 0;
    while (A > 9) {
      sum += A % 10;
      A = A / 10;
    }

    return sum + A;
  }
}
