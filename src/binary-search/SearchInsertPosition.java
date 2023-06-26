/**
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 */

public class SearchInsertPosition {

    public int searchInsert(int nums[], int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 3, 5, 6 };
        int target1 = 5;
        int input2[] = { 1, 3, 5, 6 };
        int target2 = 2;
        int input3[] = { 1, 3, 5, 6 };
        int target3 = 7;
        SearchInsertPosition solution = new SearchInsertPosition();
        System.out.println("Result For [1,3,5,6], target = 5 : " + solution.searchInsert(input1, target1));
        System.out.println("Result For [1,3,5,6], target = 2 : " + solution.searchInsert(input2, target2));
        System.out.println("Result For [1,3,5,6], target = 7 : " + solution.searchInsert(input3, target3));
    }

}
