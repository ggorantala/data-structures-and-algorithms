package string;

import java.util.ArrayList;

public class ValidIpAddress {
  public static void main(String[] args) {
    System.out.println(validIPAddresses("1921680"));
  }

  public static ArrayList<String> validIPAddresses(String s) {
    int length = s.length();
    for (int i = 0; i < s.length(); i++) {}

    return new ArrayList<String>();
  }

  public static boolean isValidIP(String n) {
    int number = Integer.parseInt(n);
    return number > 0 && number < 255;
  }
}
