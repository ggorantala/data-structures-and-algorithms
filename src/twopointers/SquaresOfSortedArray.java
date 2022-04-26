package twopointers;

import java.util.Arrays;

public class SquaresOfSortedArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(sort(new int[] {-4, -1, 0, 3, 10})));
  }

  private static int[] sort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] *= nums[i];
    }

    Arrays.sort(nums);
    return nums;
  }
}
