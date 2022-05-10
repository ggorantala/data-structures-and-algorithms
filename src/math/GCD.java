package math;

public class GCD {
  public static void main(String[] args) {
    System.out.println(gcd(4, 6));
    System.out.println(euclideanAlgorithm(4, 6));
  }

  public static int gcd(int a, int b) {
    int temp = Math.min(a, b);

    while (temp > 0) {
      if (a % temp == 0 && b % temp == 0) {
        break;
      }
      temp--;
    }
    return temp;
  }

  public static int euclideanAlgorithm(int a, int b) {
    while (a != b) {
      if (a > b) a -= b;
      else b -= a;
    }
    return a;
  }
}
