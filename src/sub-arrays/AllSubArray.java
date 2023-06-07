
/**
 * Given an integer array A. Print all possible subarray.
 */

import java.util.*;

public class AllSubArray {

    public static void printAllSubarrays(int A[]) {
        for (int s = 0; s < A.length; s++) {
            for (int e = s; e < A.length; e++) {
                for (int k = s; k <= e; k++) {
                    System.out.print(A[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int input1[] = { 6, 7, 1 };
        int input2[] = { 18, 14, 10, 14 };
        System.out.println("Result For [6, 7, 1] : ");
        printAllSubarrays(input1);
        System.out.println("Result For [18, 14, 10, 14] : ");
        printAllSubarrays(input2);
    }

}