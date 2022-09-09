package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialIndex {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 6, 4));
        System.out.println(solve(A));
    }

    static int solve(ArrayList<Integer> A) {
        int N = A.size();
        int[] prefixEven = new int[N];
        int[] prefixOdd = new int[N];

        prefixEven[0] = A.get(0);
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                prefixEven[i] = prefixEven[i - 1] + A.get(i);
                prefixOdd[i] = prefixOdd[i - 1];
            } else {
                prefixEven[i] = prefixEven[i - 1];
                prefixOdd[i] = prefixOdd[i - 1] + A.get(i);
            }
        }

        System.out.println(Arrays.toString(prefixEven));
        System.out.println(Arrays.toString(prefixOdd));

        int specialEven = -1;
        int specialOdd = -1;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                specialEven = prefixOdd[i - 1] + prefixEven[N - 1] - prefixEven[i];
                specialOdd = prefixEven[i - 1] + prefixOdd[N - 1] - prefixOdd[i];
            } else {
                specialEven = prefixOdd[N - 1] - prefixOdd[0];
                specialOdd = prefixEven[N - 1] - prefixEven[0];
            }

            if (specialEven == specialOdd) {
                cnt++;
            }
        }
        return cnt;
    }
}
