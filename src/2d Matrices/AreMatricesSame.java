
/**
 * You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.
 * NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.
 */

import java.util.*;

public class AreMatricesSame {

    public int solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] != B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int inputA1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int inputB1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int inputA2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int inputB2[][] = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 } };
        AreMatricesSame sameMatrices = new AreMatricesSame();
        System.out.println("Result For InputA1 and InputB1 : " + sameMatrices.solve(inputA1, inputB1));
        System.out.println("Result For InputA2 and InputB2 : " + sameMatrices.solve(inputA2, inputB2));
    }
}
