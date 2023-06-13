/**
 * Given two integers dividend and divisor, divide two integers without using
 * multiplication, division, and mod operator.
 * The integer division should truncate toward zero, which means losing its
 * fractional part. For example, 8.345 would be truncated to 8, and -2.7335
 * would be truncated to -2.
 * Return the quotient after dividing dividend by divisor.
 * Note: Assume we are dealing with an environment that could only store
 * integers within the 32-bit signed integer range: [−231, 231 − 1]. For this
 * problem, if the quotient is strictly greater than 231 - 1, then return 231 -
 * 1, and if the quotient is strictly less than -231, then return -231.
 */

public class DivideTwoInteger {

    public int divide(int divident, int divisor) {
        double ans = (double) divident / divisor;
        return (int) ans;
    }

    public static void main(String[] args) {
        int input1 = 10;
        int input2 = 3;
        int input3 = 7;
        int input4 = -3;
        DivideTwoInteger solve = new DivideTwoInteger();
        System.out.println("Result For Divident = 10, Divisor = 3 : " + solve.divide(input1, input2));
        System.out.println("Result For Divident = 7, Divisor = -3 : " + solve.divide(input3, input4));
    }

}
