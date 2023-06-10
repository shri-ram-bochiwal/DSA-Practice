/**
 * Given a binary sorted matrix A of size N x N. Find the row with the maximum
 * number of 1.
 * If two rows have the maximum number of 1 then return the row which has a
 * lower index.
 * Rows are numbered from top to bottom and columns are numbered from left to
 * right.
 * Assume 0-based indexing.
 * Assume each row to be sorted by values.
 * Expected time complexity is O(rows + columns).
 */

public class RowMaximumNumberOnes {

    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += A[i][j];
            }
            if (sum > max) {
                max = sum;
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[][] = { { 0, 1, 1 }, { 0, 0, 1 }, { 0, 1, 1 } };
        int input2[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 } };
        RowMaximumNumberOnes maxNumberones = new RowMaximumNumberOnes();
        System.out.println("Result For [[0, 1, 1], [0, 0, 1], [0, 1, 1]] : " + maxNumberones.solve(input1));
        System.out.println(
                "Result For [[0, 0, 0, 0], [0, 0, 0, 1], [0, 0, 1, 1], [0, 1, 1, 1]] : " + maxNumberones.solve(input2));
    }

}
