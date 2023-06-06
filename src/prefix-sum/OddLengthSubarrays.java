/**
 * Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
 * A subarray is a contiguous subsequence of the array.
 */

import java.util.*;


public class OddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr){
        int pfx[] = new int[arr.length+1];
        for(int i = 0; i<arr.length; i++){
            pfx[i+1] = pfx[i]+arr[i];
        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if((j-i+1)%2 == 1){
                    sum += pfx[j+1]-pfx[i];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int input1[] = {1,4,2,5,3};
        int input2[] = {1,2};
        int input3[] = {10,11,12};
        OddLengthSubarrays sumOddLength = new OddLengthSubarrays();
        System.out.println("Result For [1,4,2,5,3] : "+ sumOddLength.sumOddLengthSubarrays(input1));
        System.out.println("Result For [1,2] : "+ sumOddLength.sumOddLengthSubarrays(input2));
        System.out.println("Result For [10,11,12] : "+ sumOddLength.sumOddLengthSubarrays(input3));
    }
    
}
