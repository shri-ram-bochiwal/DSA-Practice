
/**
 * Given an array of integers A, sort the array into a wave-like array and return it.
 * In other words, arrange the elements into a sequence such that
 * a1 >= a2 <= a3 >= a4 <= a5..... 
 * NOTE: If multiple answers are possible, return the lexicographically smallest one.
 */

import java.util.*;

public class WaveArray {

    public int[] wave(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i < A.length; i = i+2) {
            int temp = A[i];
            A[i] = A[i - 1];
            A[i - 1] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 4 };
        int input2[] = { 1, 2 };
        WaveArray solution = new WaveArray();
        System.out.println("Result For [1, 2, 3, 4] : " + Arrays.toString(solution.wave(input1)));
        System.out.println("Result For [1, 2] : " + Arrays.toString(solution.wave(input2)));
    }

}
