package binarysearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    private static int searchInsert(int[] nums, int target) {
        int middle;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
