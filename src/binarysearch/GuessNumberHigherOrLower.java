package binarysearch;

public class GuessNumberHigherOrLower {
  public static void main(String[] args) {
    System.out.println(guessNumber(10));
  }

  public static int guessNumber(int n) {
    int low = 1;
    int high = n;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      int res = guess(mid);
      if (res == 0) return mid;
      else if (res < 0) high = mid - 1;
      else low = mid + 1;
    }
    return -1;
  }

  private static int guess(int mid) {
    int pick = 6;
    return mid > pick ? -1 : mid < pick ? 1 : 0;
  }
}
