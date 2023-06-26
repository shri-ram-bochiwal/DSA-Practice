
/**
 * Given two integer arrays A and B of size N.
 * There are N activities where A[i] denotes the start time of the ith activity and B[i] denotes the finish time of the ith activity.
 * Your task is to select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
 */

import java.util.*;

public class ActivitySelection {

    public int solve(int A[], int B[]) {
        int n = A.length;
        int C[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            C[i][0] = A[i];
            C[i][1] = B[i];
        }

        Arrays.sort(C, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        int count = 1;
        int endTime = C[0][1];
        for (int i = 1; i < n; i++) {
            if (C[i][0] >= endTime) {
                count++;
                endTime = C[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int A1[] = { 5, 1, 3, 0, 5, 8 };
        int B1[] = { 9, 2, 4, 6, 7, 9 };
        int A2[] = { 17, 8, 14, 24, 10, 8, 1, 30 };
        int B2[] = { 18, 45, 24, 27, 18, 10, 38, 35 };
        ActivitySelection solution = new ActivitySelection();
        System.out.println("Result For A = [5, 1, 3, 0, 5, 8], B = [9, 2, 4, 6, 7, 9] : " + solution.solve(A1, B1));
        System.out.println("Result For A = [17, 8, 14, 24, 10, 8, 1, 30], B = [18, 45, 24, 27, 18, 10, 38, 35] : "
                + solution.solve(A2, B2));
    }

}
