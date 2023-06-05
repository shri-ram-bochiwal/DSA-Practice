
/**
 * You are given an array A of integers of size N.
 * Your task is to find the equilibrium index of the given array
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
 */


public class EquilibriumIndex {
    public int solve(int[] A) {
        int PS[] = new int[A.length];
        PS[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            PS[i] = PS[i - 1] + A[i];
        }
        for (int i = 0; i < A.length; i++) {
            int leftSum = 0;
            if (i > 0) {
                leftSum = PS[i - 1];
            }
            int rightSum = PS[A.length - 1] - PS[i];
            if (leftSum == rightSum) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int input1[] = new int[] {-7, 1, 5, 2, -4, 3, 0};
        int input2[] = new int[] {1, 2, 3};
        EquilibriumIndex equlibrium = new EquilibriumIndex();
        System.out.print(" Result for [-7, 1, 5, 2, -4, 3, 0] : " +equlibrium.solve(input1));
        System.out.print(" Result for [1, 2, 3] : " +equlibrium.solve(input2));
    }
}