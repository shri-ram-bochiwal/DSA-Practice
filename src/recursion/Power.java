
/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */

import java.util.*;

public class Power {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / (x * myPow(x, -(n + 1)));
        } else if (n % 2 == 0) {
            double halfPower = myPow(x, n / 2);
            return halfPower * halfPower;
        } else {
            double halfPower = myPow(x, n / 2);
            return x * halfPower * halfPower;
        }
    }

    public static void main(String[] args){
        double input1 = 2.00000;
        int  input2 = 10;
        double input3 = 2.10000;
        int input4 = 3;
        double input5 = 2.00000;
        int input6 = -2;
        Power solution = new Power();
        System.out.println("Result For x = 2.00000, n = 10 : " + solution.myPow(input1, input2));
        System.out.println("Result For x = 2.10000, n = 3 : " + solution.myPow(input3, input4));
        System.out.println("Result For x = 2.00000, n = -2 : " + solution.myPow(input5, input6));
    }

}