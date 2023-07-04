
/**
 * Farmer John has built a new long barn with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall and an integer B which represents the number of cows.
 * His cows don't like this barn layout and become aggressive towards each other once put into a stall.
 *  To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible.
 *  What is the largest minimum distance?
 */

import java.util.*;

public class AggressiveCows {

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int left = 0;
        int right = A[A.length - 1] - A[0];
        int largestMinDistance = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValidDistance(A, mid, B)) {
                largestMinDistance = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return largestMinDistance;
    }

    public boolean isValidDistance(int[] A, int distance, int B) {
        int count = 1;
        int position = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] - position >= distance) {
                count++;
                position = A[i];
            }
            if (count == B) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 4, 5 };
        int cows1 = 3;
        int input2[] = { 1, 2 };
        int cows2 = 2;
        AggressiveCows solution = new AggressiveCows();
        System.out.println("Result For [1, 2, 3, 4, 5], cow = 3 : " + solution.solve(input1, cows1));
        System.out.println("Result For [1, 2], cow = 2 : " + solution.solve(input2, cows2));
    }

}
