package binarysearch;

public class SquartRoot {
  public static void main(String[] args) {
    System.out.println(isPerfectSquare(8));
    System.out.println(isPerfectSquare(25));
  }

  public static int isPerfectSquare(int n) {
    int left = 2;
    int right = n / 2;

    long number;
    while (left <= right) {
      int pivot = left + (right - left) / 2;

      number = (long) pivot * pivot;

      if (number > n) {
        right = pivot - 1;
      } else if (number < n) {
        left = pivot + 1;
      } else {
        return pivot;
      }
    }

    return right;
  }
}
