
/**
 * Given two integer arrays A and B of size N each which represent values and weights associated with N items respectively.
 * Also given an integer C which represents knapsack capacity.
 * Find out the maximum total value that we can fit in the knapsack. If the maximum total value is ans, then return ⌊ans × 100⌋ , i.e., floor of (ans × 100).
 * NOTE:
 * You can break an item for maximizing the total value of the knapsack
 */

import java.util.*;

public class FractionalKnapsack {

    public class Pair {
        int val;
        int wt;
        double vpk;

        public Pair(int val, int wt) {
            this.val = val;
            this.wt = wt;
            this.vpk = (double) this.val / this.wt;
        }
    }

    public int solve(int[] A, int[] B, int C) {
        int n = A.length;
        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(A[i], B[i]);
        }

        Arrays.sort(arr, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if (a.vpk < b.vpk) {
                    return -1;
                }
                if (a.vpk > b.vpk) {
                    return 1;
                }
                return 0;
            }
        });

        double ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            Pair p = arr[i];

            if (p.wt <= C) {
                ans += p.val;
                C = C - p.wt;
            } else {
                ans += (C * p.vpk);
                C = 0;
                break;
            }
        }

        return (int) (ans * 1000) / 10;
    }

    public static void main(String[] args) {
        int[] input1 = { 60, 100, 120 };
        int[] input2 = { 10, 20, 30 };
        int target1 = 50;

        int[] input3 = { 10, 20, 30, 40 };
        int[] input4 = { 12, 13, 15, 19 };
        int target2 = 10;

        FractionalKnapsack solution = new FractionalKnapsack();
        System.out.println("Result For : " + solution.solve(input1, input2, target1));
        System.out.println("Result For : " + solution.solve(input3, input4, target2));
    }

}