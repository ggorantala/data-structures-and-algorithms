package math;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieveOfEratosthenes(100);
    }

    public static void sieveOfEratosthenes(int n) {
        int[] array = new int[n + 1];
        Arrays.fill(array, 1);
        array[0] = array[1] = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (IsPrime.isPrime(i)) {
                for (int j = 2 * i; j <= n; j += i) {
                    array[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
