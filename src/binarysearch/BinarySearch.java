package binarysearch;

public class BinarySearch {
  public static void main(String[] args) {
    System.out.println(binarySearch(new int[] {-1, 0, 3, 5, 9, 12}, 9));
  }

  //  Time: O(logn),  Space: O(1), where n = length of nums array
  private static int binarySearch(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int middle = low + (high - low) / 2; // for overflows.

      int number = nums[middle];

      if (number == target) {
        return middle;
      } else if (number > target) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }
    return -1;
  }
}
