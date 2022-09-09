package string;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("abcdcaf"));
    }

    public static int firstNonRepeatingCharacter(String string) {
        int[] memo = new int[2 << 6];

        for (char ch : string.toCharArray()) {
            memo[ch]++;
        }

        int i = 0;
        for (char ch : string.toCharArray()) {
            if (memo[ch] == 1) {
                return i;
            }
            i++;
        }

        return -1;
    }
}
