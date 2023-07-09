
/**
 * Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. Return the sum of those three integers.
 * Assume that there will only be one solution.
 */

import java.util.*;

public class ThreeSum {

    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int closestSum = A[0] + A[1] + A[2];
        for (int i = 0; i < A.length - 2; i++) {
            int left = i + 1;
            int right = A.length - 1;
            while (left < right) {
                int currentSum = A[i] + A[left] + A[right];
                if (currentSum == B) {
                    return currentSum;
                }
                if (Math.abs(B - currentSum) < Math.abs(B - closestSum)) {
                    closestSum = currentSum;
                }
                if (currentSum < B) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int input1[] = { -1, 2, 1, -4 };
        int target1 = 1;
        int input2[] = { 1, 2, 3 };
        int target2 = 6;
        ThreeSum solution = new ThreeSum();
        System.out.println("Result For [-1, 2, 1, -4], target = 1 : " + solution.threeSumClosest(input1, target1));
        System.out.println("Result For [1, 2, 3], target = 2 : " + solution.threeSumClosest(input2, target2));
    }

}
