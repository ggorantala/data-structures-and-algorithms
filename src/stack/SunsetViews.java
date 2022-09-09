package stack;

import java.util.ArrayList;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        String direction = "WEST";

        System.out.println(sunsetViews(buildings, direction));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> result = new ArrayList<>();
        int start, end;
        if (direction != "EAST") {
            start = buildings.length - 1;
            end = 0;
        } else {
            start = 0;
            end = buildings.length - 1;
        }

        while (direction == "EAST") {

        }
        return result;
    }
}
