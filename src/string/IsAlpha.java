package string;

import java.util.ArrayList;
import java.util.Arrays;

public class IsAlpha {
  public static void main(String[] args) {
    ArrayList<Character> A = new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y'));
    ArrayList<Character> B = new ArrayList<>(Arrays.asList('S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'));
    System.out.println(solve(A));
    System.out.println(solve(B));
  }

  public static int solve(ArrayList<Character> A) {
    for (char ch : A) {
      if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
        return 0;
      }
    }
    return 1;
  }
}
