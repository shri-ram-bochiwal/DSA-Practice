/**
 * Given a sorted array of distinct integers A and an integer B, find and return
 * how many rectangles with distinct configurations can be created using
 * elements of this array as length and breadth whose area is lesser than B.
 * (Note that a rectangle of 2 x 3 is different from 3 x 2 if we take
 * configuration into view
 */

public class CountRectangles {

    public int solve(int[] A, int B) {
        int mod = 1000000007;
        long count = 0;
        int left = 0, right = A.length - 1;
        while (left <= right) {
            long area = 1L * A[left] * A[right];
            if (area < B) {
                count += (right - left) * 2 + 1;
                left++;
            } else {
                right--;
            }
        }
        return (int) (count % mod);
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2 };
        int target1 = 5;
        int input2[] = { 1, 2 };
        int target2 = 1;
        CountRectangles solution = new CountRectangles();
        System.out.println("Result For A = [1, 2], B = 5 : " + solution.solve(input1, target1));
        System.out.println("Result For A = [1, 2], B = 1 : " + solution.solve(input2, target2));
    }

}
