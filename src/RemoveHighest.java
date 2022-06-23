import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveHighest {
  public static void main(String[] args) {
    List<String> history = Arrays.asList("712", "296", "365", "312");
    slotWheels(history);
  }

  public static int slotWheels(List<String> history) {
    int currentMax = 0;
    int max = Integer.MIN_VALUE;
    List<List<Integer>> list = new ArrayList<>();
    int i = 0;
    while (i < history.size()) {
      for (String s : history) {
        List<Integer> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
          int m = ch - '0';
          max = Math.max(max, m);
          chars.add(m);
        }
        currentMax = max;
        Collections.sort(chars);
        chars.remove(chars.size() - 1);
        list.add(chars);
      }
      i++;
    }
    System.out.println(currentMax + " " + list);
    return 0;
  }
}
