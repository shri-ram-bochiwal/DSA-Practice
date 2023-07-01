/**
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * return the minimum integer common to both arrays. If there is no common
 * integer amongst nums1 and nums2, return -1.
 * Note that an integer is said to be common to nums1 and nums2 if both arrays
 * have at least one occurrence of that integer.
 */

public class CommonValue {

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3 };
        int input2[] = { 2, 4 };
        int input3[] = { 1, 2, 3, 6 };
        int input4[] = { 2, 3, 4, 5 };
        CommonValue solution = new CommonValue();
        System.out.println("Result For nums1 = [1,2,3], nums2 = [2,4] : " + solution.getCommon(input1, input2));
        System.out.println("Result For nums1 = [1,2,3,6], nums2 = [2,3,4,5] : " + solution.getCommon(input3, input4));
    }

}
