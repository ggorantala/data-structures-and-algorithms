package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayDiffRemove {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrayDiff(new int[] { 1, 2 }, new int[] { 1 })));
    System.out.println(Arrays.toString(arrayDiff(new int[] { 1, 2, 2, 2, 3 }, new int[] { 2 })));
  }

  public static int[] arrayDiff(int[] a, int[] b) {
    if (b.length == 0) {
      return a;
    }

    List<Integer> ans = new ArrayList<>();
    HashMap<Integer, Boolean> lookup = new HashMap<>();

    for (int j : b) {
      lookup.put(j, true);
    }

    for (int j : a) {
      if (!lookup.containsKey(j)) {
        ans.add(j);
      }
    }
    return ans.stream().mapToInt(i -> i).toArray();
  }
}
