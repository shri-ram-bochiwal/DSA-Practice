
/**
 * Given a sorted array B of integers of size A, and a integer value C, return the ceiling of C which is present in array B.
 * Problem Constraints
 * 1 <= A <= 105,
 * -109 <= B[i] <= 109,
 * -109 <= C <= 109
 */

import java.util.*;

public class CeilingInSortedArray {

    public int solve(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        int ans = -1;
        Arrays.sort(A);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A[mid] == target) {
                return A[mid];
            } else if (A[mid] > target) {
                ans = A[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = { 2, 5, 6, 9, 18 };
        int target1 = 7;
        int input2[] = { 3, 7, 9, 11, 19, 20 };
        int target2 = 22;
        CeilingInSortedArray solution = new CeilingInSortedArray();
        System.out.println("Result For [2, 5, 6, 9, 18], target = 7 : " + solution.solve(input1, target1));
        System.out.println("Result For [3, 7, 9, 11, 19, 20], target = 22 : " + solution.solve(input2, target2));
    }

}