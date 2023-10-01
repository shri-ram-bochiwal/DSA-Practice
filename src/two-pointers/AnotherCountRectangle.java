/**
 * Given a sorted array of distinct integers A and an integer B, find and return
 * how many rectangles with distinct configurations can be created using
 * elements of this array as length and breadth whose area is lesser than B.
 * (Note that a rectangle of 2 x 3 is different from 3 x 2 if we take
 * configuration into view)
 */

public class AnotherCountRectangle {

    public int countRectangle(int[] A, int B) {
        int i = 0;
        int j = A.length - 1;
        long count = 0;
        int mod = 1000000007;
        while (i <= j) {
            long area = 1L * A[i] * A[j];
            if (area < B) {
                count += (j - i) * 2 + 1;
                i++;
            } else {
                j--;
            }
        }

        return (int) count % mod;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 2 };
        int target1 = 5;

        int[] input2 = { 1, 2 };
        int target2 = 1;

        AnotherCountRectangle solution = new AnotherCountRectangle();
        System.out.println("Result For A = [1, 2], B = 5 : " + solution.countRectangle(input1, target1));
        System.out.println("Result For [1, 2], B = 1 : " + solution.countRectangle(input2, target2));
    }
}
