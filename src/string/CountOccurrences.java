package string;

// find "bob" occurrences
public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(solve("bobob"));
    }

    private static int solve(String A) {
        int N = A.length();
        String target = "bob";
        int ans = 0;
        for (int i = 0; i < N - target.length() + 1; i++) {
            char ch = A.charAt(i);
            if (ch == target.charAt(0) && target.equals(A.substring(i, target.length() + i))) {
                ans += 1;
                i += 1;
            }
        }
        return ans;
    }
}
