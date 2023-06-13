/**
 * Given two integers a and b, return the sum of the two integers without using
 * the operators + and -.
 */

public class SumTwoIntegers {

    public int getSum(int a, int b) {
        while (b != 0) {
            int tmp = (a & b) << 1;
            a = a ^ b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 2;
        int input3 = 2;
        int input4 = 3;
        SumTwoIntegers solve = new SumTwoIntegers();
        System.out.println("Result For a = 1, b = 2 : " + solve.getSum(input1, input2));
        System.out.println("Result For a = 2, b = 3 : " + solve.getSum(input3, input4));
    }

}
