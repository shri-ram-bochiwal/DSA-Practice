/**
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which
 * we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 */

public class TotalSubarraySum {

    public long subarraySum(int[] A) {
        long totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            long count = (long) (i + 1) * (A.length - i);
            totalSum = totalSum + count * A[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3 };
        int input2[] = { 2, 1, 3 };
        TotalSubarraySum subarrayTotalSum = new TotalSubarraySum();
        System.out.println("Result For [1, 2, 3] : " + subarrayTotalSum.subarraySum(input1));
        System.out.println("Result For [2, 1, -3] : " + subarrayTotalSum.subarraySum(input2));
    }

}
