package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();

        int[] count = new int[1001];

        for (int[] arr : nums) {
            for (int i : arr) {
                count[i]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == nums.length) {
                ans.add(i);
            }
        }

        return ans;
    }
}
