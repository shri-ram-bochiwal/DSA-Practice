/**
 * Given a knapsack weight A and a set of items with certain value B[i] and
 * weight C[i], we need to calculate maximum amount that could fit in this
 * quantity.
 * This is different from classical Knapsack problem, here we are allowed to use
 * unlimited number of instances of an item.
 */

public class UnboundedKnapsack {

    public int solve(int A, int[] B, int[] C) {
        int n = C.length;
        int[][] dp = new int[n][A + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= A; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                } else if (i == 0) {
                    if (j >= C[i]) {
                        dp[i][j] = B[i];
                    }
                } else if (j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (j < C[i]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i][j - C[i]] + B[i], dp[i - 1][j]);
                    }
                }
            }
        }

        return dp[n - 1][A];
    }

    public static void main(String[] args) {
        int capacity1 = 10;
        int[] value1 = { 5 };
        int[] weight1 = { 10 };

        int capacity2 = 10;
        int[] value2 = { 6, 7 };
        int[] weight2 = { 5, 5 };

        UnboundedKnapsack solution = new UnboundedKnapsack();
        System.out.println("Result For A = 10, B = [5], C = [10] : " + solution.solve(capacity1, value1, weight1));
        System.out.println("Result For A = 10, B = [6, 7], C = [5, 5] : " + solution.solve(capacity2, value2, weight2));
    }

}
