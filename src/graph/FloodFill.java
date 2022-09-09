package graph;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;

        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, newColor)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) { // this is when the newColor is already filled
            return image;
        }
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) {
            return;
        }

        image[sr][sc] = newColor;
        dfs(image, sr - 1, sc, color, newColor); // dfs on row before
        dfs(image, sr + 1, sc, color, newColor); // dfs on row after
        dfs(image, sr, sc - 1, color, newColor); // dfs on column before
        dfs(image, sr, sc + 1, color, newColor); // dfs on column after
    }
}
