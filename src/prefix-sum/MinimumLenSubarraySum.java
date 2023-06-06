
/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
 * subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */

import java.util.*;

public class MinimumLenSubarraySum {

    public int minSubArrayLen(int[] nums, int target){
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                ans = Math.min(ans, i+1-index);
                sum = sum-nums[index];
                index++;
            }
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = { 2, 3, 1, 2, 4, 3 };
        int target1 = 7;
        int input2[] = { 1, 4, 4 };
        int target2 = 4;
        int input3[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int target3 = 11;
        MinimumLenSubarraySum lenSubarraySum = new MinimumLenSubarraySum();
        System.out.println("Result for {2,3,1,2,4,3} : " + lenSubarraySum.minSubArrayLen(input1, target1));
        System.out.println("Result for {1,4,4} : " + lenSubarraySum.minSubArrayLen(input2, target2));
        System.out.println("Result for {1,1,1,1,1,1,1,1} : " + lenSubarraySum.minSubArrayLen(input3, target3));
    }

}
