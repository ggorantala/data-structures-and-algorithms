package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {
    public static void main(String[] args) {
//    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 10, 2, 3, 4));
        int B = 3;

        System.out.println(solve(A, B));
    }

    private static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();

        int[] prefixSum = new int[N];
        int[] suffixSum = new int[N];

        prefixSum[0] = A.get(0);
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }

        suffixSum[N - 1] = A.get(N - 1);
        for (int i = N - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + A.get(i);
        }

        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(suffixSum));

        int max = suffixSum[N - B];
        for (int i = 0; i < B - 1; i++) {
            int sum1 = prefixSum[i] + suffixSum[N - B + i + 1];
            max = Math.max(max, sum1);
        }

        max = Math.max(max, prefixSum[B - 1]);
        return max;
    }
}
