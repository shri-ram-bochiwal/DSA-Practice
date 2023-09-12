
/**
 * There are a total of A courses you have to take, labeled from 1 to A.
 * Some courses may have prerequisites, for example to take course 2 you have to first take course 1, which is expressed as a pair: [1,2].
 * So you are given two integer array B and C of same size where for each i (B[i], C[i]) denotes a pair.
 * Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
 * Return 1 if it is possible to finish all the courses, or 0 if it is not possible to finish all the courses.
 */

import java.util.*;

public class PossibilityOfFinishing {
    
    public int checkPossibilityOfFinishing(int A, int[] B, int[] C) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= A; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < B.length; i++) {
            int u = B[i];
            int v = C[i];

            graph.get(u).add(v);
        }

        int[] indegree = new int[A + 1];
        for (int i = 0; i < graph.size(); i++) {
            ArrayList<Integer> list = graph.get(i);
            for (int nbr : list) {
                indegree[nbr]++;
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;

        for (int i = 1; i <= A; i++) {
            if (indegree[i] == 0) {
                pq.add(i);
            }
        }

        int[] ans = new int[A];
        int j = 0;

        while (pq.size() > 0) {
            int rem = pq.remove();
            ans[j] = rem;
            j++;
            count++;

            ArrayList<Integer> list = graph.get(rem);
            for (int nbr : list) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    pq.add(nbr);
                }
            }
        }

        if (count != A) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int size1 = 2;
        int[] input1 = { 1, 2 };
        int[] input2 = { 2, 1 };

        int size2 = 3;
        int[] input3 = { 1, 2 };
        int[] input4 = { 2, 3 };

        PossibilityOfFinishing solution = new PossibilityOfFinishing();
        System.out.println("Result For A =  2, B = [1, 2], C = [2, 1]  : "
                + solution.checkPossibilityOfFinishing(size1, input1, input2));
        System.out.println("Result For A =  3, B = [1, 2], C = [2, 3]  : "
                + solution.checkPossibilityOfFinishing(size2, input3, input4));

    }
}
