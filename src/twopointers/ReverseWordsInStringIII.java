package twopointers;

public class ReverseWordsInStringIII {
  public static void main(String[] args) {
    System.out.println(reverseWords("Let's take LeetCode contest"));
    System.out.println(reverseWords("God Ding"));
  }

  public static String reverseWords(String s) {
    char[] chars = s.toCharArray();

    int i = 0;
    int j = 0;

    while (j < chars.length) {
      if (chars[j] == ' ') {
        reverse(chars, i, j - 1);
        i = j + 1;
      }
      if (j == chars.length - 1) {
        reverse(chars, i, j);
        i = j + 1;
      }
      j++;
    }
    return new String(chars);
  }

  public static void reverse(char[] chars, int i, int j) {
    while (i < j) {
      char ch = chars[i];
      chars[i++] = chars[j];
      chars[j--] = ch;
    }
  }
}
