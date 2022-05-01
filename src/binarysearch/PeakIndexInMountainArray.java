package binarysearch;

public class PeakIndexInMountainArray {
  public static void main(String[] args) {
    System.out.println(peakIndex(new int[] {0, 1, 0}));
  }

  private static int peakIndex(int[] nums) {
    if (nums.length == 0) return 0;

    int i = 0;
    while (nums[i] < nums[i + 1]) i++;
    return i;
  }
}
