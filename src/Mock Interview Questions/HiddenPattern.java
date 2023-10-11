/**
 * Given two strings - a text A and a pattern B, having lower-case alphabetic
 * characters. You have to determine the number of occurrences of pattern B in
 * text A as its substring. i.e. the number of times B occurs as a substring in
 * A.
 */

public class HiddenPattern {

    public int solve(final String A, String B) {
        int n = A.length();
        int m = B.length();
        int count = 0;

        for (int i = 0; i < n - m + 1; i++) {
            if (A.charAt(i) == B.charAt(0)) {
                int k = i;
                int l = 0;
                boolean flag = true;

                while (l < m) {
                    if (A.charAt(k) != B.charAt(l)) {
                        flag = false;
                        break;
                    }
                    k++;
                    l++;
                }
                if (flag == true) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str1 = "abababa";
        String str2 = "aba";
        String str3 = "mississipi";
        String str4 = "ss";
        String str5 = "hello";
        String str6 = "hi";

        HiddenPattern solution = new HiddenPattern();
        System.out.println("Result For A = \"abababa\", B = \"aba\" : " + solution.solve(str1, str2));
        System.out.println("Result For A = \"mississipi\", B = \"ss\" : " + solution.solve(str3, str4));
        System.out.println("Result For A = \"hello\", B = \"hi\" : " + solution.solve(str5, str6));
    }

}
