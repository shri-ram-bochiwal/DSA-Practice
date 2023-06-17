
/**
 * Given a 2D array A of integer points on a 2D plane. Find and return the number of unique points in the array.
 * The ith point in the array is (A[i][0], A[i][1])
 */

import java.util.*;

public class UniquePoints {

    public int findUniquePoints(int[][] A) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i][0] + "," + A[i][1]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 1 }, { 2, 2 }, { 2, 2 }, { 1, 1 }, { 1, 1 } };
        int input2[][] = { { 5, 6 }, { 2, 8 }, { -1, -1 }, { 2, -3 }, { 2, 8 }, { 7, 7 }, { 2, -3 } };
        UniquePoints solution = new UniquePoints();
        System.out
                .println("Result For [[1, 1], [2, 2], [2, 2], [1, 1], [1, 1]] : " + solution.findUniquePoints(input1));
        System.out.println("Result For [[5, 6], [2, 8], [-1, -1], [2, -3], [2, 8], [7, 7], [2, -3]] : "
                + solution.findUniquePoints(input2));
    }

}
