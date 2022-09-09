package math;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(zeros(6));
        System.out.println(zeros(12));
        System.out.println(zeros(200));
    }

    public static int zeros(int n) {
        int res = 0;

        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        return res;
    }
}
