
/**
 * An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother). 
 * If one or more of the surrounding cells of a cell is not present, we do not consider it in the average (i.e., the average of the four cells in the red smoother).
 * Given an m x n integer matrix img representing the grayscale of an image, return the image after applying the smoother on each cell of it.
 */

import java.util.*;

public class ImageSmoother {

    public int[][] solution(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                int count = 1;
                if (i > 0) {
                    sum += img[i - 1][j];
                    count++;
                }
                if (j > 0) {
                    sum += img[i][j - 1];
                    count++;
                }
                if (i > 0 && j > 0) {
                    sum += img[i - 1][j - 1];
                    count++;
                }
                if (i < m - 1) {
                    sum += img[i + 1][j];
                    count++;
                }
                if (j < n - 1) {
                    sum += img[i][j + 1];
                    count++;
                }
                if (i < m - 1 && j < n - 1) {
                    sum += img[i + 1][j + 1];
                    count++;
                }
                if (i > 0 && j < n - 1) {
                    sum += img[i - 1][j + 1];
                    count++;
                }
                if (i < m - 1 && j > 0) {
                    sum += img[i + 1][j - 1];
                    count++;
                }
                sum += img[i][j];

                ans[i][j] = sum / count;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int input1[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int input2[][] = { { 100, 200, 100 }, { 200, 50, 200 }, { 100, 200, 100 } };
        ImageSmoother imageSmootherSoution = new ImageSmoother();
        System.out.println(
                "Result For [[1,1,1], [1,0,1], [1,1,1]] : "
                        + Arrays.deepToString(imageSmootherSoution.solution(input1)));
        System.out.println("Result For [[100,200,100], [200,50,200], [100,200,100]] : "
                + Arrays.deepToString(imageSmootherSoution.solution(input2)));
    }

}
