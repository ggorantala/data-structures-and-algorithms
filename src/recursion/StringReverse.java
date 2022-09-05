package recursion;

public class StringReverse {

  public static void main(String[] args) {
    System.out.println(stringRev("academyhelp"));
    System.out.println(stringRev("cool"));
  }

  private static String stringRev(String A) {
    StringBuilder sb = new StringBuilder();
    int N = A.length();
    int j = N - 1;
    rev(sb, A, j);
    return sb.toString();
  }

  private static void rev(StringBuilder sb, String A, int j) {
    if (j == -1) {
      return;
    }
    sb.append(A.charAt(j));
    j--;
    rev(sb, A, j);
  }
}
