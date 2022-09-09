package string;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("Welcome to Java club"));
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        reverse(chars, 0, s.length() - 1);

        for (int start = 0, end = 0; end < chars.length; end++) {
            if (chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
            if (end == chars.length - 1) {
                reverse(chars, start, end);
            }
        }
        return new String(chars);
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char ch = chars[start];
            chars[start++] = chars[end];
            chars[end--] = ch;
        }
    }
}
