
/**
 * You are given an array A of integers that represent the lengths of ropes.
 * You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.
 * Find and return the minimum cost to connect these ropes into one rope.
 */

import java.util.*;

public class ConnectRopes {

    public int minCost(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < A.length; i++) {
            pq.add(A[i]);
        }

        int cost = 0;
        while (pq.size() > 0) {
            int minRem1 = pq.remove();
            int minRem2 = pq.remove();

            int sum = minRem1 + minRem2;
            cost += sum;

            if (pq.size() != 0) {
                pq.add(sum);
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 2, 3, 4, 5 };
        int[] input2 = { 5, 17, 100, 11 };

        ConnectRopes solution = new ConnectRopes();
        System.out.println("Result For [1, 2, 3, 4, 5] : " + solution.minCost(input1));
        System.out.println("Result For [5, 17, 100, 11] : " + solution.minCost(input2));
    }

}