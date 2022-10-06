package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1, 3));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 1, 3, 3));

        System.out.println(isNoble(A));
        System.out.println(isNoble(B));
    }

    public static int isNoble(ArrayList<Integer> A) {
        int ans = 0;
        int cnt = 0;

        A.sort(Comparator.comparingInt(o -> o));

        for (int i = 0; i < A.size(); i++) {
            if (i > 0 && A.get(i) != A.get(i - 1)) {
                cnt = i;
            }

            if (A.get(i) == cnt) {
                ans += 1;
            }
        }

        return ans;
    }
}
