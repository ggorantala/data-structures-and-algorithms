package recursion;

public class PrintValues {
  public static void main(String[] args) {
    printValues(5);
  }

  public static void printValues(int n) {
    if (n == 0) {
      return;
    }
    printValues(n - 1);
    System.out.println(n);
  }
}
