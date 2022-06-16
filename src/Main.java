import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<Integer, Integer> memo = new HashMap<>();

    int[] nums = {1, 2, 3, 1, 2, 3, 4, 5, 6};

    for (int num : nums) {
      //      memo.merge(num, 1, Integer::sum);
      memo.put(num, memo.getOrDefault(num, 0) + 1);
    }

    int[] numbers = new int[memo.values().size()];
    int k = 0;

    for(int i: memo.values()) {
      numbers[k++] = i;
    }


  }
}
