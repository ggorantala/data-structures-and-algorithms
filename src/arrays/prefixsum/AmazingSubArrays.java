package arrays.prefixsum;

public class AmazingSubArrays {
    public static void main(String[] args) {
        System.out.println(solve("ABED"));
    }

    public static int solve(String A) {
        long N = A.length();
        long ans = 0;

        for (int i = 0; i < N; i++) {
            char ch = Character.toLowerCase(A.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans += (N - i);
            }
        }

        return (int) (ans % 10003);
    }
}
