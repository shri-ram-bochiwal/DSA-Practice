/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 */

public class MissingNumber {

    public int solve(int[] nums) {
        int sumValues = 0;
        int sumIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            sumValues += nums[i];
            sumIndex += i;
        }
        sumIndex += nums.length;
        return sumIndex - sumValues;
    }

    public static void main(String[] args) {
        int input1[] = { 3, 0, 1 };
        int input2[] = { 0, 1 };
        int input3[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        MissingNumber solution = new MissingNumber();
        System.out.println("Result For [3,0,1] : " + solution.solve(input1));
        System.out.println("Result For [0,1] : " + solution.solve(input2));
        System.out.println("Result For [9,6,4,2,3,5,7,0,1] : " + solution.solve(input3));
    }

}
