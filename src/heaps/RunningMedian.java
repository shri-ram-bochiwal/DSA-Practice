
/**
 * Given an array of integers, A denoting a stream of integers. New arrays of integer B and C are formed.
 * Each time an integer is encountered in a stream, append it at the end of B and append the median of array B at the C.
 * Find and return the array C.
 * NOTE:
 * If the number of elements is N in B and N is odd, then consider the median as B[N/2] ( B must be in sorted order).
 * If the number of elements is N in B and N is even, then consider the median as B[N/2-1]. ( B must be in sorted order).
 */

import java.util.*;

public class RunningMedian {

    public int[] solve(int[] A) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (left.size() == right.size()) {
                right.add(A[i]);
                int remove = right.remove();
                left.add(remove);
                result[i] = left.peek();
            } else {
                left.add(A[i]);
                int remove = left.remove();
                right.add(remove);
                result[i] = left.peek();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 2, 5, 4, 3 };
        int[] input2 = { 5, 17, 100, 11 };

        RunningMedian solutionMedian = new RunningMedian();

        System.out.println("Result For [1, 2, 5, 4, 3] : " + Arrays.toString(solutionMedian.solve(input1)));
        System.out.println("Result For [5, 17, 100, 11] : " + Arrays.toString(solutionMedian.solve(input2)));
    }

}
