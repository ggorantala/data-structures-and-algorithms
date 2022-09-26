package graph;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int i = 1;
        int j = 1;
        int newColor = 2;

        System.out.println(Arrays.deepToString(floodFill(image, i, j, newColor)));
    }

    public static int[][] floodFill(int[][] image, int i, int j, int newColor) {
        if (image[i][j] == newColor) { // this is when the newColor is already filled
            return image;
        }
        dfs(image, i, j, image[i][j], newColor);
        return image;
    }

    public static void dfs(int[][] image, int i, int j, int color, int newColor) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != color) {
            return;
        }

        image[i][j] = newColor;
        dfs(image, i - 1, j, color, newColor); // dfs on row before
        dfs(image, i + 1, j, color, newColor); // dfs on row after
        dfs(image, i, j - 1, color, newColor); // dfs on column before
        dfs(image, i, j + 1, color, newColor); // dfs on column after
    }
}
