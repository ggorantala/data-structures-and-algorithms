package string;

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        System.out.println(rmDuplicates("abcd", 2));
        System.out.println(rmDuplicates("deeedbbcccbdaa", 3));
        System.out.println(rmDuplicates("pbbcggttciiippooaais", 2));
    }

    public static String rmDuplicates(String s, int k) {
        if (s.length() == 0 || k == 0 || k > s.length()) return s;

        StringBuilder sb = new StringBuilder(s);
        int[] count = new int[sb.length()];
        for (int i = 0; i < sb.length(); ++i) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                count[i] = 1;
            } else {
                count[i] = count[i - 1] + 1;
                if (count[i] == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
        }
        return sb.toString();
    }
}
