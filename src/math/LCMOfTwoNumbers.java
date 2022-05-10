package math;

public class LCMOfTwoNumbers {
  public static void main(String[] args) {
    System.out.println(lcm(4, 6));
    System.out.println(optimizedApproach(4, 6));
  }

  public static int lcm(int a, int b) {
    int res = Math.max(a, b);

    while (true) {
      if (res % a == 0 && res % b == 0) {
        return res;
      }
      res++;
    }
  }

  // using a*b = gsc(a,b) * lcm(a, b) formula
  public static int optimizedApproach(int a, int b) {
    int gcd = GCD.optimizedEuclidean(a, b);

    return (a * b) / gcd;
  }
}
