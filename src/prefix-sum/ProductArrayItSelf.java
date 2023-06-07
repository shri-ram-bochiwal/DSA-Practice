
/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */

import java.util.*;

public class ProductArrayItSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int productBefore = 1;
        int productAfter = 1;
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = productBefore;
            productBefore *= nums[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= productAfter;
            productAfter *= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 4 };
        int input2[] = { -1, 1, 0, -3, 3 };
        ProductArrayItSelf productArray = new ProductArrayItSelf();
        System.out.println("Result For [1,2,3,4] : " + Arrays.toString(productArray.productExceptSelf(input1)));
        System.out.println("Result For [-1,1,0,-3,3] : " + Arrays.toString(productArray.productExceptSelf(input2)));
    }

}
