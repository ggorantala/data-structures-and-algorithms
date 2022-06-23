package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfMultipleStrings {
  public static void main(String[] args) {
    String[] strings = {"apple", "oranges", "grapes", "banana"};
    System.out.println(intersection(strings));
  }

  private static List<Character> intersection(String[] strings) {
    List<Character> result = new ArrayList<>();

    int[] count = new int[1001];

    for (String s : strings) {
      Set<Character> set = new HashSet<>();
      for (char ch : s.toCharArray()) {
        if (!set.contains(ch)) {
          count[ch]++;
        }
        set.add(ch);
      }
    }

    for (int i = 0; i < count.length; i++) {
      if (count[i] == strings.length) {
        result.add((char) i);
      }
    }

    return result;
  }
}
