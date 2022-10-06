package string;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abaxyzzyxf"));
        System.out.println(longestPalindromicSubstring("abacab"));
    }

    public static int longestPalindromicSubstring(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            ans = Math.max(ans, expandFromMiddle(str, i, i)); // odd length
            ans = Math.max(ans, expandFromMiddle(str, i, i + 1)); // even length
        }
        return ans;
    }

    public static int expandFromMiddle(String s, int i, int j) {
        if (i > j) return 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i -= 1;
            j += 1;
        }

        return j - i - 1;
    }
}
