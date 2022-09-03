package arrays;

public class MaxValue {
  public static void main(String[] args) {
    System.out.println(maxValue(new int[] {4, 7, 2, 8, 10, 9}));
  }

  private static int maxValue(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int number : nums) {
      if (max < number) {
        max = number;
      }
    }

    return max;
  }
}
