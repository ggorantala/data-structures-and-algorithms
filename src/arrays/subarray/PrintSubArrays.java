package arrays.subarray;

public class PrintSubArrays {
  public static void main(String[] args) {
    int[] A = {8, 6, 5};
    int N = A.length;
    for (int i = 0; i < N; i++) {
      for (int j = i; j < N; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(A[k] + ", ");
        }
        System.out.println();
      }
    }
  }
}
