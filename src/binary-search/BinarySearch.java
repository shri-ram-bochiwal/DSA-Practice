/**
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class BinarySearch {

    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input1[] = { -1, 0, 3, 5, 9, 12 };
        int target1 = 9;
        int input2[] = { -1, 0, 3, 5, 9, 12 };
        int target2 = 2;
        BinarySearch solution = new BinarySearch();
        System.out.println("Result For [-1,0,3,5,9,12], target = 9 : " + solution.search(input1, target1));
        System.out.println("Result For [-1,0,3,5,9,12], target = 2 : " + solution.search(input2, target2));
    }

}
