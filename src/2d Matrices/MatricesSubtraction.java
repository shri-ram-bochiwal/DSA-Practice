/**
 * You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).
 * If A and B are two matrices of the same order (same dimensions). 
 * Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.
 */

import java.util.*;


public class MatricesSubtraction {

    public int[][] solve(int[][] A, int[][] B){
        int n = A.length;
        int m = A[0].length;
        int ans[][] = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ans[i][j] = A[i][j] - B[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int inputA1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int inputB1[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int inputA2[][] = {{1, 1}};
        int inputB2[][] = {{2, 3}};
        MatricesSubtraction subMatrices = new MatricesSubtraction();
        System.out.println("InputA1 [[1, 2, 3], [4, 5, 6], [7, 8, 9]] ");
        System.out.println("InputB1 [[9, 8, 7], [6, 5, 4], [3, 2, 1]] ");
        System.out.println("Result For InputA1 And InputB1 : " + Arrays.deepToString(subMatrices.solve(inputA1, inputB1)));
        System.out.println("InputA2 [[1, 1]] ");
        System.out.println("InputB1 [[2, 3]] ");
        System.out.println("Result For InputA2 And InputB2 : " + Arrays.deepToString(subMatrices.solve(inputA2, inputB2)));

    }
    
}
