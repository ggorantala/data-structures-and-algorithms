package binarysearch;

public class FindPeakElement {
  public static void main(String[] args) {
    System.out.println(findPeak(new int[] {1, 2, 3, 1}));
    System.out.println(findPeak(new int[] {1, 2, 1, 3, 5, 6, 4}));
  }

  public static int findPeak(int[] nums) {
    int floorIndex = 0;
    int ceilingIndex = nums.length - 1;

    while (floorIndex <= ceilingIndex) {
      int guessIndex = floorIndex + (ceilingIndex - floorIndex) / 2;

      if (canGoLeft(nums, guessIndex)) {
        ceilingIndex = guessIndex - 1;
      } else if (canGoRight(nums, guessIndex)) {
        floorIndex = guessIndex + 1;
      } else {
        return guessIndex;
      }
    }

    return 0;
  }

  private static boolean canGoRight(int[] nums, int guessIndex) {
    if (guessIndex == nums.length - 1) return false;

    return nums[guessIndex + 1] >= nums[guessIndex];
  }

  private static boolean canGoLeft(int[] nums, int guessIndex) {
    if (guessIndex == 0) return false;

    return nums[guessIndex - 1] >= nums[guessIndex];
  }
}
