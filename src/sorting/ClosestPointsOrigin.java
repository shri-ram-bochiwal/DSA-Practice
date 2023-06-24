
/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0)
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */

import java.util.*;

public class ClosestPointsOrigin {

    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;

        Integer[][] arr = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = points[i][0];
            arr[i][1] = points[i][1];
        }

        Arrays.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] a, Integer[] b) {
                int x1 = a[0];
                int y1 = a[1];
                int x2 = b[0];
                int y2 = b[1];
                int d1 = (x1 * x1) + (y1 * y1);
                int d2 = (x2 * x2) + (y2 * y2);
                return d1 - d2;
            }
        });

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            result[i][0] = arr[i][0];
            result[i][1] = arr[i][1];
        }

        return result;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 3 }, { -2, 2 } };
        int target1 = 1;
        int input2[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int target2 = 2;
        ClosestPointsOrigin solution = new ClosestPointsOrigin();
        System.out.println("Result For [[1, 3], [-2, 2]], k = 1 : " + Arrays.deepToString(solution.kClosest(input1, target1)));
        System.out.println("Result For [[3, 3], [5, -1], [-2, 4]], k = 2 : " + Arrays.deepToString(solution.kClosest(input2, target2)));
    }

}
