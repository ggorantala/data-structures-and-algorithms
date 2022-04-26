import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[] {1, 2, 3, 4, 5, 6}, 7)));
  }

  private static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> lookup = new HashMap<>();
    int[] result = {-1, -1};

    for (int i = 0; i < nums.length; i++) {
      int difference = target - nums[i];
      if (lookup.containsKey(difference)) {
        return new int[] {lookup.get(difference), i};
      }

      lookup.put(nums[i], i);
    }
    return result;
  }
}
