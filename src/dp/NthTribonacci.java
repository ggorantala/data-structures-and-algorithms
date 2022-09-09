package dp;

public class NthTribonacci {

    public static void main(String[] args) {
        System.out.println(tribonacci(2));
        System.out.println(tribonacci(3));
        System.out.println(tribonacci(10));
    }

    public static int tribonacci(int n) {
        int[] memo = {0, 1, 1};

        for (int i = 3; i <= n; i++) {
            int next = memo[0] + memo[1] + memo[2];

            memo[0] = memo[1];
            memo[1] = memo[2];
            memo[2] = next;
        }

        return n >= 2 ? memo[2] : n == 1 ? memo[1] : memo[0];
    }
}
