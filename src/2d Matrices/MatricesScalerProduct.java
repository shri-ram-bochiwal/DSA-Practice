
/**
 * You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
 */

import java.io.*;
import java.util.*;

public class MatricesScalerProduct {

    public int[][] solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int ans[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = A[i][j] * B;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int nmb1 = 2;
        int input2[][] = { { 1 } };
        int nmb2 = 5;
        MatricesScalerProduct matricesMultiplication = new MatricesScalerProduct();
        System.out.println("Result For [[1, 2, 3], [4, 5, 6], [7, 8, 9]] : "
                + Arrays.deepToString(matricesMultiplication.solve(input1, nmb1)));
        System.out.println("Result For [[1]] : " + Arrays.deepToString(matricesMultiplication.solve(input2, nmb2)));

    }
}
