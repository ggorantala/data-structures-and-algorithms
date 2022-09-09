package recursion;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aabbaa"));
        System.out.println(isPalindrome("aabbawa"));
    }

    private static boolean isPalindrome(String s) {
        return isPalRecursive(s, 0, s.length() - 1);
    }

    public static boolean isPalRecursive(String s, int i, int j) {
        if (i > j || i == j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;

        return isPalRecursive(s, i + 1, j - 1);
    }
}
