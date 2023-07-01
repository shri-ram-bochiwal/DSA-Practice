
/**
 * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
 * The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 */

import java.util.*;

public class DistanceBetweenTwoArrays {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int i = 0;
        int j = 0;
        int ans = arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while (i < arr1.length && j < arr2.length) {
            int dist = Math.abs(arr1[i] - arr2[j]);
            if (dist <= d) {
                i++;
                ans--;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = { 4, 5, 8 };
        int input2[] = { 10, 9, 1, 8 };
        int distance1 = 2;
        int input3[] = { 1, 4, 2, 3 };
        int input4[] = { -4, -3, 6, 10, 20, 30 };
        int distance2 = 3;
        int input5[] = { 2, 1, 100, 3 };
        int input6[] = { -5, -2, 10, -3, 7 };
        int distance3 = 6;
        DistanceBetweenTwoArrays solution = new DistanceBetweenTwoArrays();
        System.out.println("Result For nums1 = [4,5,8], nums2 = [10,9,1,8], d = 2 : "
                + solution.findTheDistanceValue(input1, input2, distance1));
        System.out.println("Result For nums1 = [1,4,2,3], nums2 = [-4,-3,6,10,20,30], d = 3 : "
                + solution.findTheDistanceValue(input3, input4, distance2));
        System.out.println("Result For nums1 = [2,1,100,3], nums2 = [-5,-2,10,-3,7], d = 6 : "
                + solution.findTheDistanceValue(input5, input6, distance3));
    }

}