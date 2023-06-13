/**
 * Given an integer n, return true if it is a power of two. Otherwise, return
 * false.
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 */

public class PowerOfTwo {

    public boolean isPowerOftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 16;
        int input3 = 3;
        PowerOfTwo isPower = new PowerOfTwo();
        System.out.println("Result For 1 : " + isPower.isPowerOftwo(input1));
        System.out.println("Result For 16 : " + isPower.isPowerOftwo(input2));
        System.out.println("Result For 3 : " + isPower.isPowerOftwo(input3));
    }

}
