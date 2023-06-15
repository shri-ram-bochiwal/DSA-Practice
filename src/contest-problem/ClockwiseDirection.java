
/**
 * Given a rectangular matrix A of N*M dimension. Return its boundary in clockwise direction.
 */

import java.util.*;

public class ClockwiseDirection {

    public int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int length = (m - 1) + (n - 1) + (m - 1) + (n - 1);
        int ans[] = new int[length];
        int k = 0, i = 0, j = 0;
        for (int c = 1; c <= m - 1; c++) {
            ans[k] = A[i][j];
            j++;
            k++;
        }
        for (int c = 1; c <= n - 1; c++) {
            ans[k] = A[i][j];
            i++;
            k++;
        }
        for (int c = 1; c <= m - 1; c++) {
            ans[k] = A[i][j];
            j--;
            k++;
        }
        for (int c = 1; c <= n - 1; c++) {
            ans[k] = A[i][j];
            i--;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int input2[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 1 }, { 1, 3, 4, 6, 2 } };
        ClockwiseDirection solution = new ClockwiseDirection();
        System.out.println("Result For [[1, 2, 3], [4, 5, 6], [7, 8, 9]] : " + Arrays.toString(solution.solve(input1)));
        System.out.println("Result For [[1, 2, 3, 4, 5], [6, 7, 8, 9, 1], [1, 3, 4, 6, 2]] : "
                + Arrays.toString(solution.solve(input2)));
    }

}
