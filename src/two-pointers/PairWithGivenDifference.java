
/**
 * Given an one-dimensional integer array A of size N and an integer B.
 * Count all distinct pairs with difference equal to B.
 * Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.
*/

import java.util.*;

public class PairWithGivenDifference {

    public int pairDifference(int[] A, int B) {
        Arrays.sort(A);
        int i = 0;
        int j = 1;
        int count = 0;

        while (j < A.length) {
            int difference = A[j] - A[i];
            if (i == j) {
                j++;
            } else if (difference == B) {
                count++;
                j++;

                while (j < A.length && A[j] == A[j - 1]) {
                    j++;
                }
            } else if (difference > B) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 5, 3, 4, 2 };
        int target1 = 3;

        int[] input2 = { 8, 12, 16, 4, 0, 20 };
        int target2 = 4;

        int[] input3 = { 1, 1, 1, 2, 2 };
        int target3 = 0;

        PairWithGivenDifference solution = new PairWithGivenDifference();
        System.out.println("Result For A = [1, 5, 3, 4, 2], B = 3 : " + solution.pairDifference(input1, target1));
        System.out.println("Result For A = [8, 12, 16, 4, 0, 20], B = 4 : " + solution.pairDifference(input2, target2));
        System.out.println("Result For A = [1, 1, 1, 2, 2], B = 0 : " + solution.pairDifference(input3, target3));
    }

}
