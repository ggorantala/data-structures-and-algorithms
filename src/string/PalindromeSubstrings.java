package string;

public class PalindromeSubstrings {
  public static void main(String[] args) {
    System.out.println(countPalindromes("abbcbc"));
  }

  public static int countPalindromes(String s) {
    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      result += expandFromMiddle(s, i, i);
      result += expandFromMiddle(s, i, i + 1);
    }
    return result;
  }

  public static int expandFromMiddle(String s, int i, int j) {
    int result = 0;

    while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
      result++;
      i--;
      j++;
    }
    return result;
  }
}
