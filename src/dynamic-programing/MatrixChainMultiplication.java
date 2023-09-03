/**
 * Given an array of integers A representing chain of 2-D matices such that the
 * dimensions of ith matrix is A[i-1] x A[i].
 * Find the most efficient way to multiply these matrices together. The problem
 * is not actually to perform the multiplications, but merely to decide in which
 * order to perform the multiplications.
 * Return the minimum number of multiplications needed to multiply the chain.
 */

public class MatrixChainMultiplication {

    public int[][] dp;

    public int solve(int[] A) {
        int n = A.length;
        dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return mcm(0, n - 1, A);
    }

    public int mcm(int i, int j, int[] A) {
        if (i + 1 == j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int minCost = Integer.MAX_VALUE;

        for (int k = i + 1; k < j; k++) {
            int left = mcm(i, k, A);
            int right = mcm(k, j, A);
            int selfCost = A[i] * A[k] * A[j];
            int totalCost = left + right + selfCost;
            minCost = Math.min(minCost, totalCost);
        }

        return dp[i][j] = minCost;
    }

    public static void main(String[] args) {
        int[] input1 = { 40, 20, 30, 10, 30 };
        int[] input2 = { 10, 20, 30 };

        MatrixChainMultiplication solution = new MatrixChainMultiplication();
        System.out.println("Result For [40, 20, 30, 10, 30] : " + solution.solve(input1));
        System.out.println("Result For [10, 20, 30] : " + solution.solve(input2));
    }

}
