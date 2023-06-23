/**
 * You are given an integer array arr of length n that represents a permutation
 * of the integers in the range [0, n - 1].
 * We split arr into some number of chunks (i.e., partitions), and individually
 * sort each chunk. After concatenating them, the result should equal the sorted
 * array.
 * Return the largest number of chunks we can make to sort the array.
 */

public class MaxChunks {

    public int maxChunksSorted(int A[]) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(A[i], max);
            if (i == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int input1[] = { 4, 3, 2, 1, 0 };
        int input2[] = { 1, 0, 2, 3, 4 };
        MaxChunks solution = new MaxChunks();
        System.out.println("Result For [4,3,2,1,0] : " + solution.maxChunksSorted(input1));
        System.out.println("Result For [1,0,2,3,4] : " + solution.maxChunksSorted(input2));
    }

}
