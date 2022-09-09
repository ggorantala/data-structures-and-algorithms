package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an array A of integers of size N.
 * <p>
 * Your task is to find the equilibrium index of the given array
 * <p>
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 */
public class EquilibriumIndex {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        ArrayList<Integer> A2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        solve(A1);
        solve(A2);
    }

    private static void solve(ArrayList<Integer> A) {
        int N = A.size();
        int[] prefixSum = new int[N];
        int[] suffixSum = new int[N];

        prefixSum[0] = A.get(0);
        for (int i = 1; i < A.size(); i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }

        suffixSum[N - 1] = A.get(N - 1);
        for (int i = N - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + A.get(i);
        }

        for (int i = 0; i < N; i++) {
            if (prefixSum[i] == suffixSum[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
