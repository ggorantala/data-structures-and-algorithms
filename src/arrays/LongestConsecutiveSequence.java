package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
  public static void main(String[] args) {
    System.out.println(longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
  }

  public static int longestConsecutive(int[] nums) {
    Set<Integer> values = new HashSet<>();

    for (int val : nums) values.add(val);

    int result = 0;

    for (int num : nums) {
      if (!values.contains(num - 1)) {
        int sequence = 1;

        while (values.contains(num + sequence)) {
          System.out.println(num +" " + sequence +" " + (num + sequence));
          ++sequence;
        }

        result = Math.max(result, sequence);
      }
    }
    return result;
  }
}
