package bitmask;

public class MergeAndSplit {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{9, 17}));
        System.out.println(solve(new int[]{1}));
    }

    public static String solve(int[] A) {
        int xor = A[0];

        for (int i = 1; i < A.length; i++) {
            xor ^= A[i];
        }

        if ((xor & 1) == 1)
            return "No";
        return "Yes";
    }
}
