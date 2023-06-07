
/**
 * Given an integer array A of length N. Print array of numbers in which each element is sum of a subarray.
 */

import java.util.*;

public class SubArraySum {

    public static void printSubArraysSum(int[] A) {

        for (int s = 0; s < A.length; s++) {
            for (int e = s; e < A.length; e++) {
                int sum = 0;
                for (int k = s; k <= e; k++) {
                    sum += A[k];
                }
                System.out.print(sum + " ");
            }
        }

    }

    public static void main(String[] args){
        int input1[] = {11, 12, 6};
        int input2[] = {10, 27, 12, 25, 24};
        System.out.println("Result For [11, 12, 6] : ");
        printSubArraysSum(input1);
        System.out.println("Result For [10, 27, 12, 25, 24] : ");
        printSubArraysSum(input2);
    }
    
}
