/**
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in non-decreasing order.
 * Find and return the position of B in the matrix in the given form:
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 * Note 1: Rows are numbered from top to bottom and columns are numbered from
 * left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009
 * +j such that A[i][j]=B.
 * Note 3: Expected time complexity is linear
 * Note 4: Use 1-based indexing
 */

public class SearchMatrices {

    public int searchInRowColumWiseSortedMat(int[][] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == B) {
                    return (i + 1) * 1009 + (j + 1);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int position1 = 2;
        int input2[][] = { { 1, 2 }, { 3, 3 } };
        int position2 = 3;
        SearchMatrices searchRowColumMatrices = new SearchMatrices();
        System.out.println("Result For [[1, 2, 3], [4, 5, 6], [7, 8, 9]], Pos = 2 : "
                + searchRowColumMatrices.searchInRowColumWiseSortedMat(input1, position1));
        System.out.println("Result For [[1, 2], [3, 3]],  Pos = 3: "
                + searchRowColumMatrices.searchInRowColumWiseSortedMat(input2, position2));
    }

}
