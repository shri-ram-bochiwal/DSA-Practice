
/**
 * Given an integer A, you have to find the Ath Perfect Number.
 * A Perfect Number has the following properties:
 * It comprises only 1 and 2.
 * The number of digits in a Perfect number is even.
 * It is a palindrome number.
 * For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.
 * */

import java.util.*;

public class PerfectNumbers {

    public String solve(int A) {
        Queue<String> qu = new ArrayDeque<>();
        qu.add("1");
        qu.add("2");

        String ans = "";
        int i = 0;
        while (i < A) {
            String rem = qu.remove();
            StringBuilder sb = new StringBuilder(rem);

            String s1 = rem + "1";
            String s2 = rem + "2";
            qu.add(s1);
            qu.add(s2);

            String rev = sb.reverse().toString();
            String result = rem + rev;
            ans = result.toString();
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int input1 = 2;
        int input2 = 3;

        PerfectNumbers solution = new PerfectNumbers();
        System.out.println("Result For A = 2 : " + solution.solve(input1));
        System.out.println("Result For A = 3 : " + solution.solve(input2));
    }

}
