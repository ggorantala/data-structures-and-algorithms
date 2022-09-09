package string;

import java.util.Arrays;

public class GenerateDocument {
    public static void main(String[] args) {
        System.out.println(generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
    }

    public static boolean generateDocument(String characters, String document) {
        int[] memo = new int[2 << 6];

        for (char ch : characters.toCharArray()) {
            memo[ch]++;
        }

        System.out.println(Arrays.toString(memo));

        for (char ch : document.toCharArray()) {
            if (memo[ch] == 0) {
                return false;
            } else {
                memo[ch]--;
            }
        }

        return true;
    }
}
