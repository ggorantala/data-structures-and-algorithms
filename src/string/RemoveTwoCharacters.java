package string;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveTwoCharacters {
    public static void main(String[] args) {
        System.out.println(removeTwoChars("abaacdabd"));
    }

    public static int removeTwoChars(String s) {
        HashMap<Character, Integer> memo = new HashMap<>();

        for (char ch : s.toCharArray()) {
            memo.merge(ch, 1, Integer::sum);
        }

        int[] values = new int[memo.size()];
        int k = 0;

        for (int i : memo.values()) {
            values[k++] = i;
        }

        Arrays.sort(values);
        char[] chars = new char[2];
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (memo.get(ch) == values[values.length - 1]) {
                chars[i++] = ch;
            } else if (memo.get(ch) == values[values.length - 2]) {
                chars[i++] = ch;
            }
        }

        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == chars[0] || ch == chars[1]) {
                count++;
            }
        }
        return count;
    }
}
