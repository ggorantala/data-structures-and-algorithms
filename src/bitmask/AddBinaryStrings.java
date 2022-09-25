package bitmask;

public class AddBinaryStrings {
    public static void main(String[] args) {
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";

        System.out.println(addBinary(A, B));
    }

    public static String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i = A.length() - 1;
        int j = B.length() - 1;

        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            sum += i >= 0 ? A.charAt(i) - '0' : 0;
            sum += j >= 0 ? B.charAt(j) - '0' : 0;

            sb.insert(0, sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if(carry > 0) {
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
