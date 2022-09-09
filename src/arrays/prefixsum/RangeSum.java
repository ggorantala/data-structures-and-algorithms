package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */
public class RangeSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1, 4)));
        B.add(new ArrayList<>(Arrays.asList(2, 3)));

        System.out.println(rangeSum(A, B));
    }

    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> result = new ArrayList<>();
        ArrayList<Long> prefixSum = new ArrayList<>();
        prefixSum.add(Long.valueOf(A.get(0)));
        for (int i = 1; i < A.size(); i++) {
            prefixSum.add(prefixSum.get(i - 1) + Long.valueOf(A.get(i)));
        }

        for (ArrayList<Integer> query : B) {
            int start = query.get(0) - 1;
            int end = query.get(1) - 1;
            if (start != 0 && end < prefixSum.size()) result.add((prefixSum.get(end) - prefixSum.get(start - 1)));
            else if (start == 0 && end < prefixSum.size()) result.add(prefixSum.get(end));
            else result.add(prefixSum.get(start - 1));
        }
        return result;
    }
}
