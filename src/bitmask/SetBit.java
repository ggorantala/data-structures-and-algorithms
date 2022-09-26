package bitmask;

public class SetBit {
    public static void main(String[] args) {
        // Set the A-th bit and B-th bit in 0, and return output in decimal.
        System.out.println(setAthAndBthBit(3, 5));
        System.out.println(setAthAndBthBit(4, 4));
    }

    public static int setAthAndBthBit(int A, int B) {
        return ((1 << A) | (1 << B));
    }
}
