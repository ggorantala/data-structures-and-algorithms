package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
  private final Map<Character, String> letters =
      Map.of(
          '2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9',
          "wxyz");

  public static void main(String[] args) {
    //    System.out.println(letterCombinations("23"));
    //    System.out.println(letterCombinations(""));
    //    System.out.println(letterCombinations("2"));
  }

  public static List<String> letterCombinations(String digits) {
    return new ArrayList<>();
  }
}
