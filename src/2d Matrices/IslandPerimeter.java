/**
 * You are given row x col grid representing a map where grid[i][j] = 1
 * represents land and grid[i][j] = 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally). The grid
 * is completely surrounded by water, and there is exactly one island (i.e., one
 * or more connected land cells).
 * The island doesn't have "lakes", meaning the water inside isn't connected to
 * the water around the island. One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 */

public class IslandPerimeter {

    public int IslandPerimeterSolve(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    sum += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        sum -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        sum -= 2;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int input1[][] = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
        int input2[][] = { { 1 } };
        int input3[][] = { { 1, 0 } };
        IslandPerimeter perimeter = new IslandPerimeter();
        System.out.println(
                "Result For [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]] : " + perimeter.IslandPerimeterSolve(input1));
        System.out.println("Result For [[1]] : " + perimeter.IslandPerimeterSolve(input2));
        System.out.println("Result For [[1,0]] : " + perimeter.IslandPerimeterSolve(input3));
    }

}
