
/**
 * Given an array of integers A and an integer B.
 * Find the total number of subarrays having sum equals to B.
 */

import java.util.*;

public class SubarraySumEqualsK {

    public int solve(int[] A, int B) {
        int ps[] = new int[A.length];
        ps[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            ps[i] = ps[i - 1] + A[i];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (hm.containsKey(ps[i] - B)) {
                count = count + hm.get(ps[i] - B);
            }
            if (ps[i] == B) {
                count++;
            }
            if (hm.containsKey(ps[i])) {
                hm.put(ps[i], hm.get(ps[i]) + 1);
            } else {
                hm.put(ps[i], 1);
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int input1[] = { 1, 0, 1 };
        int input2 = 1;
        int input3[] = { 0, 0, 0 };
        int input4 = 0;
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        System.out.println("Result For [1, 0, 1], Target = 1 : " + solution.solve(input1, input2));
        System.out.println("Result For [0, 0, 0], Target = 0 : " + solution.solve(input3, input4));
    }

}