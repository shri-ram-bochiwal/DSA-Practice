
/**
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.
 * NOTE: The rightmost element is always a leader.
*/

import java.util.*;

public class LeadersElement {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int maxProfit = A.get(n - 1);
        ans.add(maxProfit);

        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) > maxProfit) {
                maxProfit = A.get(i);
                ans.add(A.get(i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = { 16, 17, 4, 3, 5, 2 };
        int[] input2 = { 5, 4 };

        ArrayList<Integer> inputList1 = new ArrayList<>();
        ArrayList<Integer> inpuList2 = new ArrayList<>();

        for (int i = 0; i < input1.length; i++) {
            int val = input1[i];
            inputList1.add(val);
        }

        for (int i = 0; i < input2.length; i++) {
            int val = input2[i];
            inpuList2.add(val);
        }

        LeadersElement solution = new LeadersElement();
        System.out.println("Result For [16, 17, 4, 3, 5, 2] : " + solution.solve(inputList1));
        System.out.println("Result For [5, 4] : " + solution.solve(inpuList2));
    }

}
