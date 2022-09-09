package string;

import java.util.ArrayList;
import java.util.Arrays;

public class ToUpper {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>(Arrays.asList('S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'));
        System.out.println(to_lower(A));
    }

    public static ArrayList<Character> to_lower(ArrayList<Character> A) {
        for (int i = 0; i < A.size(); i++) {
            char ch = A.get(i);
            if (Character.isLowerCase(ch)) {
                A.set(i, Character.toUpperCase(ch));
            }
        }
        return A;
    }
}
