package bitmask;

public class NumberOfOneBits {
    public static void main(String[] args) {
        System.out.println(numSetBits(26));
        System.out.println(numSetBits(11));
        System.out.println(numSetBits(2));
    }

    public static int numSetBits(int n) {
        int ans = 0;

        while (n > 0) {
            if ((n & 1) == 1) ans += 1;
            n >>= 1;
        }

        return ans;
    }

    public static int recommendedApproach(int n) {
        int[] table = new int[256];
        table[0] = 0;

        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i >> 1]; // i >> 1 equals to i/2
        }

        int res = 0;
        for (int i = 0; i < 4; i++) {
            res += table[n & 0xff];
            n >>= 8;
        }

        return res;
    }
}
