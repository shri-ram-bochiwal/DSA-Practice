/**
 * Given two version numbers, version1 and version2, compare them.
 * Version numbers consist of one or more revisions joined by a dot '.'. Each
 * revision consists of digits and may contain leading zeros. Every revision
 * contains at least one character. Revisions are 0-indexed from left to right,
 * with the leftmost revision being revision 0, the next revision being revision
 * 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.
 * To compare version numbers, compare their revisions in left-to-right order.
 * Revisions are compared using their integer value ignoring any leading zeros.
 * This means that revisions 1 and 001 are considered equal. If a version number
 * does not specify a revision at an index, then treat the revision as 0. For
 * example, version 1.0 is less than version 1.1 because their revision 0s are
 * the same, but their revision 1s are 0 and 1 respectively, and 0 < 1.
 * Return the following:
 * If version1 < version2, return -1.
 * If version1 > version2, return 1.
 * Otherwise, return 0.
 */

public class CompareVersion {

    public int compareVersionNumber(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int i = 0;
        while (i < str1.length && i < str2.length) {
            int num1;
            if (i < str1.length) {
                num1 = Integer.parseInt(str1[i]);
            } else {
                num1 = 0;
            }
            int num2;
            if (i < str2.length) {
                num2 = Integer.parseInt(str2[i]);
            } else {
                num2 = 0;
            }

            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String input1 = "1.01";
        String input2 = "1.001";
        String input3 = "1.0";
        String input4 = "1.0.0";
        String input5 = "0.1";
        String input6 = "1.1";
        CompareVersion solution = new CompareVersion();
        System.out.println("Result For version1 = \"1.01\", version2 =  \"1.001\" : "
                + solution.compareVersionNumber(input1, input2));
        System.out.println("Result For version1 = \"1.0\", version2 =  \"1.0.0\" : "
                + solution.compareVersionNumber(input3, input4));
        System.out.println("Result For version1 = \"0.1\", version2 =  \"1.1\" : "
                + solution.compareVersionNumber(input5, input6));
    }

}
