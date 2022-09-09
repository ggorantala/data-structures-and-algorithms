package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    //  Time: O(logN),  Space: O(1), where n = length of nums array
    private static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2; // for overflows.

            int number = nums[middle];

            if (number == target) {
                return middle;
            } else if (number > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
