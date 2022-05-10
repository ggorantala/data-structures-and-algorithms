package math;

public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println(isPalindromeNumber(78987));
    System.out.println(isPalindromeNumber(8668));
    System.out.println(isPalindromeNumber(21));
  }

  public static boolean isPalindromeNumber(int n) {
    return reverseNumber(n) == n;
  }

  public static int reverseNumber(int n) {
    int number = 0;
    int count = 0;
    while (n > 0) {
      int remainder = n % 10;

      number = number * 10 + remainder;
      n /= 10;
    }
    return number;
  }
}
