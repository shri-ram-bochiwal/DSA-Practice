
/**
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums
 */

import java.util.*;

public class DegreeOfArray {

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> Frequency = new HashMap<>();
        HashMap<Integer, Integer> FirstOccurence = new HashMap<>();
        int maxLen = 0;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Frequency.put(num, Frequency.getOrDefault(num, 0) + 1);
            FirstOccurence.putIfAbsent(num, i);

            int freq = Frequency.get(num);

            if (freq > maxLen) {
                maxLen = freq;
                minLen = i - FirstOccurence.get(num) + 1;
            } else if (freq == maxLen) {
                minLen = Math.min(minLen, i - FirstOccurence.get(num) + 1);
            }
        }
        return minLen;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 2, 3, 1 };
        int input2[] = { 1, 2, 2, 3, 1, 4, 2 };
        DegreeOfArray solution = new DegreeOfArray();
        System.out.println("Result For [1,2,2,3,1] : " + solution.findShortestSubArray(input1));
        System.out.println("Result For [1,2,2,3,1,4,2] : " + solution.findShortestSubArray(input2));
    }

}
