package bitmask;

public class ParityNumber {
  public static void main(String[] args) {
    System.out.println(parity(12));
    System.out.println(parity(11));
  }

  public static String parity(int n) {
    return (n & 1) == 0 ? "even" : "odd";
  }
}
