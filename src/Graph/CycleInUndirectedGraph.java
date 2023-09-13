
/**
 * Given an undirected graph having A nodes labelled from 1 to A with M edges given in a form of matrix B of size M x 2 where (B[i][0], B[i][1]) represents two nodes B[i][0] and B[i][1] connected by an edge.
 * Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.
 * NOTE:
 * The cycle must contain atleast three nodes.
 * There are no self-loops in the graph.
 * There are no multiple edges between two nodes.
 * The graph may or may not be connected.
 * Nodes are numbered from 1 to A.
 * Your solution will run on multiple test cases. If you are using global variables make sure to clear them.
 */

import java.util.*;

public class CycleInUndirectedGraph {

    public int cycleInUndirected(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= A; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < B.length; i++) {
            int u = B[i][0];
            int v = B[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[A + 1];
        for (int i = 1; i <= A; i++) {
            if (!visited[i] && hasCycle(graph, visited, -1, i)) {
                return 1;
            }
        }

        return 0;
    }

    public boolean hasCycle(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int parent, int node) {
        visited[node] = true;

        for (int nbr : graph.get(node)) {
            if (!visited[nbr]) {
                if (hasCycle(graph, visited, node, nbr)) {
                    return true;
                }
            } else if (nbr != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int vartax1 = 5;
        int[][] input1 = { { 1, 2 }, { 1, 3 }, { 2, 3 }, { 1, 4 }, { 4, 5 } };

        int vartax2 = 3;
        int[][] input2 = { { 1, 2 }, { 1, 3 } };

        CycleInUndirectedGraph solution = new CycleInUndirectedGraph();

        System.out.println("Result For : " + solution.cycleInUndirected(vartax1, input1));
        System.out.println("Result For : " + solution.cycleInUndirected(vartax2, input2));
    }

}