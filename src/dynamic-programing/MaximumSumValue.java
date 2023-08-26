/**
 * You are given an array A of N integers and three integers B, C, and D.
 * You have to find the maximum value of A[i]*B + A[j]*C + A[k]*D, where 1 <= i <= j <= k <= N.
 */


public class MaximumSumValue {

    public int solve(int[] A, int B, int C, int D){
        int n = A.length;
        int dp[][] = new int[n][4];

        dp[0][1] = A[0] * B;
        dp[0][2] = dp[0][1] + A[0] * C;
        dp[0][3] = dp[0][2] + A[0] * D;

        for(int i = 1; i<n; i++){
            dp[i][1] = Math.max(dp[i-1][1], A[i] * B);
            dp[i][2] = Math.max(dp[i-1][2], dp[i][1] + A[i] * C);
            dp[i][3] = Math.max(dp[i-1][3], dp[i][2] + A[i] * D);
        }

        return dp[n-1][3];
    }

    public static void main(String[] args){
        int[] input1 = {1, 5, -3, 4, -2};
        int b1 = 2;
        int c1 = 1;
        int d1 = -1;

        int[] input2 = {3, 2, 1};
        int b2 = 1;
        int c2 = -10;
        int d2 = 3;

        MaximumSumValue solution = new MaximumSumValue();
        System.out.println("Result For A = [1, 5, -3, 4, -2], B = 2, C = 1, D = -1 : " + solution.solve(input1, b1, c1, d1));
        System.out.println("Result For A = [3, 2, 1], B = 1, C = -10, D = 3 : " + solution.solve(input2, b2, c2, d2));

    }

}
