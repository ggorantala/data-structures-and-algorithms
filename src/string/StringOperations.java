package string;

/**
 * Concatenate the string with itself.
 * Delete all the uppercase letters.
 * Replace each vowel with '#'.
 */
public class StringOperations {
    public static void main(String[] args) {
        System.out.println(solve("AbcaZeoB"));
    }

    public static String solve(String A) {
        StringBuilder sb = new StringBuilder();

        for (char ch : A.toCharArray()) {
            if (!Character.isUpperCase(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    sb.append('#');
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString() + sb;
    }
}
