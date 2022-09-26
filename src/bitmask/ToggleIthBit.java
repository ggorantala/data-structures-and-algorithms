package bitmask;

public class ToggleIthBit {
    public static void main(String[] args) {
        System.out.println(toggle(4, 1));
        System.out.println(toggle(5, 2));
    }

    public static int toggle(int A, int B) {
        return (A ^ (1 << B));
    }
}
