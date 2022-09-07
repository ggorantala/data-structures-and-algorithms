package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class PickBothSides {
    public static void main(String[] args) {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35 ));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(5, -2, 3, 1, 2));
        int B = 3;
        System.out.println(pick(A, B));
    }

    private static int pick(ArrayList<Integer> A, int B) {
        int i = 0;
        int j = A.size() - 1;

        int result = 0;
        boolean flag = false;

        while(B-- > 0) {
            if(i > 1) flag = true;
            if(A.get(j) > A.get(i) && !flag) {
                result += A.get(j--);
            } else {
                result += A.get(i++);
            }
        }
        return result;
    }
}
