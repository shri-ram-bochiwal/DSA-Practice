
/**
 * Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
 * Return the number of nice sub-arrays.
 */

import java.util.*;

public class CountNumberSubarray {

    public int numberOfSubarray(int[] nums, int k) {
        int start = 0, end = 0;
        int odd = 0, oddCount = 0, ans = 0;
        while (start < nums.length) {
            if (nums[start] % 2 != 0) {
                odd++;
                oddCount = 0;
            }
            while (odd == k) {
                if (nums[end] % 2 != 0) {
                    odd--;
                }
                oddCount += 1;
                end++;
            }
            ans += oddCount;
            start++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 1, 2, 1, 1 };
        int k1 = 3;
        int input2[] = { 2, 4, 6 };
        int k2 = 1;
        int input3[] = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
        int k3 = 2;
        CountNumberSubarray oddCountSubarray = new CountNumberSubarray();
        System.out.println("Result For [1,1,2,1,1], K = 3 : " + oddCountSubarray.numberOfSubarray(input1, k1));
        System.out.println("Result For [2,4,6], K = 1 : " + oddCountSubarray.numberOfSubarray(input2, k2));
        System.out
                .println("Result For [2,2,2,1,2,2,1,2,2,2], K = 2 : " + oddCountSubarray.numberOfSubarray(input3, k3));
    }

}
