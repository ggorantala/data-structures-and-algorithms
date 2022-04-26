package twopointers;

import java.util.Arrays;

public class RotateArray {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(rotate(new int[] {1, 2, 3, 4, 5, 6, 7}, 3)));
  }

  public static int[] rotate(int[] nums, int k) {
    k = k % nums.length;

    reverse(0, nums.length - 1, nums);
    reverse(0, k - 1, nums);
    reverse(k, nums.length - 1, nums);

    return nums;
  }

  private static void reverse(int i, int j, int[] nums) {
    while (i < j) {
      int temp = nums[i];
      nums[i++] = nums[j];
      nums[j--] = temp;
    }
  }
}
