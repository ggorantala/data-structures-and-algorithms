package dp;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";
        System.out.println(lcs(s1, s2, s1.length(), s2.length()));
    }

    static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
    }
}
