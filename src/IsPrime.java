public class IsPrime {
  public static void main(String[] args) {
    System.out.println(isPrime(2));
    System.out.println(isPrime(3));
    System.out.println(isPrime(4));
    System.out.println(isPrime(5));
    System.out.println(isPrime(27));
    System.out.println(isPrime(22));
  }

  private static boolean isPrime(int n) {
    if (n < 2) return false;

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
