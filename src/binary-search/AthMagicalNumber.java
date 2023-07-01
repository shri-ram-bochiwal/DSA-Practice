/**
 * You are given three positive integers, A, B, and C.
 * Any positive integer is magical if divisible by either B or C.
 * Return the Ath smallest magical number. Since the answer may be very large,
 * return modulo 109 + 7.
 * Note: Ensure to prevent integer overflow while calculating.
 */

public class AthMagicalNumber {

    public int solve(int A, int B, int C) {
        int mod = 1000000007;
        int lcm = (B * C) / gcd(B, C);
        long low = 1;
        long high = (long) A * Math.max(B, C);
        while (low < high) {
            long mid = low + (high - low) / 2;
            long count = (mid / B) + (mid / C) + (mid / lcm);

            if (count < A) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) (low % mod);
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int A1 = 1;
        int B1 = 2;
        int C1 = 3;

        int A2 = 4;
        int B2 = 2;
        int C2 = 3;
        AthMagicalNumber solution = new AthMagicalNumber();
        System.out.println("Result For A = 1, B = 2, C = 3 : " + solution.solve(A1, B1, C1));
        System.out.println("Result For A = 4, B = 2, C = 3 : " + solution.solve(A2, B2, C2));
    }

}
