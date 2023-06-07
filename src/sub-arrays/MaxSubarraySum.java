
/**
 * Given an array A, Find the maximum subarray sum out of all possible non-empty subarray.
 */

import java.util.*;

public class MaxSubarraySum {
    public long solve(int[] A) {
        long max = A[0];
        for (int s = 0; s < A.length; s++) {
            int sum = 0;
            for (int e = s; e < A.length; e++) {
                sum += A[e];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int input1[] = { 41, 36, -13, 14, -25 };
        int input2[] = { -2, 2, 34, -1, 16, 23, 12, 41, -7, -32 };
        MaxSubarraySum maxSubsum = new MaxSubarraySum();
        System.out.println("Result For [41, 36, -13, 14, -25] : " + maxSubsum.solve(input1));
        System.out.println("Result For [-2, 2, 34, -1, 16, 23, 12, 41, -7, -32] : " + maxSubsum.solve(input2));
    }
}
