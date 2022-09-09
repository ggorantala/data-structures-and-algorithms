package string;

public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
    }

    public static String runLengthEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < s.length(); i += 1) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);

            if (prev != curr || counter == 9) {
                sb.append(counter);
                sb.append(prev);
                counter = 1;
            } else {
                counter++;
            }
        }
        sb.append(counter);
        sb.append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
