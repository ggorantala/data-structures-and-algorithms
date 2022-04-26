package binarysearch;

public class SearchInsertPosition {
  public static void main(String[] args) {
    System.out.println(searchInsert(new int[] {1, 3, 5, 6}, 5));
  }

  private static int searchInsert(int[] nums, int target) {
    int middle;
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      middle = low + (high - low) / 2;
      if (nums[middle] == target) {
        return middle;
      } else if (target < nums[middle]) {
        high = middle - 1;
      } else {
        low = middle + 1;
      }
    }
    return low;
  }
}
