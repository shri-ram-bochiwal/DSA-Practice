
/**
 * Given an integer array nums and an integer k, modify the array in the following way:
 * choose an index i and replace nums[i] with -nums[i].
 * You should apply this process exactly k times. You may choose the same index i multiple times.
 * Return the largest possible sum of the array after modifying it in this way.
 */

import java.util.*;

public class MaxSumOfArrayKNegations {

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while (k > 0 && i < nums.length && nums[i] < 0) {
            nums[i] = -nums[i];
            k--;
            i++;
        }

        Arrays.sort(nums);
        if (k % 2 != 0) {
            nums[0] = -nums[0];
        }

        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
        }

        return sum;
    }

    public static void main(String[] args) {
        int input1[] = { 4, 2, 3 };
        int target1 = 1;
        int input2[] = { 3, -1, 0, 2 };
        int target2 = 3;
        int input3[] = { 2, -3, -1, 5, -4 };
        int target3 = 2;
        MaxSumOfArrayKNegations solution = new MaxSumOfArrayKNegations();
        System.out.println("Result For [4,2,3], k = 1 : " + solution.largestSumAfterKNegations(input1, target1));
        System.out.println("Result For [3,-1,0,2], k = 3 : " + solution.largestSumAfterKNegations(input2, target2));
        System.out.println("Result For [2,-3,-1,5,-4], k = 2 : " + solution.largestSumAfterKNegations(input3, target3));
    }

}
