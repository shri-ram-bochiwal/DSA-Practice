/**
 * Reverse the bits of an 32 bit unsigned integer A.
 */

public class ReverseBits {

    public long reverse(long A) {
        long result = 0;
        int j = 31;
        for (int i = 0; i < 32; i++) {
            if ((A & (1 << i)) != 0) {
                result = result | (1L << j);
            }
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        long input1 = 0;
        long input2 = 3;
        ReverseBits solve = new ReverseBits();
        System.out.println("Result For 0 : " + solve.reverse(input1));
        System.out.println("Result For 3 : " + solve.reverse(input2));
    }

}
