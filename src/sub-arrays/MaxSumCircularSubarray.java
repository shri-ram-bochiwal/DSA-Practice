
/**
 * Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
 * A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
 * A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.
 */

import java.util.*;

public class MaxSumCircularSubarray {

    public int maxSumSubarray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public int maxSubarraySumCircular(int[] nums) {
        int maxSubarraySum = maxSumSubarray(nums);

        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }

        int circularSubarraySum = totalSum + maxSumSubarray(nums);

        if (circularSubarraySum == 0) {
            return maxSubarraySum;
        }

        return Math.max(maxSubarraySum, circularSubarraySum);
    }

    public static void main(String[] args) {
        int input1[] = { 1, -2, 3, -2 };
        int input2[] = { 5, -3, 5 };
        int input3[] = { -3, -2, -3 };
        MaxSumCircularSubarray solution = new MaxSumCircularSubarray();
        System.out.println("Result For [1,-2,3,-2] : " + solution.maxSubarraySumCircular(input1));
        System.out.println("Result For [5,-3,5] : " + solution.maxSubarraySumCircular(input2));
        System.out.println("Result For [-3,-2,-3] : " + solution.maxSubarraySumCircular(input3));
    }

}
