
/**
 * Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.
 */

import java.util.*;

public class ValidTraingle {

    public int traingleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int k = nums.length - 1; k >= 0; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += j - i;
                    j--;
                }
                else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int input1[] = { 2, 2, 3, 4 };
        int input2[] = { 4, 2, 3, 4 };
        ValidTraingle solution = new ValidTraingle();
        System.out.println("Result For [2,2,3,4] : " + solution.traingleNumber(input1));
        System.out.println("Result For [4,2,3,4] : " + solution.traingleNumber(input2));
    }

}
