package math;

public class CountOddNumbersInInterval {
  public static void main(String[] args) {
    System.out.println(countOdds(3, 7));
    System.out.println(countOdds(8, 10));
  }

  public static int countOdds(int low, int high) {
    int number = (high - low) / 2;

    if (low % 2 == 1 || high % 2 == 1) {
      number++;
    }

    return number;
  }
}
