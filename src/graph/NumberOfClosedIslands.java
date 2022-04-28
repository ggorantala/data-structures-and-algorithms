package graph;

public class NumberOfClosedIslands {
  public static void main(String[] args) {
    int[][] islands = {
      {1, 1, 1, 1, 1, 1, 1, 0},
      {1, 0, 0, 0, 0, 1, 1, 0},
      {1, 0, 1, 0, 1, 1, 1, 0},
      {1, 0, 0, 0, 0, 1, 0, 1},
      {1, 1, 1, 1, 1, 1, 1, 0}
    };
    //
    System.out.println(numberOfClosedIslands(islands));
  }

  public static int numberOfClosedIslands(int[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int closedIslands = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0 && dfs(grid, i, j)) {
          closedIslands += 1;
        }
      }
    }
    return closedIslands;
  }

  public static boolean dfs(int[][] grid, int row, int col) {
    if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length) {
      return false;
    }
    if (grid[row][col] == 1) {
      return true;
    }

    grid[row][col] = 1;

    boolean up = dfs(grid, row - 1, col);
    boolean bottom = dfs(grid, row + 1, col);
    boolean left = dfs(grid, row, col - 1);
    boolean right = dfs(grid, row, col + 1);

    return left && right && up && bottom;
  }
}
