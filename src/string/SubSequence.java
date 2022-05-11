package string;

public class SubSequence {
  public static void main(String[] args) {
    System.out.println(subsequence("ABCDEF", "ADE"));
    System.out.println(subsequence("ABCDEF", "AB"));
  }

  public static boolean subsequence(String s, String t) {
    int i = 0;
    int j = 0;

    while (i < s.length() && j < t.length()) {
      if (j == t.length()) {
        return true;
      }
      if (t.charAt(j) == s.charAt(i)) {
        j++;
      }
      i++;
    }
    return j == t.length();
  }
}
