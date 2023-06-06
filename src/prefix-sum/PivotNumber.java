/**
 * Given a positive integer n, find the pivot integer x such that:
 * The sum of all elements between 1 and x inclusively equals the sum of all
 * elements between x and n inclusively.
 * Return the pivot integer x. If no such integer exists, return -1. It is
 * guaranteed that there will be at most one pivot index for the given input.
 */

public class PivotNumber {
    public int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;
        for (int i = n; i >= 0; i--) {
            currentSum += i;
            if (currentSum == totalSum) {
                return i;
            }
            totalSum -= i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nmb1 = 8;
        int nmb2 = 1;
        int nmb3 = 4;
        PivotNumber pivotNmb = new PivotNumber();
        System.out.println("Result For 8 : " + pivotNmb.pivotInteger(nmb1));
        System.out.println("Result For 1 : " + pivotNmb.pivotInteger(nmb2));
        System.out.println("Result For 4 : " + pivotNmb.pivotInteger(nmb3));
    }
}
