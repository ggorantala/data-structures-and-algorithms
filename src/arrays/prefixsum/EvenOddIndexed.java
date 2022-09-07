package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddIndexed {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<>(List.of(2, 1, 6, 4));
        ArrayList<Integer> A2 = new ArrayList<>(List.of(1, 1, 1));
        System.out.println(evenOddIndex(A1));
        System.out.println(evenOddIndex(A2));
    }

    static int evenOddIndex(ArrayList<Integer> A) {
        int N = A.size();
        int[] even = new int[N];
        int[] odd = new int[N];
        int[] ps = new int[N];

        ps[0] = A.get(0);
        for (int i = 1; i < N; i++) {
            ps[i] = ps[i - 1] + A.get(i);
        }
        even[0] = A.get(0);
        odd[0] = 0;
        for (int i = 1; i < N; i++) {
            if (i % 2 == 0) {
                even[i] = even[i - 1] + A.get(i);
                odd[i] = odd[i - 1];
            } else {
                even[i] = even[i - 1];
                odd[i] = odd[i - 1] + A.get(i);
            }
        }

        System.out.println(Arrays.toString(ps));
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        int so, se, cnt = 0;

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                so = odd[i - 1] + even[N - 1] - even[i];
                se = even[i - 1] + odd[N - 1] - odd[i];
            } else {
                so = even[N - 1] - even[0];
                se = odd[N - 1] - odd[0];
            }
            if (so == se) {
                cnt++;
            }
        }
        return cnt;
    }
}
