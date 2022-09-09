package string;

import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        System.out.println(optimizedApproach("hello programmer"));
    }

    public static char leftMostRepeatingChar(String s) {
        int[] memo = new int[2 << 6];
        for (char ch : s.toCharArray()) {
            memo[ch]++;
        }

        for (char ch : s.toCharArray()) {
            if (memo[ch] > 1) {
                return ch;
            }
        }
        return ' ';
    }

    public static char optimizedApproach(String s) {
        boolean[] visited = new boolean[2 << 7];
        Arrays.fill(visited, false);

        int res = Integer.MAX_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!visited[s.charAt(i)]) {
                visited[s.charAt(i)] = true;
            } else {
                res = i;
            }
        }
        return s.charAt(res);
    }
}
