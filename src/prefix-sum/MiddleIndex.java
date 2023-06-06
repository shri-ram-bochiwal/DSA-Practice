
/**
 * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
*/

import java.util.*;

public class MiddleIndex {

    public int findMiddleIndex(int[] nums) {
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            if (i > 0) {
                leftSum = prefixSum[i - 1];
            }
            int rightSum = prefixSum[nums.length - 1] - prefixSum[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input1[] = { 2, 3, -1, 8, 4 };
        int input2[] = { 1, -1, 4 };
        int input3[] = { 2, 5 };
        MiddleIndex midIndx = new MiddleIndex();
        System.out.println("Result For [2,3,-1,8,4] : " + midIndx.findMiddleIndex(input1));
        System.out.println("Result For [1,-1,4] : " + midIndx.findMiddleIndex(input2));
        System.out.println("Result For [2,5] : " + midIndx.findMiddleIndex(input3));

    }

}
