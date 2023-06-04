import java.util.*;

public class LeftSumRightSumDiff {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        leftSum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }
        rightSum[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = new int[] { 10, 4, 8, 3 };
        int input2[] = new int[] { 1 };
        LeftSumRightSumDiff leftSumRightSum = new LeftSumRightSumDiff();
        System.out.println("Result For [10,4,8,3]: " + Arrays.toString(leftSumRightSum.leftRightDifference(input1)));
        System.out.println("Result For [1]: " + Arrays.toString(leftSumRightSum.leftRightDifference(input2)));
    }
}