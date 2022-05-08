package string;

import java.util.Arrays;

public class SplitStrings {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(splitStrings("abc")));
    System.out.println(Arrays.toString(splitStrings("abcdef")));
  }

  private static String[] splitStrings(String s) {
    int length = s.length() % 2 == 0 ? s.length() / 2 : (s.length() / 2) + 1;
    String[] strings = new String[length];
    StringBuilder sb = new StringBuilder(2);
    int k = 0;

    for (int i = 0; i < s.length(); i += 2) {
      sb.append(s.charAt(i));
      if (i + 1 < s.length()) {
        sb.append(s.charAt(i + 1));
      } else {
        sb.append('_');
      }
      strings[k++] = sb.toString();
      sb.delete(0, sb.length());
    }
    return strings;
  }
}
