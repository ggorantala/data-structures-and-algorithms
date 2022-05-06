package string;

public class LengthOfLongestSubstring {
  public static void main(String[] args) {
    //
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring("bbbbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));
  }

  private static int lengthOfLongestSubstring(String str) {
    int start = 0;
    int end = 0;
    int res = 0;
    int[] chars = new int[2 << 6];

    while (end < str.length()) {
      char ch = str.charAt(end);
      chars[ch]++;

      while (chars[ch] > 1) {
        char left = str.charAt(start);
        chars[left]--;
        start++;
      }
      res = Math.max(res, end - start + 1);
      end++;
    }

    return res;
  }
}
