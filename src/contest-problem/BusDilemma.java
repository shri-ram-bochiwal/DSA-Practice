/**
 * A bus travels N different stops, and at each stop some amount of people get
 * in and get out. You are given an array A, where integer A[i] gives the amount
 * of people who have got onto the bus, or the amount of people who have gotten
 * off the bus at the stop i.
 * you are also given a positive integer B,tha denotes the capacity of the bus,
 * that is the maximum number of people the bus can hold. the bus can hold 0 to
 * B number of people at any time.
 * Initially the bus can have some number of people inside of it, you have to
 * find the total number of possible ways of how many people were initially in
 * the bus before the first stop, such that any time there are always 0 to B
 * number of people in the bus.
 * if it is not possible to find any valid number of ways , return 0.
 */

public class BusDilemma {

    public int solve(int[] A, int B) {
        long ans = 0;
        long max = A[0], min = A[0];
        for (int i = 0; i < A.length; i++) {
            ans += A[i];
            if (ans > max) {
                max = ans;
            }
            if (ans < min) {
                min = ans;
            }
        }
        if (-min > B || max > B) {
            return 0;
        }
        long low = 0, high = 0;
        if (min > 0) {
            low = 0;
        } else {
            low = -min;
        }
        if (max > 0) {
            high = B - max;
        } else {
            high = B;
        }
        int count = (int) (high - low + 1);
        return count;
    }

    public static void main(String[] args) {
        int input1[] = { 2, 1, -3 };
        int capacity1 = 5;
        int input2[] = { -1, 1 };
        int capacity2 = 4;
        BusDilemma solution = new BusDilemma();
        System.out.println("Result For [2, 1, -3], 5 : " + solution.solve(input1, capacity1));
        System.out.println("Result For [-1, 1], 4 : " + solution.solve(input2, capacity2));
    }

}