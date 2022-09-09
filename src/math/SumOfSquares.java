package math;

public class SumOfSquares {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(3));
    }

    public static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n * n;
            n--;
        }

        return sum;
    }
}
