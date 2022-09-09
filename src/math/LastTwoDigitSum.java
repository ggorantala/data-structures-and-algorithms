package math;

public class LastTwoDigitSum {
    public static void main(String[] args) {
        int number = 2379;
        System.out.println(lastTwoDigitSum(number));
    }

    static int lastTwoDigitSum(int n) {
        int lastTwoDigits = n % 100; // 79
        int lastDigit = lastTwoDigits % 10;
        int secondLastDigit = lastTwoDigits / 10;

        return lastDigit + secondLastDigit;
    }
}
