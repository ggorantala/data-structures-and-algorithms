package math;

public class MagicalNumber {
  public static void main(String[] args) {
    System.out.println(magicalNumber(39));
  }

  public static int magicalNumber(int n) {
    while (n > 9) {
      n = digitSum(n);
    }
    return n;
  }

  private static int digitSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
