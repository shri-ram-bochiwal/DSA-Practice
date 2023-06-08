
/**
 * You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
 * Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
 * The Following will give you an idea of matrix addition:
 */

import java.util.*;

public class AddMatrices {
    
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int ans[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = A[i][j] + B[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int inputA1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int inputB1[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
        int inputA2[][] = { { 1, 2, 3 }, { 4, 1, 2 }, { 7, 8, 9 } };
        int inputB2[][] = { { 9, 9, 7 }, { 1, 2, 4 }, { 4, 6, 3 } };
        AddMatrices additionMatrices = new AddMatrices();
        System.out.println("InputA1 : [[1, 2, 3], [4, 5, 6], [7, 8, 9]]");
        System.out.println("InputB1 : [[9, 8, 7], [6, 5, 4], [3, 2, 1]]");
        System.out.println(
                "Result For InputA1 + InputB1 : " + Arrays.deepToString(additionMatrices.solve(inputA1, inputB1)));
        System.out.println("InputA2 : [[1, 2, 3], [4, 1, 2], [7, 8, 9]]");
        System.out.println("InputB2 : [[9, 9, 7], [1, 2, 4], [4, 6, 3]]");
        System.out.println(
                "Result For InputA2 + InputB2 : " + Arrays.deepToString(additionMatrices.solve(inputA2, inputB2)));

    }
}
