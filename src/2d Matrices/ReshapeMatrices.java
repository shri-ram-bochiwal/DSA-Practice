
/**
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
 * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 */

import java.util.*;

public class ReshapeMatrices {
    public int[][] matricseReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat.length;
        if (n * m != r * c) {
            return mat;
        }
        int result[][] = new int[r][c];
        int row = 0;
        int colum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[row][colum] = mat[i][j];
                colum++;
                if (colum == c) {
                    row++;
                    colum = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 2 }, { 3, 4 } };
        int row1 = 1;
        int col1 = 4;
        int input2[][] = { { 1, 2 }, { 3, 4 } };
        int row2 = 2;
        int col2 = 4;
        ReshapeMatrices reshapeMat = new ReshapeMatrices();
        System.out.println("Input For [[1,2], [3,4]], row = 1, col = 4 : "
                + Arrays.deepToString(reshapeMat.matricseReshape(input1, row1, col1)));
        System.out.println("Input For [[1,2], [3,4]], row = 2, col = 4 : "
                + Arrays.deepToString(reshapeMat.matricseReshape(input2, row2, col2)));

    }
}
