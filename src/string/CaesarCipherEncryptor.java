package string;

public class CaesarCipherEncryptor {
  public static void main(String[] args) {
    System.out.println(CaesarCipherEncryptor("xyz", 2));
  }

  public static String CaesarCipherEncryptor(String s, int key) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      char ch = encrypt(c, key);
      sb.append(ch);
    }
    return sb.toString();
  }

  public static char encrypt(char ch, int key) {
    key = key % 26;
    int c = ch + key;
    return c <= 122 ? (char) c : (char) (96 + c % 122);
  }
}
