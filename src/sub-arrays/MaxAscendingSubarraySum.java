
/**
 * Given an array of positive integers nums, return the maximum possible sum of
 * an ascending subarray in nums.
 * A subarray is defined as a contiguous sequence of numbers in an array.
 * A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i
 * where l <= i < r, numsi < numsi+1.
 * Note that a subarray of size 1 is ascending.
 */

import java.util.*;

public class MaxAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                result = Math.max(result, sum);
                sum = nums[i];
            }
        }
        result = Math.max(result, sum);
        return result;
    }

    public static void main(String[] args) {
        int input1[] = { 10, 20, 30, 5, 10, 50 };
        int input2[] = { 10, 20, 30, 40, 50 };
        int input3[] = { 12, 17, 15, 13, 10, 11, 12 };
        MaxAscendingSubarraySum maximumSum = new MaxAscendingSubarraySum();
        System.out.println("Result For [10,20,30,5,10,50] : " + maximumSum.maxAscendingSum(input1));
        System.out.println("Result For [10,20,30,40,50] : " + maximumSum.maxAscendingSum(input2));
        System.out.println("Result For [12,17,15,13,10,11,12] : " + maximumSum.maxAscendingSum(input3));
    }

}
