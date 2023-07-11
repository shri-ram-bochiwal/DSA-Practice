
/**
 * Given an array with N objects colored red, white, or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white, and blue.
 * We will represent the colors as,
 * red -> 0
 * white -> 1
 * blue -> 2
 * Note: Using the library sort function is not allowed.
 */

import java.util.*;

public class SortByColor {

    public int[] sortColors(int[] A) {
        int red = 0, white = 0, blue = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                red++;
            }
            if (A[i] == 1) {
                white++;
            }
            if (A[i] == 2) {
                blue++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (red > 0) {
                A[i] = 0;
                red--;
            }
            else if (white > 0) {
                A[i] = 1;
                white--;
            }
            else if (blue > 0) {
                A[i] = 2;
                blue--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int input1[] = { 0, 1, 2, 0, 1, 2 };
        int input2[] = { 2, 0, 2, 1, 1, 0 };
        int input3[] = { 2, 0, 1 };
        SortByColor solution = new SortByColor();
        System.out.println("Result For [0, 1, 2, 0, 1, 2] : " + Arrays.toString(solution.sortColors(input1)));
        System.out.println("Result For [2,0,2,1,1,0] : " + Arrays.toString(solution.sortColors(input2)));
        System.out.println("Result For [2,0,1] : " + Arrays.toString(solution.sortColors(input3)));
    }

}
