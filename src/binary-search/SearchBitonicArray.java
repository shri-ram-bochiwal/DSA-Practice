/**
 * Given a bitonic sequence A of N distinct elements, write a program to find a
 * given element B in the bitonic sequence in O(logN) time.
 * NOTE:
 * A Bitonic Sequence is a sequence of numbers which is first strictly
 * increasing then after a point strictly decreasing.
 */

public class SearchBitonicArray {

    public int leftBitonicArray(int A[], int B, int left, int right) {
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A[mid] == B) {
                return mid;
            } else if (A[mid] > B) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int rightBitonicArray(int[] A, int B, int left, int right) {
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A[mid] == B) {
                return mid;
            } else if (A[mid] > B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        int left = 0, right = n - 1, mid = 0, midx = 0, ans = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                midx = mid;
                if (A[mid] == B) {
                    return mid;
                }
                break;
            } else if (A[mid] > A[mid - 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        ans = leftBitonicArray(A, B, 0, midx - 1);
        if (ans == -1) {
            ans = rightBitonicArray(A, B, midx + 1, n - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int input1[] = { 3, 9, 10, 20, 17, 5, 1 };
        int target1 = 20;
        int input2[] = { 5, 6, 7, 8, 9, 10, 3, 2, 1 };
        int target2 = 30;
        SearchBitonicArray solution = new SearchBitonicArray();
        System.out.println("Result For [3, 9, 10, 20, 17, 5, 1], target = 20 : " + solution.solve(input1, target1));
        System.out.println("Result For [5, 6, 7, 8, 9, 10, 3, 2, 1], target = 30 : " + solution.solve(input2, target2));
    }

}
