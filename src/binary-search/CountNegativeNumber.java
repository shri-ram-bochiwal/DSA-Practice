
/**
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
 */

import java.util.Arrays;

public class CountNegativeNumber {

    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (grid[i][mid] < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            count += m - left;
        }
        return count;
    }

    public static void main(String[] args) {
        int input1[][] = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        int input2[][] = { { 3, 2 }, { 1, 0 } };
        CountNegativeNumber solution = new CountNegativeNumber();
        System.out.println(
                "Result For [[4,3,2,-1], [3,2,1,-1], [1,1,-1,-2], [-1,-1,-2,-3]] : " + solution.countNegatives(input1));
        System.out.println("Result For [[3,2], [1,0]] : " + solution.countNegatives(input2));
    }

}
