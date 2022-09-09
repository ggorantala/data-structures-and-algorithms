package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words =
            new ArrayList<String>(
                Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        HashMap<String, List<String>> result = new HashMap<String, List<String>>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);

            if (result.containsKey(sorted)) {
                result.get(sorted).add(word);
            } else {
                result.put(sorted, new ArrayList<String>(List.of((word))));
            }
        }

        return new ArrayList<>(result.values());
    }
}
