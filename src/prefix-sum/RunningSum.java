
/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */

import java.util.*;

public class RunningSum {
    public int[] runningSumOf1dArray(int[] nums) {
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 4 };
        int input2[] = { 1, 1, 1, 1, 1 };
        int input3[] = { 3, 1, 2, 10, 1 };
        RunningSum runningSumArray = new RunningSum();
        System.out.println("Result For [1,2,3,4] : " + Arrays.toString(runningSumArray.runningSumOf1dArray(input1)));
        System.out.println("Result For [1,1,1,1,1] : " + Arrays.toString(runningSumArray.runningSumOf1dArray(input2)));
        System.out.println("Result For [3,1,2,10,1] : " + Arrays.toString(runningSumArray.runningSumOf1dArray(input3)));

    }

}
