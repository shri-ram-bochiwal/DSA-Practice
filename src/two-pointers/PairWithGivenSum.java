/**
 * Given a sorted array of integers (not necessarily distinct) A and an integer
 * B, find and return how many pair of integers ( A[i], A[j] ) such that i != j
 * have sum equal to B.
 * Since the number of such pairs can be very large, return number of such pairs
 * modulo (109 + 7).
 */

public class PairWithGivenSum {

    public int pairSum(int[] Pair, int target) {
        int start = 0;
        int end = Pair.length - 1;
        int pairSum = 0;
        int count = 0;
        int mod = 1000000007;

        while (start < end) {
            pairSum = (Pair[start] + Pair[end]) % mod;

            if (pairSum == target) {

                if (Pair[start] == Pair[end] && Pair[start] + Pair[end] == target) {
                    int m = end - start;
                    int n = end - start + 1;
                    count = count + (m * n) / 2;
                    break;
                } else {
                    int left = 1;
                    int right = 1;

                    while (Pair[start] == Pair[start + 1]) {
                        left++;
                        start++;
                    }

                    while (Pair[end] == Pair[end - 1]) {
                        right++;
                        end--;
                    }

                    start++;
                    end--;
                    count += left * right;
                }

            } else if (pairSum > target) {
                end--;
            } else {
                start++;
            }
        }

        return (int) count % mod;
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 1, 1 };
        int target1 = 2;

        int[] input2 = { 1, 5, 7, 10 };
        int target2 = 8;

        PairWithGivenSum solution = new PairWithGivenSum();
        System.out.println("Result For Pair = [1, 1, 1], target = 2 : " + solution.pairSum(input1, target1));
        System.out.println("Result For Pair = [1, 5, 7, 10], target = 8 : " + solution.pairSum(input2, target2));
    }

}
