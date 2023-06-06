
/**
 * Given an array of integers nums, calculate the pivot index of this array.
 *  The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */

import java.util.*;

public class PivotIndex {
    public int findPivotIndex(int[] nums) {
        int n = nums.length;
        int pfxSum[] = new int[n];
        pfxSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pfxSum[i] = pfxSum[i-1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            if (i > 0) {
                leftSum = pfxSum[i-1];
            }
            int rightSum = pfxSum[n-1] - pfxSum[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 7, 3, 6, 5, 6 };
        int input2[] = { 1, 2, 3 };
        int input3[] = { 2, 1, -1 };
        PivotIndex indexNmb = new PivotIndex();
        System.out.println("Result for [1,7,3,6,5,6] : " + indexNmb.findPivotIndex(input1));
        System.out.println("Result for [1,2,3] : " + indexNmb.findPivotIndex(input2));
        System.out.println("Result for [2,1,-1] : " + indexNmb.findPivotIndex(input3));
    }
}
