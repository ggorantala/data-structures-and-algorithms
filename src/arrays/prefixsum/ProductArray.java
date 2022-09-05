package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductArray {
  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(productArray(A));
  }

  private static ArrayList<Integer> productArray(ArrayList<Integer> A) {
    int N = A.size();
    ArrayList<Integer> result = new ArrayList<>();
    int[] prefixSum = new int[A.size()];
    int[] suffixSum = new int[A.size()];

    prefixSum[0] = 1;
    for (int i = 1; i < N; i++) {
      prefixSum[i] = prefixSum[i - 1] * A.get(i - 1);
    }

    suffixSum[A.size() - 1] = 1;
    for (int i = N - 2; i >= 0; i--) {
      suffixSum[i] = suffixSum[i + 1] * A.get(i + 1);
    }

    System.out.println(Arrays.toString(prefixSum));
    System.out.println(Arrays.toString(suffixSum));

    for (int i = 0; i < N; i++) {
      result.add(prefixSum[i] * suffixSum[i]);
    }
    return result;
  }
}
