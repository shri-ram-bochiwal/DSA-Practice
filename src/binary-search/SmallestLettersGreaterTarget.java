
/**
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
 * Return the smallest character in letters that is lexicographically greater than target. 
 * If such a character does not exist, return the first character in letters.
*/

import java.util.*;

public class SmallestLettersGreaterTarget {

    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (letters[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (s == n) {
            return letters[0];
        }
        return letters[s];
    }

    public static void main(String[] args) {
        char input1[] = { 'c', 'f', 'j' };
        char target1 = 'a';
        char input2[] = { 'c', 'f', 'j' };
        char target2 = 'c';
        char input3[] = { 'x', 'x', 'y', 'y' };
        char target3 = 'z';
        SmallestLettersGreaterTarget smallGreatestLetter = new SmallestLettersGreaterTarget();
        System.out.println(
                "Result For ['c','f','j'], Target = 'a' : " + smallGreatestLetter.nextGreatestLetter(input1, target1));
        System.out.println(
                "Result For ['c','f','j'], Target = 'c' : " + smallGreatestLetter.nextGreatestLetter(input2, target2));
        System.out.println("Result For ['x','x','y','y'], Target = 'z' : "
                + smallGreatestLetter.nextGreatestLetter(input3, target3));
    }

}
