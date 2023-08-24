/**
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right, which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 */

public class MinPathSum {

    public int[][] dp;

    public int minimumPathSumHelper(int[][] grid, int i, int j) {
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        if (i == 0 && j == 0) {
            return dp[i][j] = grid[i][j];
        }

        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }

        int a = minimumPathSumHelper(grid, i - 1, j);
        int b = minimumPathSumHelper(grid, i, j - 1);

        return dp[i][j] = Math.min(a, b) + grid[i][j];
    }

    public int minimumPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        return minimumPathSumHelper(grid, n - 1, m - 1);
    }

    public static void main(String[] args) {
        int[][] input1 = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int[][] input2 = { { 1, 2, 3 }, { 4, 5, 6 } };

        MinPathSum solution = new MinPathSum();

        System.out.println("Result For : " + solution.minimumPathSum(input1));
        System.out.println("Result For : " + solution.minimumPathSum(input2));
    }
}


    

    

    
