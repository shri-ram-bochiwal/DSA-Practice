
/**
 * Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
 * You must write an algorithm that runs in O(n) time and uses only constant extra space.
 */

import java.util.*;

public class DuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans.add(nums[i]);
            } else { 
                map.put(nums[i], 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int input2[] = { 1, 1, 2 };
        int input3[] = { 1 };
        DuplicatesInArray solution = new DuplicatesInArray();
        System.out.println("Result For [4,3,2,7,8,2,3,1] : " + solution.findDuplicates(input1));
        System.out.println("Result For [1,1,2] : " + solution.findDuplicates(input2));
        System.out.println("Result For [1] : " + solution.findDuplicates(input3));
    }

}
