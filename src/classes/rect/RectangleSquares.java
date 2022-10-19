package classes.rect;

import java.util.Arrays;

public class RectangleSquares {
    public static void main(String[] args) {
        int[] A = {16, 3, 7, 17, 7, 10, 18, 17, 16};
        int[] B = {16, 6, 7, 13, 7, 9, 18, 6, 16};
        System.out.println(Arrays.toString(solve(A, B)));
    }

    public static int[] solve(int[] A, int[] B) {
        int[] result = new int[A.length];

        Rectangle rect;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            rect = new Rectangle(A[i], B[i]);
            int area = rect.area();
            if (rect.isSquare() && area > max) {
                max = area;
                count++;
            } else {
                result[i] = count;
            }
        }
        return result;
    }
}