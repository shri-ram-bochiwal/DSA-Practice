/**
 * Check if a given array is sorted or not.
 */

public class IsSorted {

    public boolean isSortedOrNot(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }
        if (nums[i] > nums[i + 1]) {
            return false;
        }

        return isSortedOrNot(nums, i + 1);
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 4, 5 };
        int input2[] = { 1, 2, 5, 4 };
        int input3[] = { 5, 5, 5 };
        IsSorted solution = new IsSorted();
        System.out.println("Result For [1, 2, 3, 4, 5] : " + solution.isSortedOrNot(input1, 0));
        System.out.println("Result For [1, 2, 5, 4] : " + solution.isSortedOrNot(input2, 0));
        System.out.println("Result For [5, 5, 5] : " + solution.isSortedOrNot(input3, 0));
    }

}
