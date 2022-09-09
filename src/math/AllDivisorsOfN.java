package math;

public class AllDivisorsOfN {
    public static void main(String[] args) {
        divisors(100);
    }

    public static void divisors(int n) {
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
