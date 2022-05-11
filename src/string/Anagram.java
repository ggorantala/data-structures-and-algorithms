package string;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(anagram("listen", "silent"));
    System.out.println(anagram("listen", "silsent"));
  }

  public static boolean anagram(String s, String t) {
    if (s.length() != t.length()) return false;

    int[] memo = new int[2 << 6];

    for (char ch : s.toCharArray()) {
      memo[ch]++;
    }

    for (char ch : t.toCharArray()) {
      if (memo[ch] > 0) {
        memo[ch]--;
      } else {
        return false;
      }
    }

    for (int item : memo) {
      if (item > 0) {
        return false;
      }
    }
    return true;
  }
}
