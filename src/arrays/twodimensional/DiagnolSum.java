package arrays.twodimensional;

public class DiagnolSum {
    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
        System.out.println(solve(A));
    }

    public static int solve(final int[][] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result += A[i][i];
        }

        return result;
    }
}
