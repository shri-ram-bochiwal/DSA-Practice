
/**
 * Given an integer array nums of unique elements, return all possible subsets(the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */

import java.util.*;

public class Subsets {

    public List<List<Integer>> solve(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int tcs = (int) Math.pow(2, n);
        for (int i = 0; i < tcs; i++) {
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    ans.add(nums[j]);
                }
            }
            result.add(ans);
        }
        return result;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3 };
        int input2[] = { 0 };
        Subsets printSubset = new Subsets();
        List<List<Integer>> subsets1 = printSubset.solve(input1);
        System.out.println("Result For [1, 2, 3]: " + subsets1);

        List<List<Integer>> subsets2 = printSubset.solve(input2);
        System.out.println("Result For [0]: " + subsets2);
    }

}
