
/**
 * Given an array A of N integers, are there elements a, b, c in S such that a + b + c = 0
 * Find all unique triplets in the array which gives the sum of zero.
 * Note:
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) The solution set must not contain duplicate triplets.
 */

import java.util.*;

public class ThreeSumZero {

    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && A.get(i).equals(A.get(i - 1))) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = A.get(i) + A.get(j) + A.get(k);
                if (sum == 0) {
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(A.get(i));
                    ans.add(A.get(j));
                    ans.add(A.get(k));

                    result.add(ans);

                    int x = A.get(j);
                    while (j < k && A.get(j) == x) {
                        j++;
                    }
                    int y = A.get(k);
                    while (j < k && A.get(k) == y) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer input1[] = { -5, 2, 1, 3 };
        Integer input2[] = { -1, 0, 1, 2, -1, 4 };

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(input1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(input2));
        ThreeSumZero solution = new ThreeSumZero();
        System.out.println("Result For [-5, 2, 1, 3] : " + solution.threeSum(list1));
        System.out.println("Result For [-5, 2, 1, 3] : " + solution.threeSum(list2));
    }

}
