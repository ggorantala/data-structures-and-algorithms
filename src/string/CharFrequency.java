package string;

public class CharFrequency {
    public static void main(String[] args) {
        charFrequency("codingisfun");
    }

    public static void charFrequency(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a'));
            }
        }
    }
}
