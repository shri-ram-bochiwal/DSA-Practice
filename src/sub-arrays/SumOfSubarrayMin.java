
/**
 * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. 
 * Since the answer may be large, return the answer modulo 109 + 7.
 */

import java.util.*;

public class SumOfSubarrayMin {

    public int sumSubarrayMins(int[] arr) {
        int minSum = 0;
        int mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                }
                minSum += min;
                minSum %= mod;
            }
        }
        return minSum;
    }

    public static void main(String[] args) {
        int input1[] = { 3, 1, 2, 4 };
        int input2[] = { 11, 81, 94, 43, 3 };
        SumOfSubarrayMin subarrayMins = new SumOfSubarrayMin();
        System.out.println("Result For [3,1,2,4] : " + subarrayMins.sumSubarrayMins(input1));
        System.out.println("Result For [11,81,94,43,3] : " + subarrayMins.sumSubarrayMins(input2));
    }

}
