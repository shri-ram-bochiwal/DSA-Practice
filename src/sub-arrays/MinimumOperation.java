
/**
 * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. 
 * Note that this modifies the array for future operations.
 * Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
 */

import java.util.*;

public class MinimumOperation {

    public int minOperations(int[] nums, int x) {
        int targetSum = -x;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        for (int num : nums) {
            targetSum += num;
        }
        if (targetSum == 0) {
            return nums.length;
        }
        if (targetSum < 0) {
            return -1;
        }
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum > targetSum) {
                currentSum -= nums[left];
                left++;
            }
            if (currentSum == targetSum) {
                minLength = Math.min(minLength, nums.length - (right - left + 1));
            }
        }
        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 1, 4, 2, 3 };
        int x1 = 5;
        int input2[] = { 5, 6, 7, 8, 9 };
        int x2 = 4;
        int input3[] = { 3, 2, 20, 1, 1, 3 };
        int x3 = 10;
        MinimumOperation minNmbOperation = new MinimumOperation();
        System.out.println("Result For [1,1,4,2,3], x = 5 : " + minNmbOperation.minOperations(input1, x1));
        System.out.println("Result For [5,6,7,8,9], x = 4 : " + minNmbOperation.minOperations(input2, x2));
        System.out.println("Result For [3,2,20,1,1,3], x = 10 : " + minNmbOperation.minOperations(input3, x3));
    }

}
