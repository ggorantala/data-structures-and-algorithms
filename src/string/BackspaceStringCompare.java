package string;

import java.util.Stack;

public class BackspaceStringCompare {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));
  }

  public static boolean backspaceCompare(String s, String t) {
    return backspace(s).equals(backspace(t));
  }

  public static String backspace(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '#' && !stack.isEmpty()) {
        stack.pop();
      } else {
        stack.push(ch);
      }
    }
    return String.valueOf(stack);
  }
}
