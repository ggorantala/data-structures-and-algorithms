package math;

public class FactorialOfN {
  public static void main(String[] args) {
    System.out.println(factorial(6));
    System.out.println(recursive(6));
  }

  public static int factorial(int n) {
    int factorail = 1;

    for (int i = 1; i <= n; i++) {
      factorail *= i;
    }

    return factorail;
  }

  public static int recursive(int n) {
    if (n == 0) return 1;
    return n * recursive(n - 1);
  }
}
