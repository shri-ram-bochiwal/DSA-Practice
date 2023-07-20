
/**
 * Given an array A, find the next greater element G[i] for every element A[i] in the array.
 *  The next greater element for an element A[i] is the first greater element on the right side of A[i] in the array, A.
 */

import java.util.*;

public class NextGreater {

    public int[] nextGreater(int[] A) {
        int ans[] = new int[A.length];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                int index = stack.pop();
                ans[index] = A[i];
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] input1 = { 4, 5, 2, 10 };
        int[] input2 = { 3, 2, 1 };
        NextGreater solution = new NextGreater();
        System.out.println("Result For [4, 5, 2, 10] : " + Arrays.toString(solution.nextGreater(input1)));
        System.out.println("Result For [3, 2, 1] : " + Arrays.toString(solution.nextGreater(input2)));
    }

}
