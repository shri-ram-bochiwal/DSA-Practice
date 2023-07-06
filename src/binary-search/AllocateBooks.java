/**
 * Given an array of integers A of size N and an integer B.
 * The College library has N books. The ith book has A[i] number of pages.
 * You have to allocate books to B number of students so that the maximum number
 * of pages allocated to a student is minimum.
 * A book will be allocated to exactly one student.
 * Each student has to be allocated at least one book.
 * Allotment should be in contiguous order, for example: A student cannot be
 * allocated book 1 and book 3, skipping book 2.
 * Calculate and return that minimum possible number.
 * NOTE: Return -1 if a valid assignment is not possible.
 */

public class AllocateBooks {

    public int books(int[] A, int B) {
        int n = A.length;
        int left = Integer.MIN_VALUE;
        int right = 0, mid = 0, ans = -1;
        if (B > n) {
            return ans;
        }
        for (int i = 0; i < n; i++) {
            left = Math.max(left, A[i]);
            right += A[i];
        }
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (checkIf(A, B, mid, n)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public boolean checkIf(int[] A, int B, int mid, int n) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > mid) {
                sum = A[i];
                count++;
            }
            if (count > B) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int input1[] = { 12, 34, 67, 90 };
        int input2 = 2;
        int input3[] = { 12, 15, 78 };
        int input4 = 4;
        AllocateBooks solution = new AllocateBooks();
        System.out.println("Result For A = [12, 34, 67, 90], B = 2 : " + solution.books(input1, input2));
        System.out.println("Result For A = [12, 15, 78], B = 4 : " + solution.books(input3, input4));
    }

}
