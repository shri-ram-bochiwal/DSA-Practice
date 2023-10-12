/**
 * Reverse string using recursion with base case 0 and base case n; (dsa4)
 */

public class ReverseString {

    public String reverse(String A) {
        if (A == null || A.length() <= 1) {
            return A;
        }

        return A.charAt(A.length() - 1) + reverse(A.substring(0, A.length() - 1));
    }

    public static void main(String[] args) {
        String str1 = "Geeks for Geeks";
        String str2 = "dsa4";

        ReverseString solution = new ReverseString();
        System.out.println("Result For A = \"Geeks for Geeks\" : " + solution.reverse(str1));
        System.out.println("Result For A = \"dsa4\" : " + solution.reverse(str2));
    }

}
