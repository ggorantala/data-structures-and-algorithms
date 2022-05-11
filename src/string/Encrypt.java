package string;

public class Encrypt {
  public static void main(String[] args) {
    System.out.println(encrypt("xyz", 2));
  }

  public static String encrypt(String s, int key) {
    char[] chars = s.toCharArray();
    key %= 122;

    for (int i = 0; i < chars.length; i++) {
      chars[i] = encryptChar(chars[i], key);
    }
    return new String(chars);
  }

  public static char encryptChar(char ch, int key) {
    int count = key + ch;

    return count <= 122 ? (char) count : (char) (96 + (count % 122));
  }
}
