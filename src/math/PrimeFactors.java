package math;

public class PrimeFactors {
  public static void main(String[] args) {
    primeFactors(12);
    moreOptimized(450);
  }

  // naive approach
  public static void primeFactors(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (IsPrime.isPrime(i)) { // only check for prime numbers
        int temp = i;

        while (n % temp == 0) {
          System.out.println(i);
          temp *= i;
        }
      }
    }
  }

  public static void optimizedApproach(int n) {
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.println(i);
        n = n / i;
      }
    }
    if (n > 1) {
      System.out.println(n);
    }
  }

  public static void moreOptimized(int n) {
    if (n <= 1) return;

    while (n % 2 == 0) {
      System.out.println(2);
      n /= 2;
    }

    while (n % 3 == 0) {
      System.out.println(3);
      n /= 2;
    }

    for (int i = 5; i * i <= n; i += 6) {
      while (n % i == 0) {
        System.out.println(i);
        n = n / i;
      }
      while (n % (i + 2) == 0) {
        System.out.println(i + 2);
        n = n / (i + 2);
      }
    }

    if (n > 3) { // as we already calculatd for 2 and 3
      System.out.println(n);
    }
  }
}
