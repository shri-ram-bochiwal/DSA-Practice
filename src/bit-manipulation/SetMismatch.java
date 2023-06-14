
/**
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
 * You are given an integer array nums representing the data status of this set after the error.
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 */

import java.util.*;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int duplicate = 0;
        int misMatch = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                duplicate = nums[i];
            }
            hs.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (hs.contains(i) == false) {
                misMatch = i;
                break;
            }
        }
        return new int[] { duplicate, misMatch };
    }

    public static void main(String[] args) {
        int input1[] = { 1, 2, 2, 4 };
        int input2[] = { 1, 1 };
        SetMismatch setNumber = new SetMismatch();
        System.out.println("Result For [1,2,2,4] : " + Arrays.toString(setNumber.findErrorNums(input1)));
        System.out.println("Result For [1,1] : " + Arrays.toString(setNumber.findErrorNums(input2)));
    }

}
