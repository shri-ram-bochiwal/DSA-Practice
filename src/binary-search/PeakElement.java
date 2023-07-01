/**
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its
 * index. If the array contains multiple peaks, return the index to any of the
 * peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
 * always considered to be strictly greater than a neighbor that is outside the
 * array.
 * You must write an algorithm that runs in O(log n) time.
 */

public class PeakElement {

    public int findPeakElement(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start; 
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 3, 1 };
        int input2[] = { 1, 2, 1, 3, 5, 6, 4 };
        PeakElement solution = new PeakElement();
        System.out.println("Result For [1,2,3,1] : " + solution.findPeakElement(input1));
        System.out.println("Result For [1,2,1,3,5,6,4] : " + solution.findPeakElement(input2));
    }

}
