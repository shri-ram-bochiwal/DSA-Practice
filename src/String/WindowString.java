
/**
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 * The testcases will be generated such that the answer is unique.
*/

import java.util.*;

public class WindowString {

    public String minWindow(String A, String B) {
        HashMap<Character, Integer> Afreq = new HashMap<>();
        HashMap<Character, Integer> Bfreq = new HashMap<>();
        int n = A.length();
        int m = B.length();
        int counter = m;

        for (int i = 0; i < m; i++) {
            Bfreq.put(B.charAt(i), Bfreq.getOrDefault(B.charAt(i), 0) + 1);
        }

        int start = 0;
        int end = 0;
        int right = Integer.MAX_VALUE;
        int left = 0;

        while (end < n) {
            char ch = A.charAt(end);
            if (Bfreq.containsKey(ch)) {
                int count = Bfreq.get(ch) - 1;
                Bfreq.put(ch, count);
                if (count >= 0) {
                    counter--;
                }

                while (counter == 0 && start <= end) {
                    int curr = end - start;
                    if (curr < (right - left)) {
                        left = start;
                        right = end;
                    }

                    char st = A.charAt(start);
                    if (Bfreq.containsKey(st)) {
                        count = Bfreq.get(st) + 1;
                        Bfreq.put(st, count);

                        if (count > 0) {
                            counter++;
                        }
                    }
                    start++;
                }
            }
            end++;
        }

        if (right == Integer.MAX_VALUE) {
            return "";
        }

        return A.substring(left, right + 1);
    }

    public static void main(String[] args) {
        String input1 = "ADOBECODEBANC";
        String input2 = "ABC";

        String input3 = "a";
        String input4 = "aa";

        String input5 = "Aa91b";
        String input6 = "ab";

        WindowString solution = new WindowString();
        System.out.println("Result For A = \"ADOBECODEBANC\", B = \"ABC\" : " + solution.minWindow(input1, input2));
        System.out.println("Result For A = \"a\", B = \"aa\" : " + solution.minWindow(input3, input4));
        System.out.println("Result For A = \"Aa91b\", B = \"ab\" : " + solution.minWindow(input5, input6));
    }

}
