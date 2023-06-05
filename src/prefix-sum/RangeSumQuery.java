/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */

import java.util.*;

public class RangeSumQuery {

    public long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        long prefixSumArray[] = new long[n];
        prefixSumArray[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + A[i];
        }
        int m = B.length;
        long ans[] = new long[m];
        for (int i = 0; i < m; i++) {
            int left = B[i][0];
            int right = B[i][1];
            if (left == 0) {
                ans[i] = prefixSumArray[right];
            } else {
                ans[i] = prefixSumArray[right] - prefixSumArray[left - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int input1[] = new int[] { 1, 2, 3, 4, 5 };
        int query1[][] = new int[][] { { 0, 3 }, { 1, 2 } };
        int input2[] = new int[] { 2, 2, 2 };
        int query2[][] = new int[][] { { 0, 0 }, { 1, 2 } };
        RangeSumQuery sumQuery = new RangeSumQuery();
        System.out.print("Result for input1 : " + Arrays.toString(sumQuery.rangeSum(input1, query1)));
        System.out.print("Result for input2 : " + Arrays.toString(sumQuery.rangeSum(input2, query2)));

    }
}