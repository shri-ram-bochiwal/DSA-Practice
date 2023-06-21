/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two preceding
 * ones, starting from 0 and 1.
 */

public class FibonacciNumber {

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib1 = fib(n - 1);
        int fib2 = fib(n - 2);
        return fib1 + fib2;
    }

    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 3;
        int input3 = 4;
        FibonacciNumber solution = new FibonacciNumber();
        System.out.println("Result For 2 : " + solution.fib(input1));
        System.out.println("Result For 3 : " + solution.fib(input2));
        System.out.println("Result For 4 : " + solution.fib(input3));
    }

}
