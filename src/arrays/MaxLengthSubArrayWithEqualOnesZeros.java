package arrays;

import java.util.Arrays;

public class MaxLengthSubArrayWithEqualOnesZeros {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 0, 1, 1, 0, 1};
        System.out.println(longestSubArrayWithEqualOnesAndZeros(A));
    }

    public static int longestSubArrayWithEqualOnesAndZeros(int[] A) {
        int ans = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = -1;
            }
        }

        int[] p = new int[A.length];

        p[0] = A[0];
        for (int i = 1; i < p.length; i++) {
            p[i] = p[i - 1] + A[i];
        }

        for(int i = 0; i < p.length; i++) {
            if(p[i] == 0) {
                ans = i;
            }
        }

        System.out.println(Arrays.toString(p));

        return ans;
    }
}
