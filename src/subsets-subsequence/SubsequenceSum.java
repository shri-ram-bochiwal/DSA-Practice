
/**
 * You are given an array of integers A of N size.
 * You have to find that there is any subsequence exists or not whose sum is equal to B.
 * Note: A subsequence is a sequence that can be derived from the given array by deleting zero or more elements without changing the order of the remaining elements.
 */

import java.util.*;

public class SubsequenceSum {

    public int solve(int[] A, int B) {
        int n = A.length;
        int tcs = (int) Math.pow(2, n);

        for (int i = 1; i < tcs; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i | (1 << j)) == i) {
                    sum += A[j];
                }
            }
            if (sum == B) {
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 20, 13, 4, 5 };
        int target1 = 18;
        int[] input2 = { 2, 2, 2, 2 };
        int target2 = 5;

        SubsequenceSum solution = new SubsequenceSum();
        System.out.println("Result For A = [1, 20, 13, 4, 5], B = 18 : " + solution.solve(input1, target1));
        System.out.println("Result For A = [2, 2, 2, 2], B = 5 : " + solution.solve(input2, target2));
    }

}
