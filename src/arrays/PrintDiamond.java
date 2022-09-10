package arrays;

import java.util.Scanner;

public class PrintDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printStar(N);
        sc.close();
    }

    private static void printStar(int N) {
        for (int i = 0; i < N * 2; i++) {
            for (int j = 0; j < N * 2; j++) {
                if ((i < N && (j < N - i || j >= N + i)) || (j <= i - N || j > N * 2 - i + N - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}