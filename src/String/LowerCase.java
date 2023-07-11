/**
 * Given a string s, return the string after replacing every uppercase letter
 * with the same lowercase letter.
 */

public class LowerCase {

    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "here";
        String str3 = "LOVELY";
        LowerCase solution = new LowerCase();
        System.out.println("Result For s = \"Hello\" : " + solution.toLowerCase(str1));
        System.out.println("Result For s = \"here\" : " + solution.toLowerCase(str2));
        System.out.println("Result For s = \"LOVELY\" : " + solution.toLowerCase(str3));
    }

}
