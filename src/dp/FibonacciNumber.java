package dp;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2)); // 1
        System.out.println(fib(5)); // 5
        System.out.println(fib(6)); // 8
        System.out.println(fib(10)); // 55
    }

    public static int fib(int n) {
        int[] memo = {0, 1};

        for (int i = 2; i <= n; i++) {
            int next = memo[0] + memo[1];

            memo[0] = memo[1];
            memo[1] = next;
        }

        return n >= 1 ? memo[1] : memo[0];
    }
}
