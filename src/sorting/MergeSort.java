
/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n
 */

import java.util.*;

public class MergeSort {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m;

        for (int i = 0; i < n; i++) {
            nums1[k] = nums2[i];
            k++;
        }

        Arrays.sort(nums1);

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 0, 0, 0 };
        int size1 = 3;
        int input2[] = { 2, 5, 6 };
        int size2 = 3;
        int input3[] = { 1 };
        int size3 = 1;
        int input4[] = {0};
        int size4 = 0;
        int input5[] = {0};
        int size5 = 0;
        int input6[] = { 1 };
        int size6 = 1;

        MergeSort solution = new MergeSort();

        System.out.println("Result For nums1 = [1, 2, 3, 0, 0, 0], m = 3, nums2 = [2, 5, 6], n = 3 : ");
        solution.merge(input1, size1, input2, size2);
        System.out.println();
        System.out.println("Result For nums1 = [1], m = 1, nums2 = [0], n = 0 : ");
        solution.merge(input3, size3, input4, size4);
        System.out.println();
        System.out.println("Result For nums1 = [0], m = 0, nums2 = [1], n = 1 : ");
        solution.merge(input5, size5, input6, size6);
    }

}
