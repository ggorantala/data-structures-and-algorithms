package bitmask;

public class CheckBitSet {
    public static void main(String[] args) {
        System.out.println(check(4, 1));
        System.out.println(check(5, 2));
    }

    public static int check(int A, int B) {
        return ((A >> B) & 1) == 1 ? 1 : 0;
    }
}
