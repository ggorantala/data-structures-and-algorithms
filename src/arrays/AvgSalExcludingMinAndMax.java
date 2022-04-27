package arrays;

import java.util.Arrays;

public class AvgSalExcludingMinAndMax {

  public static void main(String[] args) {
    System.out.println(average(new int[] {4000, 3000, 1000, 2000}));
    System.out.println(average(new int[] {1000, 2000, 3000}));
  }

  public static double average(int[] salary) {
    double avg = 0;

    Arrays.sort(salary);

    for (int i = 1; i < salary.length - 1; i++) {
      avg += salary[i];
    }

    return avg / (salary.length - 2);
  }
}
