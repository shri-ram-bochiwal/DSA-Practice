/**
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class FirstOccurenceInString {

    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == 0 || j < needle.length()) {
            return -1;
        }
        return i - j;
    }

    public static void main(String[] args) {
        String str1 = "sadbutsad";
        String str2 = "sad";
        String str3 = "leetcode";
        String str4 = "leeto";
        FirstOccurenceInString solution = new FirstOccurenceInString();
        System.out.println("Result For haystack = sadbutsad, needle = sad : " + solution.strStr(str1, str2));
        System.out.println("Result For haystack = leetcode, needle = leeto : " + solution.strStr(str3, str4));
    }

}
