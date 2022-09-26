package bitmask;

public class UnsetIthBit {
    public static void main(String[] args) {
        System.out.println(unsetIthBit(4, 1));
        System.out.println(unsetIthBit(5, 2));
    }

    public static int unsetIthBit(int A, int B) {
        return ((A >> B) & 1) == 1 ? ((1 << B) ^ A) : A;
    }
}
