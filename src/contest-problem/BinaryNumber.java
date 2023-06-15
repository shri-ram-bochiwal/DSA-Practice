/**
 * Construct a binary number having A 1's followed by B 0's. Return the decimal
 * value of that binary number.
 */

public class BinaryNumber {

    public int solve(int A, int B){
        int ans = 0;
        for(int i = B; i<A+B; i++){
            ans = ans + (1<<i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1 = 3;
        int input2 = 2;
        int input3 = 2;
        int input4 = 3;
        BinaryNumber solution = new BinaryNumber();
        System.out.println("Result For A = 3, B = 2 : " + solution.solve(input1, input2));
        System.out.println("Result For A = 2, B = 3 : " + solution.solve(input3, input4));
    }

}
