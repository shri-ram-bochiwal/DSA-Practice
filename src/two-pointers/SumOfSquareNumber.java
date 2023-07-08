/**
 * Given a non-negative integer c, decide whether there're two integers a and b
 * such that a2 + b2 = c.
 */

public class SumOfSquareNumber {

    public boolean judgeSquareSum(int c) {
        int a = 0;
        long b = (long) Math.sqrt(c);
        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int input1 = 5;
        int input2 = 3;
        SumOfSquareNumber solution = new SumOfSquareNumber();
        System.out.println("Result For c = 5 : " + solution.judgeSquareSum(input1));
        System.out.println("Result For c = 3 : " + solution.judgeSquareSum(input2));
    }

}
