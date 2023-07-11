/**
 * Given two strings s and goal, return true if and only if s can become goal
 * after some number of shifts on s.
 * A shift on s consists of moving the leftmost character of s to the rightmost
 * position.
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 */

public class RotateString {

    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.deleteCharAt(0);
            sb.append(ch);
            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "cdeab";
        String str3 = "abcde";
        String str4 = "abced";
        RotateString solution = new RotateString();
        System.out.println("Result For s = \"abcde\", goal =  \"cdeab\" : " + solution.rotateString(str1, str2));
        System.out.println("Result For s = \"abcde\", goal =  \"abced\" : " + solution.rotateString(str3, str4));
    }

}
