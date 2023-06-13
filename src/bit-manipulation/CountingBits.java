
/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
 * ans[i] is the number of 1's in the binary representation of i.
 */

import java.util.*;

public class CountingBits {

    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        ans[0] = 0;
        int j = 1;
        for (int i = 1; i < ans.length; i++) {
            int count = 0;
            n = j;
            while (n != 0) {
                if ((n & 1) == 1) {
                    count++;
                }
                n = n >> 1;
            }
            ans[i] = count;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 5;
        CountingBits bitOperation = new CountingBits();
        System.out.println("Result For 2 : " + Arrays.toString(bitOperation.countBits(input1)));
        System.out.println("Result For 1 : " + Arrays.toString(bitOperation.countBits(input2)));
    }

}
