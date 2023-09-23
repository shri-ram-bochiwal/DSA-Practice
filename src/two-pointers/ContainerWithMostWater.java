/**
 * Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents
 * a point at coordinate (i, A[i]).
 * N vertical lines are drawn such that the two endpoints of line i is at (i,
 * A[i]) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the
 * container contains the most water. You need to return this maximum area.
 * Note: You may not slant the container. It is guaranteed that the answer will
 * fit in integer limits.
 */

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);

            if (area > result) {
                result = area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 5, 4, 3 };
        int[] input2 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] input3 = { 1 };

        ContainerWithMostWater solution = new ContainerWithMostWater();
        System.out.println("Result For Height = [1, 5, 4, 3] : " + solution.maxArea(input1));
        System.out.println("Result For Height = [1, 8, 6, 2, 5, 4, 8, 3, 7] : " + solution.maxArea(input2));
        System.out.println("Result For Height = [1] : " + solution.maxArea(input3));
    }

}
