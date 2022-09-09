package heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SmallestKIntegersII {
    public static void main(String[] args) {
        int[] nums = {5, 9, 3, 6, 2, 1, 3, 2, 7, 5};
        int k = 4;

        System.out.println(Arrays.toString(kSmallest(nums, k)));
    }

    public static int[] kSmallest(int[] nums, int k) {
        PriorityQueue<Integer> smallestKNums = new PriorityQueue<>((x, y) -> y - x);

        for (int value : nums) {
            if (smallestKNums.size() < k) {
                smallestKNums.add(value);
                System.out.println(smallestKNums);
            } else if (value < smallestKNums.peek()) {
                smallestKNums.poll();
                System.out.println(smallestKNums.poll());
                smallestKNums.add(value);
                System.out.println(" - " + smallestKNums);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = smallestKNums.poll();
        }
        return result;
    }
}
