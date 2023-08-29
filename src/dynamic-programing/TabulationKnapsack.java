/**
 * Given two integer arrays A and B of size N each which represent values and
 * weights associated with N items respectively.
 * Also given an integer C which represents knapsack capacity.
 * Find out the maximum value subset of A such that sum of the weights of this
 * subset is smaller than or equal to C.
 * NOTE:
 * You cannot break an item, either pick the complete item, or don’t pick it
 * (0-1 property).
 */

public class TabulationKnapsack {

    public int solve(int[] A, int[] B, int C) {
        int n = A.length;
        int[][] dp = new int[n][C + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= C; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                } else if (i == 0) {
                    if (j >= B[i]) {
                        dp[i][j] = A[i];
                    }
                } else if (j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (j < B[i]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j - B[i]] + A[i], dp[i - 1][j]);
                    }
                }
            }
        }
        return dp[n - 1][C];
    }

    public static void main(String[] args) {
        int[] values1 = { 60, 100, 120 };
        int[] weight1 = { 10, 20, 30 };
        int capacity1 = 50;

        int[] values2 = { 10, 20, 30, 40 };
        int[] weight2 = { 12, 13, 15, 19 };
        int capacity2 = 10;

        TabulationKnapsack solution = new TabulationKnapsack();

        System.out.println("Result For : " + solution.solve(values1, weight1, capacity1));
        System.out.println("Result For : " + solution.solve(values2, weight2, capacity2));
    }

}
