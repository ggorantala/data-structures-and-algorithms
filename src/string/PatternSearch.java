package string;

import java.util.ArrayList;
import java.util.List;

public class PatternSearch {
  public static void main(String[] args) {
    patternSearch("welcome elvs", "el");
  }

  public static void patternSearch(String s, String pattern) {
    List<Integer> indexes = new ArrayList<>();
    int currentIndex = -1;
    for (int i = 0, j = 0; i < s.length(); i++) {
      if (s.charAt(i) == pattern.charAt(j)) {
        currentIndex = i;
        j++;
      }
    }
  }
}
