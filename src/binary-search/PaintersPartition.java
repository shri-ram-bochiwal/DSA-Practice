/**
 * Given 2 integers A and B and an array of integers C of size N. Element C[i]
 * represents the length of ith board.
 * You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters
 * available and each of them takes B units of time to paint 1 unit of the
 * board.
 * Calculate and return the minimum time required to paint all boards under the
 * constraints that any painter will only paint contiguous sections of the
 * board.
 * NOTE:
 * 1. 2 painters cannot share a board to paint. That is to say, a board cannot
 * be painted partially by one painter, and partially by another.
 * 2. A painter will only paint contiguous boards. This means a configuration
 * where painter 1 paints boards 1 and 3 but not 2 is invalid.
 * Return the ans % 10000003.
 */

public class PaintersPartition {

    public int paint(int A, int B, int[] C) {
        int left = 0, right = 0;
        long ans = 0;
        for (int i = 0; i < C.length; i++) {
            left = Math.max(left, C[i]);
            right += C[i];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(A, C, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) (ans * (long) B % 10000003);
    }

    public boolean check(int A, int[] C, int mid) {
        int sum = 0;
        int worker = 1;
        for (int i = 0; i < C.length; i++) {
            if (sum + C[i] > mid) {
                worker++;
                sum = C[i];
                if (worker > A) {
                    return false;
                }
            } else {
                sum += C[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int A1 = 2;
        int B1 = 5;
        int[] C1 = { 1, 10 };
        int A2 = 10;
        int B2 = 1;
        int[] C2 = { 1, 8, 11, 3 };
        PaintersPartition solution = new PaintersPartition();
        System.out.println("Result For A = 2, B = 5, C = [1, 10] : " + solution.paint(A1, B1, C1));
        System.out.println("Result For A = 10, B = 1, C = [1, 8, 11, 3] : " + solution.paint(A2, B2, C2));
    }

}
