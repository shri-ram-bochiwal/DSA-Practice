
/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * You must solve it in O(n) time complexity.
 */

import java.util.*;

public class KLargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int index = nums.length - k;
        return nums[index];
    }

    public static void main(String[] args) {
        int input1[] = { 3, 2, 1, 5, 6, 4 };
        int target1 = 2;
        int input2[] = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int target2 = 4;
        KLargestElementInArray solution = new KLargestElementInArray();
        System.out.println("Result For [3,2,1,5,6,4], k = 2 : " + solution.findKthLargest(input1, target1));
        System.out.println("Result For [3,2,3,1,2,4,5,5,6], k = 4 : " + solution.findKthLargest(input2, target2));
    }

}
