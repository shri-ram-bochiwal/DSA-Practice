/**
 * You are given an m x n integer matrix matrix with the following two
 * properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the
 * previous row.
 * Given an integer target, return true if target is in matrix or false
 * otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 */

public class MatrixSearch {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        while (i < n) {
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target1 = 3;
        int input2[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target2 = 13;
        MatrixSearch solution = new MatrixSearch();
        System.out.println(
                "Result For [[1,3,5,7], [10,11,16,20], [23,30,34,60]] : " + solution.searchMatrix(input1, target1));
        System.out.println(
                "Result For [[1,3,5,7], [10,11,16,20], [23,30,34,60]] : " + solution.searchMatrix(input2, target2));
    }

}
