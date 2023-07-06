/**
 * Given an array of integers A and an integer B, find and return the maximum
 * value K such that there is no subarray in A of size K with the sum of
 * elements greater than B.
 */

public class SpecialInteger {

    public int solve(int[] A, int B){
        int start = 1, end = A.length, mid, ans = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            boolean flag = checkWindow(A, B, mid);
            if(flag){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }

    private boolean checkWindow(int[] A, int B, int window) {
        long sum = 0;
        for (int i = 0; i < window; i++) {
            sum += A[i];
        }
        long max = sum;
        for (int i = window; i < A.length; i++) {
            sum = sum + A[i] - A[i - window];
            max = Math.max(max, sum);
        }
        if (max <= B) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 4, 5 };
        int input2 = 10;
        int input3[] = { 5, 17, 100, 11 };
        int input4 = 130;
        SpecialInteger solution = new SpecialInteger();
        System.out.println("Result For A = [1, 2, 3, 4, 5], B = 10 : " + solution.solve(input1, input2));
        System.out.println("Result For A = [5, 17, 100, 11], B = 130 : " + solution.solve(input3, input4));
    }

}
