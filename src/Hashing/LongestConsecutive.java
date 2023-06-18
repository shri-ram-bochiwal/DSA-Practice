
/**
 * Given an unsorted integer array A of size N.
 * Find the length of the longest set of consecutive elements from array A.
 */

import java.util.*;

public class LongestConsecutive {

    public int findLongestConsecutiveSequence(int[] A) {
        Arrays.sort(A);
        int maxLen = 0;
        int currentLen = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1] + 1) {
                currentLen++;
            } else if (A[i] != A[i - 1]) {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }
        maxLen = Math.max(maxLen, currentLen);
        return maxLen;
    }

    public static void main(String[] args) {
        int input1[] = { 100, 4, 200, 1, 3, 2 };
        int input2[] = { 2, 1 };
        LongestConsecutive solution = new LongestConsecutive();
        System.out.println("Result For [100, 4, 200, 1, 3, 2] : " + solution.findLongestConsecutiveSequence(input1));
        System.out.println("Result For [2, 1] : " + solution.findLongestConsecutiveSequence(input2));
    }

}
