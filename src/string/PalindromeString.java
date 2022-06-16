package string;

public class PalindromeString {
  public static void main(String[] args) {
    System.out.println(isPalindrome("ABCDCBA"));
    System.out.println(isPalindrome("xyz"));
  }

  // O(n) time, and O(1) space
  public static boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
      if (s.charAt(start++) != s.charAt(end--)) {
        return false;
      }
    }
    return true;
  }
}
