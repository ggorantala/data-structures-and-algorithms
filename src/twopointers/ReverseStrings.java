package twopointers;

import java.util.Arrays;

public class ReverseStrings {
  public static void main(String[] args) {
    char[] chars = {'h', 'e', 'l', 'l', 'o'};
    reverseString(chars);
    System.out.println(Arrays.toString(chars));
  }

  public static void reverseString(char[] s) {
    int i = 0;
    int j = s.length - 1;

    while (i < j) {
      char ch = s[i];
      s[i++] = s[j];
      s[j--] = ch;
    }
  }
}
