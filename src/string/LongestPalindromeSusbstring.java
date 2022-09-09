package string;

public class LongestPalindromeSusbstring {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abaxyzzyxf"));
    }

    public static String longestPalindromicSubstring(String str) {
        if (str == null || str.length() == 0) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int len1 = expandFromMiddle(str, i, i); // odd length
            int len2 = expandFromMiddle(str, i, i + 1); // even length

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

            System.out.println(len + " " + start + " " + end);
        }
        return str.substring(start, end + 1);
    }

    public static int expandFromMiddle(String s, int i, int j) {
        if (i > j) return 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return j - i - 1;
    }
}
