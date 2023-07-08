
/**
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 * For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 * Given an array of integers nums, find the next permutation of nums.
 * The replacement must be in place and use only constant extra memory
 */

import java.util.*;

public class NextPermutation {

    public void solve(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int swp = nums[left];
            nums[left] = nums[right];
            nums[right] = swp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3 };
        int input2[] = { 3, 2, 1 };
        int input3[] = { 1, 1, 5 };
        NextPermutation solution = new NextPermutation();
        solution.solve(input1);
        System.out.println("Result For [1,2,3] : " + Arrays.toString(input1));
        solution.solve(input2);
        System.out.println("Result For [3,2,1] : " + Arrays.toString(input2));
        solution.solve(input3);
        System.out.println("Result For [1,1,5] : " + Arrays.toString(input3));
    }

}
