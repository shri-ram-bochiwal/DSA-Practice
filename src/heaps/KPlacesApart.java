/**
 * N people having different priorities are standing in a queue.
 * The queue follows the property that each person is standing at most B places away from its position in the sorted queue.
 * Your task is to sort the queue in the increasing order of priorities.
 * NOTE:
 * No two persons can have the same priority.
 * Use the property of the queue to sort the queue with complexity O(NlogB)
 */


import java.util.*;

public class KPlacesApart {

    public int[] solve(int[] A, int B){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = A.length;
        for(int i = 0; i<B+1; i++){
            pq.add(A[i]);
        }

        int[] ans = new int[n];
        int k = 0;
        for(int i = B+1; i<n; i++){
            ans[k++] = pq.remove();
            pq.add(A[i]);
        }

        while(!pq.isEmpty()){
            ans[k++] = pq.remove();
        }

        return ans;
    }

    public static void main(String[] args){
        int[] input1 = {1, 40, 2, 3};
        int target1 = 2;
        int[] input2 = {2, 1, 17, 10, 21, 95};
        int target2 = 1;

        KPlacesApart solution = new KPlacesApart();
        System.out.println("Result For [1, 40, 2, 3], B = 2 : " + Arrays.toString(solution.solve(input1, target1)));
        System.out.println("Result For [2, 1, 17, 10, 21, 95], B = 1 : " + Arrays.toString(solution.solve(input2, target2)));
    }

}
