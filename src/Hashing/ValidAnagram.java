
/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!hm.containsKey(ch) || hm.get(ch) == 0) {
                return false;
            }
            hm.put(ch, hm.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "anagram";
        String str2 = "nagaram";
        String str3 = "rat";
        String str4 = "car";
        ValidAnagram solution = new ValidAnagram();
        System.out.println("Result For s = anagram, t = nagaram : " + solution.isAnagram(str1, str2));
        System.out.println("Result For s = rat, t = car : " + solution.isAnagram(str3, str4));
    }

}
