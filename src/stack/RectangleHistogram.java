
/**
 * Given an array of integers A.
 * A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.
 * Find the area of the largest rectangle formed by the histogram.
 */

import java.util.*;

public class RectangleHistogram {

    public int largestRectangleArea(int[] A) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= A.length; i++) {
            while (!stack.isEmpty() && (i == A.length || A[i] < A[stack.peek()])) {
                int height = A[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] input1 = { 2, 1, 5, 6, 2, 3 };
        int[] input2 = { 2 };
        RectangleHistogram solution = new RectangleHistogram();
        System.out.println("Result For [2, 1, 5, 6, 2, 3] : " + solution.largestRectangleArea(input1));
        System.out.println("Result For [2] : " + solution.largestRectangleArea(input2));
    }

}
