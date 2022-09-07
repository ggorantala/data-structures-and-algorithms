package arrays.prefixsum;

import java.util.ArrayList;
import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
      ArrayList<Integer> A = new ArrayList<>(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5 ));
      ArrayList<ArrayList<Integer>> B = new ArrayList<>();
      B.add(new ArrayList<>(Arrays.asList(7,10)));
      B.add(new ArrayList<>(Arrays.asList(3, 10)));
      B.add(new ArrayList<>(Arrays.asList(3, 5)));
      B.add(new ArrayList<>(Arrays.asList(1, 10)));
      System.out.println(prefixSum(A, B));
    }

    static ArrayList<Long> prefixSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> result = new ArrayList<>();
        ArrayList<Long> prefixSum = new ArrayList<>();
        prefixSum.add(Long.valueOf(A.get(0)));
        for(int i = 1; i < A.size(); i++) {
            prefixSum.add(prefixSum.get(i - 1) + Long.valueOf(A.get(i)));
        }

        for(ArrayList<Integer> query : B ) {
            int start = query.get(0) - 1;
            int end = query.get(1) - 1;
            if(start != 0 && end < prefixSum.size()) result.add((prefixSum.get(end) - prefixSum.get(start - 1)));
            else if(start == 0 && end < prefixSum.size()) result.add(prefixSum.get(end));
            else result.add(prefixSum.get(start - 1));
        }
        return result;
    }
}
